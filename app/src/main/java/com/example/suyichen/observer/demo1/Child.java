package com.example.suyichen.observer.demo1;

import java.util.Observable;

/**
 * @author suyichen
 */
public class Child extends Observable {

    public void notifyParents(String str) {
        System.out.println("The child is crying.");
        setChanged();
        notifyObservers(str);
    }

}
