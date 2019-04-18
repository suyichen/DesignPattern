package com.example.suyichen.observer.demo4;

/**
 * @author suyichen
 */
public class Mouse extends EventListener {

    public void click(){
        System.out.println("Mouse :: Click");
        this.trigger(MouseEventType.MOUSE_CLICK);
    }

    public void doubleClick(){
        System.out.println("Mouse :: Double Click");
        this.trigger(MouseEventType.MOUSE_DOUBLE_CLICK);
    }

    public void move(){
        System.out.println("Mouse :: MOVE");
        this.trigger(MouseEventType.MOUSE_MOVE);
    }
}
