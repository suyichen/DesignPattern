package com.example.suyichen.singleton;

/**
 * @author suyichen
 */
public class FullBase {
    private static FullBase mFullBase = null;
    private FullBase(){}
    public static FullBase getInstance(){
        if (mFullBase == null){
            mFullBase = new FullBase();
        }
        return mFullBase;
    }
}
