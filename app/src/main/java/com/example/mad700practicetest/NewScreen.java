package com.example.mad700practicetest;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class NewScreen extends AppCompatActivity
{
    Button btnExit, btnClear;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_newscreen);

        btnExit = findViewById(R.id.btnExit);
        btnClear = findViewById(R.id.btnClear);

        btnExit.setOnClickListener(v->{});

        btnClear.setOnClickListener(v->{});

    }
}
