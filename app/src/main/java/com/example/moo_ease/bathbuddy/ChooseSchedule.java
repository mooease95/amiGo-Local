package com.example.moo_ease.bathbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class ChooseSchedule extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_schedule);
    }

    public void homeScreen (View view) {
        Intent intent = new Intent(this, AmigoHome1.class);
        startActivity(intent);
    }

}
