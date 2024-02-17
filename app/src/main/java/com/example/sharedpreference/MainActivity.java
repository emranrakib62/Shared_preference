package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button buttonsave,button;
    EditText editText;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        buttonsave=findViewById(R.id.buttonsave);
        editText=findViewById(R.id.editText);
        sharedPreferences=getSharedPreferences (getString(R.string.app_name),MODE_PRIVATE);
         editor=sharedPreferences.edit();






        buttonsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name=editText.getText().toString();
               editor.putString("name",""+name);
               editor.apply();


            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(MainActivity.this,MainActivity2.class));

            }
        });


    }
}