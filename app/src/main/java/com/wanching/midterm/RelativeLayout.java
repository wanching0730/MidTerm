package com.wanching.midterm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;



public class RelativeLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);

        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        spinner.setPrompt("gender");



    }
}
