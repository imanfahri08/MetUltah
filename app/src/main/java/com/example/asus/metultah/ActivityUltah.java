package com.example.asus.metultah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class ActivityUltah extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ultah);
        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // TODO Auto-generated method stub
                Intent explicit_intent = new Intent(ActivityUltah.this,
                        Undangan.class);
                startActivity(explicit_intent);
            }
    });

    }}


