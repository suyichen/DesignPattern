package com.example.suyichen.observer.demo1;

import java.util.Observable;
import java.util.Observer;

/**
 * @author suyichen
 */
public class Parents implements Observer {

    @Override
    public void update(Observable o, Object arg) {
         System.out.println((String)arg);
         System.out.println("Parents go to check.");
    }
}
