package com.kingtech.rxjavaandroid.presenter;

import android.util.Log;
import android.view.View;

import com.kingtech.rxjavaandroid.network.NetworkConnector;
import com.kingtech.rxjavaandroid.network.User;
import com.kingtech.rxjavaandroid.network.model.GitHubUserResponse;

import java.util.List;
import java.util.stream.Collectors;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class UserPresenter {

    private static final String TAG = "UserPresenter";
    private UserView userView;

    public UserPresenter(UserView userView) {
        this.userView = userView;
    }

    public void loadResult(String userName, final CallBack<List<User>> callback) {

        if (userName.equals("")) return;

        userView.showProgressBar();
        NetworkConnector.getService().getUserRepo(userName)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<List<GitHubUserResponse>>() {
                    @Override
                    public void onCompleted() {
                        userView.dismissProgressBar();
                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.returnError(e.getMessage());
                        Log.i(TAG, "onError: " + e.getMessage());
                        userView.dismissProgressBar();
                    }

                    @Override
                    public void onNext(List<GitHubUserResponse> gitHubUserResponses) {
                        if (gitHubUserResponses.isEmpty()) {
                            userView.showNoRepoFound().setVisibility(View.VISIBLE);
                            userView.hideRecyclerView();
                            return;
                        }
                        userView.showNoRepoFound().setVisibility(View.GONE);
                        userView.showRecyclerView();
                        callback.returnResult(getUserFromGitRes(gitHubUserResponses));
                    }
                });
    }

    private List<User> getUserFromGitRes(List<GitHubUserResponse> responses) {
        return responses.stream().map(res -> new User(res.getOwner().getUserName(), res.getOwner().getAvatarUrl(), res.getName()))
                .collect(Collectors.toList());
    }
}
