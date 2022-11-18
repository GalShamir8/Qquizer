package com.example.quizer.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.quizer.R;
import com.google.android.material.button.MaterialButton;

public class SplashActivity extends AppCompatActivity {
    private MaterialButton splash_BTN_getStarted;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initViews();
        setListeners();
    }

    private void setListeners() {
        splash_BTN_getStarted.setOnClickListener(e -> OpenLoginActivity());
    }

    private void OpenLoginActivity() {
        startActivity(new Intent(this, LoginActivity.class));
    }

    private void initViews() {
        splash_BTN_getStarted = findViewById(R.id.splash_BTN_getStarted);
    }
}