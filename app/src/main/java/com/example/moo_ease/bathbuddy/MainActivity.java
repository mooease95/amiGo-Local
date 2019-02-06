package com.example.moo_ease.bathbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void amigoPressed (View view) {
        Intent intent = new Intent (this, Register.class);
        startActivity(intent);
    }

    public void touristPressed (View view) {
        Intent intent = new Intent (this, TouristHome1.class);
        startActivity(intent);
    }




}
