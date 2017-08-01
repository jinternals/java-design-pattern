package com.jinternals.go4.observer;

/**
 * Created by mradul on 31/07/17.
 */
public interface Subscriber<T> {

    void onMessage(T object);

}
