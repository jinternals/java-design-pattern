package com.jinternals.go4.observer;

/**
 * Created by mradul on 01/08/17.
 */
public class TestSubscriber implements Subscriber<Message> {

    private String id;

    public TestSubscriber(String id){
        this.id = id;
    }

    @Override
    public void onMessage(Message message) {
        System.out.println(id+" : "+message.getId());
    }

}
