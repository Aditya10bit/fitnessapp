package com.example.foodtrackingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private long backPresExit;
    private Toast backToast;
    TextView text;
     TextView text1;
     TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout constraintLayout = findViewById(R.id.MainLayout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();
        Toast.makeText(MainActivity.this, "CREATED BY ADITYA", Toast.LENGTH_SHORT).show();
        Button button =findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "LOADING YOUR VEGETERIAN DIET CHART", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent (MainActivity.this,VegActivity.class);
                startActivity(intent);

            }
        });
        Button button1=findViewById(R.id.button1);
       button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(MainActivity.this, "LOADING YOUR NON-VEGETERIAN DIET CHART", Toast.LENGTH_SHORT).show();
               Intent intent = new Intent (MainActivity.this,NonvegActivity.class);
               startActivity(intent);
           }
       });
        Button button2 =findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "LOADING THE BEST DRINKS FOR YOUR HEALTH", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent (MainActivity.this,DrinksActivity.class);
                startActivity(intent);

            }
        });



       text=findViewById(R.id.inTouch);
       text.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent (MainActivity.this,GetInTouch.class);
               startActivity(intent);
           }
       });
       text1=findViewById(R.id.textView40);
       text1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this,Signin.class);
               startActivity(intent);
           }
       });
       text2=findViewById(R.id.textView44);
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "PLEASE SIGN IN TO ACCESS ", Toast.LENGTH_SHORT).show();
            }
        });

    }



    @Override
    public void onBackPressed() {
      //  super.onBackPressed();
        if(backPresExit + 2000> System.currentTimeMillis()){
            super.onBackPressed();
            backToast.cancel();
            finish();
            //return;
        }
        else{
            backToast=Toast.makeText(getBaseContext(),"PRESS AGAIN TO EXIT",Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPresExit = System.currentTimeMillis();
    }
}