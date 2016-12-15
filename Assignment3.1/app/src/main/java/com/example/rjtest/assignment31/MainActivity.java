package com.example.rjtest.assignment31;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
     Button mbtn12;
     EditText mtext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtext = (EditText) findViewById(R.id.edit1);
        mbtn12 = (Button) findViewById(R.id.btn21);
        mbtn12.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String url = mtext.getText().toString();
        Intent myintent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
       startActivity(myintent);
    }
}
