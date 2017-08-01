package com.jinternals.go4.observer;

/**
 * Created by mradul on 31/07/17.
 */
public class Topic extends AbstractObserver<Message> {

    public void publish(Message message){
        notifySubscribers(message);
    }

    @Override
    public void notifySubscribers(Message message) {
        getSubscriber().forEach(lister->{lister.onMessage(message);});
    }

}
