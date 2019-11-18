package com.kingtech.rxjavaandroid.presenter;

public abstract class Callback<T> {

    public abstract void isLoading(boolean isLoading);

    public abstract void Success(T t);

    public abstract void Error(String message);
}
