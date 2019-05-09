package com.example.suyichen.singleton;

/**
 * @author suyichen
 */
public class FullSync {

    private static FullSync mFullSync = null;

    private FullSync(){}

    public static synchronized FullSync getInstance(){
        if (mFullSync == null){
            mFullSync = new FullSync();
        }
        return mFullSync;
    }
}
