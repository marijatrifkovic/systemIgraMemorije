package com.rs.systempro.test;

import android.content.Intent;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;

public class game extends AppCompatActivity {
    int h;
    int v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Intent myIntent = getIntent();
        h= myIntent.getIntExtra("height", 3);
        v = myIntent.getIntExtra("width",3);

        GridLayout glMreza = (GridLayout) findViewById(R.id.glMreza);

        glMreza.setColumnCount(v);

        View rootView = findViewById(R.id.rlRoot);
        Point p = new Point();
        getWindowManager().getDefaultDisplay().getSize(p);
        int btnWidth = p.x/v;
        int btnHeight = p.y/h;



        for(int i=0;i<h*v;i++){
            Button b = new Button(this);
            b.setWidth(btnWidth);
            b.setHeight(btnHeight);
            GridLayout.LayoutParams params =
                    new GridLayout.LayoutParams(b.getLayoutParams());
            params.setMargins(0,0,0,0);
            b.setLayoutParams(params);
            b.setText("Dugme "+ i);
            glMreza.addView(b);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        Point p = new Point();

        getWindowManager().getDefaultDisplay().getSize(p);
        int btnWidth = p.x/v;
        int btnHeight = p.y/h;
        Toast.makeText(this, btnWidth + "x"+btnHeight, Toast.LENGTH_SHORT).show();
    }

}
