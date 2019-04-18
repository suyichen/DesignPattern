package com.example.suyichen.observer.demo3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author suyichen
 */
public class Test {
    public static void main(String[] args) {


        ObserverExample observer1 = new ObserverExample("firstSubject");
        ObserverExample observer2 = new ObserverExample("SecondSubject");
        ObserverExample observer3 = new ObserverExample("ThirdSubject");

        List<ObserverListener> list = new ArrayList<>();

        list.add(observer1);
        list.add(observer2);
        list.add(observer3);

        SubjectExample subject = new SubjectExample(list);

        subject.setMessage("It's sunny today");
        subject.notifyData();

    }
}
