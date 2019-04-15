package com.example.suyichen.observer.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author suyichen
 */
public class ObserverManager implements SubjectListener{

    private static ObserverManager observerManager;
    private List<ObserverListener> observerList = new ArrayList<>();

    public static ObserverManager getInstance(){
        if (observerManager == null){
            synchronized (ObserverManager.class){
                if (observerManager == null){
                    observerManager = new ObserverManager();
                }
            }
        }
        return observerManager;
    }

    @Override
    public void addObserver(ObserverListener observerListener) {
        observerList.add(observerListener);
    }

    @Override
    public void notifyObserver(String content) {
        for (ObserverListener observerListener : observerList){
            observerListener.updateData(content);
        }
    }

    @Override
    public void removeObserver(ObserverListener observerListener) {
        if (observerList.contains(observerListener)){
            observerList.remove(observerListener);
        }
    }
}
