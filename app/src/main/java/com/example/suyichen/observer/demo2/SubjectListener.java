package com.example.suyichen.observer.demo2;

/**
 * @author suyichen
 */
public interface SubjectListener {
    void addObserver(ObserverListener observerListener);
    void notifyObserver(String content);
    void removeObserver(ObserverListener observerListener);
}
