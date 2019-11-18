package com.kingtech.rxjavaandroid;

import com.kingtech.rxjavaandroid.network.NetworkConnector;
import com.kingtech.rxjavaandroid.network.User;
import com.kingtech.rxjavaandroid.network.model.GitHubUserResponse;
import com.kingtech.rxjavaandroid.presenter.Callback;

import java.util.List;
import java.util.stream.Collectors;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class UserRepository {

    public void fetchData(String userName, Callback<List<User>> usersCallback) {
        /*state loading*/
        usersCallback.isLoading(true);

        NetworkConnector.getService().getUserRepo(userName).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<GitHubUserResponse>>() {
                    @Override
                    public void onCompleted() {
                        /*state done loading/completed*/
                        usersCallback.isLoading(false);
                    }

                    @Override
                    public void onError(Throwable e) {
                        /*state Error/completed loading*/
                        usersCallback.Error(e.getMessage());
                        usersCallback.isLoading(false);
                    }

                    @Override
                    public void onNext(List<GitHubUserResponse> responses) {
                        /*state completed and successful*/
                        usersCallback.Success(getUserFromGitRes(responses));
                        usersCallback.isLoading(false);
                    }
                });
    }

    private List<User> getUserFromGitRes(List<GitHubUserResponse> responses) {
        return responses.stream().map(res -> new User(res.getOwner().getUserName(), res.getOwner().getAvatarUrl(), res.getName()))
                .collect(Collectors.toList());
    }
}
