package com.example.harshitha.helloworld;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class HelloWorld extends ActionBarActivity implements View.OnClickListener {
    Button button;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
        button=(Button)findViewById(R.id.button1);
        textview=(TextView)findViewById(R.id.textView1);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
    textview.setText("Hello World!");

    }
}
