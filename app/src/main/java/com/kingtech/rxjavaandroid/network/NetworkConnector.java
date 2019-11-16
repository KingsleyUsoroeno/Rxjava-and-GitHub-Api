package com.kingtech.rxjavaandroid.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkConnector {

    private static Retrofit retrofit;
    private static Gson gson;

    private static synchronized Retrofit getRetrofitInstance() {

        if (retrofit == null || gson == null) {
            gson = new GsonBuilder().setLenient().create();

            String BASE_URL = "https://api.github.com/";
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();

        }
        return retrofit;
    }

    public static GitHubService getService() {
        return getRetrofitInstance().create(GitHubService.class);
    }
}
