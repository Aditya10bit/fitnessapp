package com.example.foodtrackingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class SecondActivity extends AppCompatActivity {
    GoogleSignInClient gsc;
    GoogleSignInOptions gso;
    TextView t1;
    TextView t2;
    TextView t0;
    TextView t3;
    TextView t4;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
         ConstraintLayout constraintLayout = findViewById(R.id.secondLayout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();
        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        gsc = GoogleSignIn.getClient(this, gso);
        t0 = findViewById(R.id.textView47);
        t1 = findViewById(R.id.textView49);
        t2 = findViewById(R.id.textView48);
        t3=findViewById(R.id.calorie);
        t4=findViewById(R.id.gymbuddy);
        b1 = findViewById(R.id.button7);
        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
        if (acct != null) {
            String personName = acct.getDisplayName();
            String personEmail = acct.getEmail();
            t0.setText("Hey  "+personName+"  THANK YOU FOR SIGNING IN OUR APP");
            t1.setText(personName);
            t2.setText(personEmail);
        }
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SecondActivity.this, "SIGNING YOU OUT...", Toast.LENGTH_SHORT).show();
                signOut();


            }
        });

        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SecondActivity.this, "LOADING", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SecondActivity.this,CalActivity.class);
                startActivity(intent);
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SecondActivity.this, "LOADING", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SecondActivity.this,GymActivity.class);
                startActivity(intent);
            }
        });
    }

    void signOut() {
        gsc.signOut().addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(Task<Void> task) {
            finish();
            startActivity(new Intent(SecondActivity.this,Signin.class));
            }
        });
    }
}