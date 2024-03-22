package com.example.foodtrackingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class DrinksActivity extends AppCompatActivity {

    Button b3;
    Button b4;
    Button b5;
    Button b6;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);
        VideoView f= findViewById(R.id.fruits);
        f.setVideoPath("android.resource://"+getPackageName()+ "/"+R.raw.o);
        f.start();
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b5=findViewById(R.id.button5);
        b6=findViewById(R.id.button6);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DrinksActivity.this, "PLEASE WAIT. .", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent (DrinksActivity.this,ClearSkinActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DrinksActivity.this, "PLEASE WAIT..", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent (DrinksActivity.this,LDetox.class);
                startActivity(intent);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DrinksActivity.this, "PLEASE WAIT..", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent (DrinksActivity.this,WeightLossActivity.class);
                startActivity(intent);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DrinksActivity.this, "PLEASE WAIT..", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent (DrinksActivity.this,BulkUpActivity.class);
                startActivity(intent);
            }
        });
        t=findViewById(R.id.textView39);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DrinksActivity.this, "PLEASE WAIT..", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DrinksActivity.this,ViewMoreActivity.class);
                startActivity(intent);
            }
        });

    }
}