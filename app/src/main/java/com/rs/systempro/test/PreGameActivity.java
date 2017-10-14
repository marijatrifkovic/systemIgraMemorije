package com.rs.systempro.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PreGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_game);
    }

    public void PocniClicked(View view) {
        int w=Integer.parseInt(((EditText)findViewById(R.id.sirina)).getText().toString());
        int h=Integer.parseInt(((EditText)findViewById(R.id.visina)).getText().toString());
        Intent myintent=new Intent(this,game.class);
        myintent.putExtra("visina",h);
        myintent.putExtra("sirina",w);
        startActivity(myintent);
    }
}
