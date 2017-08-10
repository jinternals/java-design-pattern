package com.jinternals.go4.singleton;

/**
 * Created by mradul on 01/08/17.
 */
public final class Counter {

    private static final Counter counter = new Counter();

    private int count;

    private Counter() {
        if (counter != null) {
            throw new IllegalStateException("Instance already created.");
        }
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public static Counter getCounter() {
        return counter;
    }

}
