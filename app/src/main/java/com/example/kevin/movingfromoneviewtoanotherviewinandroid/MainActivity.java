package com.example.kevin.movingfromoneviewtoanotherviewinandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSecondActivity = (Button) findViewById(R.id.btnSecondActivity);


        btnSecondActivity.setOnClickListener(this);



    } // Complete

    @Override  // Whatever is in this onClick method will be executed
    public void onClick(View view) {

        // Intent allows us to go from one activity to another activity...
        Intent intent = new Intent();
        intent.setClass(this, SecondActivity.class);

        startActivity(intent);

    }
}
