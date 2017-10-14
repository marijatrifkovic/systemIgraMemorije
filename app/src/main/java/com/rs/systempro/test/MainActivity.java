package com.rs.systempro.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void exitClicked(View view) {
        finish();
    }

    public void otvoriClicked(View view) {
        Intent myIntent =new Intent(this,PreGameActivity.class);
        startActivity(myIntent);
    }
}
