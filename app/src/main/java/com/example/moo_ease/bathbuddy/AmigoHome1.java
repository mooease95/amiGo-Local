package com.example.moo_ease.bathbuddy;

import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;



public class AmigoHome1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amigo_home1);




        TabHost host = (TabHost)findViewById(R.id.tabHost);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Active");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Active");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Completed");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Completed");
        host.addTab(spec);

        /*
        //Tab 3
        spec = host.newTabSpec("Tab Three");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Tab Three");
        host.addTab(spec);
        */
    }





}










