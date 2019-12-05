package com.example.singletontest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Switch switchBtn = findViewById(R.id.switch1);
        switchBtn.setOnCheckedChangeListener((new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "on", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "off", Toast.LENGTH_SHORT).show();
                }
            }
        }));

        Intent i = new Intent(this, SecondActivity.class);
        startActivity(i);
    }
}