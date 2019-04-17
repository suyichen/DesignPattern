package com.example.suyichen.observer.demo3;

/**
 * @author suyichen
 */
public interface SubjectListener {
    public void registerObserver(ObserverListener observerListener);
    public void notifyData();
    public void removeObserver(ObserverListener observerListener);
}
