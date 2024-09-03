package com.example.mad700practicetest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity
{
    static Button BTNexit, BTNsave, btnsavedNotes;
    static TextView savedTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        BTNexit = findViewById(R.id.btnExit);
        BTNsave = findViewById(R.id.btnSave);
        btnsavedNotes = findViewById(R.id.btnsavedNotes);

        savedTextView = findViewById(R.id.saveTextView);

//        BTNsave.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });

        //exists the application
        BTNexit.setOnClickListener(v->
        {

            Toast.makeText(this, "You have EXITED", Toast.LENGTH_LONG ).show();
            System.out.println("You have Exited");
        });

        //saves the notes
        BTNsave.setOnClickListener(v->
        {
            SharedPreferences storeText = getSharedPreferences("savedTEXTS", MODE_PRIVATE);
            storeText = (SharedPreferences) savedTextView;
            Toast.makeText(this, "Your notes are saved", Toast.LENGTH_LONG ).show();
        });

        //move from the main page to the new screen
        btnsavedNotes.setOnClickListener(v->
        {
            Intent intent = new Intent(this, NewScreen.class);
            startActivity(intent);
            Toast.makeText(this, "Saved Notes", Toast.LENGTH_LONG ).show();
        });

    }


}


