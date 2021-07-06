package com.example.spreader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialization();
    }

    private void initialization(){
        EditText editText_name = findViewById(R.id.editTextTextPersonName);
        EditText editText_age = findViewById(R.id.editTextTextAge);
        TextView textVie_name = findViewById(R.id.name);
        TextView textVie_age = findViewById(R.id.age);
        Button button = findViewById(R.id.button);
    }

}