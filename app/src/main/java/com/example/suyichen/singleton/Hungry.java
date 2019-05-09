package com.example.suyichen.singleton;

/**
 * @author suyichen
 */
public class Hungry {

    private static Hungry mHungry = new Hungry();

    private Hungry(){}

    public static Hungry getInstance(){
        return mHungry;
    }

    public void getName(){
        System.out.println("Hungry : get name");
    }
}
