package com.example.suyichen.singleton;

/**
 * @author suyichen
 */
public class SingletonClass {

    private static class SingletonHolder{
        private static SingletonClass mSingletonClass = new SingletonClass();
    }

    private SingletonClass(){}

    public static SingletonClass getInstance(){
        return SingletonHolder.mSingletonClass;
    }
}
