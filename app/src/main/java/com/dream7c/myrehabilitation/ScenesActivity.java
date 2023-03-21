package com.dream7c.myrehabilitation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ScenesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scenes);
        setTitle(MainActivity.targetActivityTitle);
    }
}
