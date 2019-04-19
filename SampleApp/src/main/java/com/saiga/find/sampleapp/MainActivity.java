package com.saiga.find.sampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button trigger = findViewById(R.id.button);
        trigger.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,Calendar.getInstance().getTime().toString(),Toast.LENGTH_SHORT).show();
    }
}
