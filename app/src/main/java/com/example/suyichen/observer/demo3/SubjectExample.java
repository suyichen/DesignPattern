package com.example.suyichen.observer.demo3;

import java.util.List;

/**
 * @author suyichen
 */
public class SubjectExample implements SubjectListener{

    private List<ObserverListener> observers;
    private String message;

    public SubjectExample(List<ObserverListener> observers){
        this.observers = observers;
    }

    public void setMessage(String message){
        this.message = message;
    }

    @Override
    public void registerObserver(ObserverListener observerListener) {
        observers.add(observerListener);
    }

    @Override
    public void notifyData() {
        for (ObserverListener observerListener : observers){
            observerListener.sendMessage(message);
        }
    }

    @Override
    public void removeObserver(ObserverListener observerListener) {
        if (observers != null){
            observers.remove(observerListener);
        }
    }
}
