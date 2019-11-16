package com.kingtech.rxjavaandroid;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.DividerItemDecoration;

import com.kingtech.rxjavaandroid.databinding.ActivityMainBinding;
import com.kingtech.rxjavaandroid.network.User;
import com.kingtech.rxjavaandroid.presenter.CallBack;
import com.kingtech.rxjavaandroid.presenter.UserPresenter;
import com.kingtech.rxjavaandroid.presenter.UserView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements UserView {

    private static final String TAG = "MainActivity";
    private ActivityMainBinding viewBinding;
    private UserPresenter userPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        userPresenter = new UserPresenter(this);

        final SearchView searchView = findViewById(R.id.searchView);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                setAdapter(query);
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
    public void showRecyclerView() {
        viewBinding.userRecyclerView.setVisibility(View.VISIBLE);
    }

    private void setAdapter(String userName) {
        userPresenter.loadResult(userName, new CallBack<List<User>>() {
            @Override
            public void returnResult(List<User> users) {
                viewBinding.userRecyclerView.addItemDecoration(new DividerItemDecoration(MainActivity.this,
                        DividerItemDecoration.VERTICAL));
                UserAdapter adapter = new UserAdapter();
                adapter.setData(users);
                viewBinding.userRecyclerView.setAdapter(adapter);
            }

            @Override
            public void returnError(String message) {
                Log.i(TAG, "returnError: " + message);
            }
        });
    }
}
