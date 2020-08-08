package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {

    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        Log.i("LifeCycle","onCreate() invoked");
        textView2= findViewById(R.id.textView2);
        textView2.setText(R.string.Msg2);
    }
    public void onStart() {

        super.onStart();
        Log.i("LifeCycle","onCreate() invoked");
    }
    public void onRestart() {

        super.onRestart();
        Log.i("LifeCycle","onRestart() invoked");
    }
    public void onResume() {

        super.onResume();
        Log.i("LifeCycle","onResume() invoked");
    }
}