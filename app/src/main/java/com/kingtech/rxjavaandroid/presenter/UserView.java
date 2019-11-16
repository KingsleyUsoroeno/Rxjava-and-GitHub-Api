package com.kingtech.rxjavaandroid.presenter;

import android.view.View;

public interface UserView {

    void dismissProgressBar();

    void showProgressBar();

    View showNoRepoFound();

    void hideRecyclerView();

    void showRecyclerView();

}
