package com.example.suyichen.observer;

/**
 * @author suyichen
 */
public class SimpleTest {

    public static void main(String[] args) {

        Child mChild = new Child();
        Parents mParents = new Parents();

        mChild.addObserver(mParents);
        mChild.notifyParents("Child is Bad.");
    }
}
