package com.example.suyichen.observer.demo4;

/**
 * @author suyichen
 */
public class MouseEventCallBack {

    public void onClick(Event e){
        System.out.println("Mouse ===> Click");
    }

    public void onDoubleClick(Event e){
        System.out.println("Mouse ===> Double Click");
    }

    public void onMove(Event e){
        System.out.println("Mouse ===> Move");
    }
}
