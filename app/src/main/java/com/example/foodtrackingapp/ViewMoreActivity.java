package com.example.foodtrackingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ViewMoreActivity extends AppCompatActivity {
    ImageView ayr;
    ImageView ytr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_more);
        ayr=findViewById(R.id.imageView11);
        ayr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ViewMoreActivity.this,"REDIRECTING....",Toast.LENGTH_SHORT).show();
                gotoUrl("https://timesofindia.indiatimes.com/life-style/health-fitness/home-remedies/5-ayurvedic-herbal-drinks-you-must-have-to-stay-fit/photostory/71294148.cms");

            }
        });
        ytr=findViewById(R.id.imageView12);
        ytr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ViewMoreActivity.this,"REDIRECTING....",Toast.LENGTH_SHORT).show();
                gotoUrl("https://youtu.be/yZSH8MUZ3xA");
            }
        });
    }

private void gotoUrl(String s){
    Uri uri = Uri.parse(s);
    startActivity(new Intent(Intent.ACTION_VIEW,uri));
}
}