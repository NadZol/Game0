package com.example.game0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView cat = (ImageView) findViewById(R.id.cat);

        ImageButton btnUp = (ImageButton) findViewById(R.id.btnUp);
        btnUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cat.setY(cat.getY() - 10);
            }
        });

        ImageButton btnDown = (ImageButton) findViewById(R.id.btnDown);
        btnDown.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cat.setY(cat.getY() + 10);
            }
        });

        ImageButton btnLeft = (ImageButton) findViewById(R.id.btnLeft);
        btnLeft.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cat.setX(cat.getX() - 10);
            }
        });

        ImageButton btnRight = (ImageButton) findViewById(R.id.btnRight);
        btnRight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cat.setX(cat.getX() + 10);
            }
        });
    }
}
