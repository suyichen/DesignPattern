package com.example.suyichen.observer.demo2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.suyichen.designpattern.R;

/**
 * @author suyichen
 */
public class FirstObserverActivity extends Activity implements ObserverListener{
    private static final String TAG = "Observer";
    private Button button_to_second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer_first);
        button_to_second = findViewById(R.id.bt_first_observer);

        ObserverManager.getInstance().addObserver(this);

        button_to_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstObserverActivity.this,SecondObserverActivity.class));
            }
        });
    }

    @Override
    public void updateData(String content) {
        Log.e(TAG,"first observer activity to update data");
    }
}
