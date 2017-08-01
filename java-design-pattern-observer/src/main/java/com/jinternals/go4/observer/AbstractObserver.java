package com.jinternals.go4.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mradul on 01/08/17.
 */
public abstract class AbstractObserver<T> implements Observer {

    private List<Subscriber<T>> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Subscriber listener) {
        subscribers.add(listener);
    }

    @Override
    public void unSubscribe(Subscriber listener) {
        subscribers.remove(listener);
    }

    public List<Subscriber<T>> getSubscriber() {
        return subscribers;
    }

    public abstract void notifySubscribers(T t);
}
