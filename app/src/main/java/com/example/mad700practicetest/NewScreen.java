package com.example.mad700practicetest;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class NewScreen extends AppCompatActivity
{
    Button btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_newscreen);

        btnExit = findViewById(R.id.btnExit);

        btnExit.setOnClickListener(v->{});

    }
}
