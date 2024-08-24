package com.example.mad700practicetest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity
{
    static Button BTNexit, BTNsave;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        BTNexit = findViewById(R.id.btnExit);
        BTNsave = findViewById(R.id.btnSave);

//        BTNsave.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });


    }


    //Button to exit the second page
    public void exitClick(View view)
    {
        System.out.println("You have Exited");
    }

    //Button to save the text from the user
    public void saveClick(View view)
    {
        SharedPreferences storeText = getSharedPreferences("savedTEXTS", MODE_PRIVATE);

    }

    //Button to move from page 1 to page 2
    public void savedNotesClick(View view)
    {
        Intent intent = new Intent(this, NewScreen.class);
        startActivity(intent);
    }
}


