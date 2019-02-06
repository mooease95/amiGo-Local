package com.example.moo_ease.bathbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class LargeHomeTourist2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_large_home_tourist2);
    }

    public void strangePressed (View view) {
        Intent intent = new Intent(this, RayandZ.class);
        startActivity(intent);
    }

}
