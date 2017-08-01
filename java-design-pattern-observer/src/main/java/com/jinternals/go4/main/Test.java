package com.jinternals.go4.main;

import com.jinternals.go4.observer.Message;
import com.jinternals.go4.observer.TestSubscriber;
import com.jinternals.go4.observer.Topic;

import java.util.Collections;

/**
 * Created by mradul on 31/07/17.
 */
public class Test {

    public static void main(String[] args) {

        Topic topic = new Topic();

        topic.subscribe(new TestSubscriber("sub-1"));
        topic.subscribe(new TestSubscriber("sub-2"));
        topic.subscribe(new TestSubscriber("sub-3"));

        topic.publish(new Message("some-id", Collections.emptyMap(),Collections.emptyMap()));

    }

}
