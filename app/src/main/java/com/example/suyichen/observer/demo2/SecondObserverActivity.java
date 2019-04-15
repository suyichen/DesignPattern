package com.example.suyichen.observer.demo2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.suyichen.designpattern.R;

/**
 * @author suyichen
 */
public class SecondObserverActivity extends Activity implements ObserverListener {
    private static final String TAG = "Observer";
    private Button button_notify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer_second);
        ObserverManager.getInstance().addObserver(this);
        button_notify = findViewById(R.id.bt_second_observer);
        button_notify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObserverManager.getInstance().notifyObserver("notify data...");
            }
        });
    }

    @Override
    public void updateData(String content) {
        Log.e(TAG,"second observer activity to update data");
    }
}
