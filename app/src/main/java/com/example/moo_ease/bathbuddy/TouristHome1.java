package com.example.moo_ease.bathbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class TouristHome1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist_home1);
    }


    public void largePressed (View view) {
        Intent intent = new Intent(this, LargeHomeTourist2.class);
        startActivity(intent);
    }


}
