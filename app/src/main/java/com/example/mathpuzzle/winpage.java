package com.example.mathpuzzle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class winpage extends AppCompatActivity {

    AppCompatButton continu, mainmenu, buypro;
    TextView levelll;

    int level;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winpage);

        continu = findViewById(R.id.but1);
        mainmenu = findViewById(R.id.but2);
        buypro = findViewById(R.id.but3);
        levelll = findViewById(R.id.comp);


        level = getIntent().getIntExtra("pos", 0);


        levelll.setText("Level " + (level + 1) + " Complate");


        continu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(winpage.this, gamepage.class);
                intent.putExtra("pos", (level + 1));
                startActivity(intent);

            }
        });

        mainmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(winpage.this, MainActivity.class);
                startActivity(intent);

            }
        });


    }
}