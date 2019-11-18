package com.kingtech.rxjavaandroid.presenter;

import android.view.View;

import com.kingtech.rxjavaandroid.network.User;

import java.util.List;

public interface UserView {

    void dismissProgressBar();

    void showProgressBar();

    View showNoRepoFound();

    void hideRecyclerView();

    void showRecyclerView(List<User> users);

}
