package com.kingtech.rxjavaandroid.network;

import com.kingtech.rxjavaandroid.network.model.GitHubUserResponse;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface GitHubService {

    @GET("users/{username}/repos")
    Observable<List<GitHubUserResponse>> getUserRepo(@Path("username") String username);
}
