package com.example.suyichen.observer.demo3;

/**
 * @author suyichen
 */
public class ObserverExample implements ObserverListener{

    private String message;
    private String observerId;

    public ObserverExample(String observerId){
        this.observerId = observerId;
    }

    @Override
    public void sendMessage(String message) {
        this.message = message;
        System.out.println(observerId + " accept message : " + message);
    }
}
