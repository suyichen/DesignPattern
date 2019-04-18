package com.example.suyichen.observer.demo4;

import java.lang.reflect.Method;

/**
 * @author suyichen
 */
public class MouseTest {
    public static void main(String[] args) {

        Mouse mouse = new Mouse();
        MouseEventCallBack callBack = new MouseEventCallBack();
        Method onClick;

        try {
            onClick = callBack.getClass().getMethod("onClick", Event.class);
            System.out.println(onClick.toString());
            mouse.addListener(MouseEventType.MOUSE_CLICK, callBack, onClick);

            Method onDoubleClick = callBack.getClass().getMethod("onDoubleClick", Event.class);
            mouse.addListener(MouseEventType.MOUSE_DOUBLE_CLICK, callBack, onDoubleClick);

            mouse.click();
            mouse.doubleClick();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}
