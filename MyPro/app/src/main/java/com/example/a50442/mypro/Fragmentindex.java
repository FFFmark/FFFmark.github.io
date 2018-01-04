package com.example.a50442.mypro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by 50442 on 2018/1/2.
 */

public class Fragmentindex extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);

    }
    public void dlwcView(View v){
        Intent intent=new Intent();
        intent.setClass(Fragmentindex.this, MainActivity.class);
        Fragmentindex.this.startActivity(intent);
    }
}
