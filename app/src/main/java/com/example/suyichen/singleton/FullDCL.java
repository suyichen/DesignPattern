package com.example.suyichen.singleton;

/**
 * @author suyichen
 */
public class FullDCL {

    private static volatile FullDCL mFullDCL = null;

    private FullDCL(){}

    public static FullDCL getInstance(){
        if (mFullDCL == null){
            synchronized (FullDCL.class){
                if (mFullDCL == null){
                    mFullDCL = new FullDCL();
                }
            }
        }
        return mFullDCL;
    }
}
