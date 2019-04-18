package com.example.suyichen.observer.demo4;

import java.lang.reflect.Method;

/**
 * @author suyichen
 */
public class Event {

    private Object source;
    private Object target;
    private Method callback;
    private String trigger;
    private long triggerTime;


    public Event(Object target, Method callback){
        this.target = target;
        this.callback = callback;
    }

    Event setSource(Object source) {
        this.source = source;
        return this;
    }

    public Object getSource(){
        return source;
    }

    public Object getTarget(){
        return target;
    }

    public void setCallback(Method callback) {
        this.callback = callback;
    }

    public Method getCallback(){
        return callback;
    }

    protected void setTriggerTime(long triggerTime){
        this.triggerTime = triggerTime;
    }

    public long getTriggerTime() {
        return triggerTime;
    }

    Event setTrigger(String trigger){
        this.trigger = trigger;
        return this;
    }

    public String getTrigger(){
        return trigger;
    }

    @Override
    public String toString() {
        return "Event{"+
                "\t source" + source +
                "\t target" + target +
                "\t callback" + callback +
                "\t trigger" + trigger +
                "}";
    }
}
