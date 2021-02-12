package com.example.myprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityJB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button toMain = (Button) findViewById(R.id.backToMain);
               toMain.setOnClickListener(new view.OnClickListener(){
            @Override
            public void onClick(View v) {
               finish();
            }
        });

    }
}