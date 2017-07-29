package com.wanching.midterm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class ReceiveIntent extends AppCompatActivity {

    private EditText etMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_intent);

        Bundle bundle = new Bundle();
        bundle = getIntent().getExtras();
        String message = bundle.getString("message");
        String number= bundle.getString("number");
        etMessage = (EditText) findViewById(R.id.received_message);
        etMessage.setText(message + " , " + number);


    }
}
