package com.example.quizer.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.quizer.R;
import com.google.android.material.button.MaterialButton;

public class BuildQuizActivity extends AppCompatActivity {
    private Bundle data;
    private MaterialButton build_BTN_addQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_build_quiz);
        initViews();
        setListeners();
        data = getIntent().getExtras();
    }

    private void setListeners() {
        build_BTN_addQuestion.setOnClickListener(e -> addQuestion());
    }

    private void addQuestion() {

    }

    private void initViews() {
        // TODO add once UI implemented
//        build_BTN_addQuestion = findViewById(R.id.build_BTN_addQuestion);
    }
}