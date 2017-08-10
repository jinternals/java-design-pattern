package com.jinternals.go4.main;

import com.jinternals.go4.singleton.Counter;

/**
 * Created by mradul on 01/08/17.
 */
public class Main {

    public static void main(String[] args) {

        Counter counter = Counter.getCounter();

        counter.increment();

        System.out.println("Counter value : "+ counter.getCount());

    }
}
