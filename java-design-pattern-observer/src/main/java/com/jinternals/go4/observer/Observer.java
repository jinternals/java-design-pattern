package com.jinternals.go4.observer;

/**
 * Created by mradul on 31/07/17.
 */
public interface Observer<T> {
    void subscribe(Subscriber<T> subscriber);
    void unSubscribe(Subscriber<T> subscriber);
}

