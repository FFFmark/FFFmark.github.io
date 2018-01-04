package com.example.a50442.mypro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by 50442 on 2018/1/4.
 */

public class FlashActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flash);
        Timer timer = new Timer();
        timer.schedule(new MyTask(),3000);
    }
    class MyTask extends TimerTask {
        @Override
        public void run() {
            Intent intent = new Intent(FlashActivity.this,MainActivity.class);
            startActivity(intent);
        }
    }
}
