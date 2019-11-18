package com.kingtech.rxjavaandroid;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.kingtech.rxjavaandroid.network.User;
import com.kingtech.rxjavaandroid.presenter.Callback;

import java.util.List;

public class UserViewModel extends ViewModel {

    private UserRepository repository;
    private MutableLiveData<Boolean> loadingLiveData = new MutableLiveData<>();
    private MutableLiveData<List<User>> usersLiveData = new MutableLiveData<>();
    private MutableLiveData<String> error = new MutableLiveData<>();

    public UserViewModel(UserRepository userRepository) {
        this.repository = userRepository;
    }

    public void getData(String userName) {
        repository.fetchData(userName, new Callback<List<User>>() {
            @Override
            public void isLoading(boolean isLoading) {
                loadingLiveData.setValue(isLoading);
            }

            @Override
            public void Success(List<User> users) {
                usersLiveData.setValue(users);
            }

            @Override
            public void Error(String message) {
                error.setValue(message);
            }
        });
    }

    public LiveData<Boolean> getLoadingLiveData() {
        return loadingLiveData;
    }

    public LiveData<List<User>> getUsersLiveData() {
        return usersLiveData;
    }

    public LiveData<String> getError() {
        return error;
    }
}

class ViewModelFactoryProvider implements ViewModelProvider.Factory {

    private UserRepository userRepository;

    public ViewModelFactoryProvider(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(UserViewModel.class)) {
            return (T) new UserViewModel(userRepository);
        } else {
            throw new IllegalArgumentException("Unknown viewModel");
        }
    }
}
