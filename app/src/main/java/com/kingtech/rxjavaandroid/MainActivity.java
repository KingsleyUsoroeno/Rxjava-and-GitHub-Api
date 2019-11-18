package com.kingtech.rxjavaandroid;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;

import com.kingtech.rxjavaandroid.databinding.ActivityMainBinding;
import com.kingtech.rxjavaandroid.network.User;
import com.kingtech.rxjavaandroid.presenter.Callback;
import com.kingtech.rxjavaandroid.presenter.UserPresenter;
import com.kingtech.rxjavaandroid.presenter.UserView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements UserView {

    private static final String TAG = "MainActivity";
    private ActivityMainBinding viewBinding;
    private UserPresenter userPresenter;
    private UserViewModel userViewModel;
    private ViewModelFactoryProvider viewModelFactoryProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        userPresenter = new UserPresenter(this);

        final SearchView searchView = findViewById(R.id.searchView);
        viewModelFactoryProvider = new ViewModelFactoryProvider(new UserRepository());
        userViewModel = ViewModelProviders.of(this, viewModelFactoryProvider).get(UserViewModel.class);
        initLiveDataObservers();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                //setAdapter(query);
                userViewModel.getData(query);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return true;
            }
        });
    }

    @Override
    public void dismissProgressBar() {
        viewBinding.progressBar.setVisibility(View.GONE);
    }

    @Override
    public void showProgressBar() {
        viewBinding.progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public View showNoRepoFound() {
        return viewBinding.textNoRepo;
    }

    @Override
    public void hideRecyclerView() {
        viewBinding.userRecyclerView.setVisibility(View.GONE);
    }

    @Override
    public void showRecyclerView(List<User> users) {
        viewBinding.userRecyclerView.setVisibility(View.VISIBLE);
        viewBinding.userRecyclerView.addItemDecoration(new DividerItemDecoration(MainActivity.this,
                DividerItemDecoration.VERTICAL));
        UserAdapter adapter = new UserAdapter();
        adapter.setData(users);
        viewBinding.userRecyclerView.setAdapter(adapter);
    }

    private void setAdapter(String userName) {
        userPresenter.loadResult(userName, new Callback<List<User>>() {

            @Override
            public void isLoading(boolean isLoading) {
                if (isLoading) {
                    showProgressBar();
                } else {
                    dismissProgressBar();
                }
            }

            @Override
            public void Success(List<User> users) {
                if (users.isEmpty()) {
                    viewBinding.textNoRepo.setVisibility(View.VISIBLE);
                    hideRecyclerView();
                    return;
                }
                viewBinding.textNoRepo.setVisibility(View.GONE);
                showRecyclerView(users);
            }

            @Override
            public void Error(String message) {
                Log.i(TAG, "Error: " + message);
                dismissProgressBar();
            }
        });
    }

    private void initLiveDataObservers() {
        userViewModel.getLoadingLiveData().observe(this, aBoolean -> {
            if (aBoolean) {
                showProgressBar();
            } else {
                dismissProgressBar();
            }
        });

        userViewModel.getUsersLiveData().observe(this, users -> {
            if (users.isEmpty()) {
                viewBinding.textNoRepo.setVisibility(View.VISIBLE);
                hideRecyclerView();
                return;
            }
            viewBinding.textNoRepo.setVisibility(View.GONE);
            showRecyclerView(users);
        });

        userViewModel.getError().observe(this, s -> Log.i(TAG, "Error from fetching data: " + s));
    }
}
