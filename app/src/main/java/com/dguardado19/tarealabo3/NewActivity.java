package com.dguardado19.tarealabo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    private TextView textMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        textMsg = findViewById(R.id.textMsg);
        Intent intent = getIntent();

        if (intent != null) {
            textMsg.setText(intent.getStringExtra(intent.EXTRA_TEXT));
        }
    }
}
