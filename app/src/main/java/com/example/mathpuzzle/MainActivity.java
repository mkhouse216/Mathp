package com.example.mathpuzzle;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView continue1, puzzles;
    public static SharedPreferences sp;
    public static SharedPreferences.Editor Adddata;
    int level;
    public  static String Isskip = "skip";
    public  static String Ispending = "pending";
    public  static String Isclear = "clear";
    public  static ArrayList<String> statuslist = new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        continue1 = findViewById(R.id.t1);
        puzzles = findViewById(R.id.t2);


        sp = getSharedPreferences("share",0);
        Adddata = sp.edit();


        level = sp.getInt("level",0);

        for(int i = 0; i< 75  ; i++)
        {
            String levelsttaus =  sp.getString("status"+i,Ispending);
            statuslist.add(levelsttaus);
        }

        continue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, gamepage.class);
                intent.putExtra("pos",level);
                startActivity(intent);

            }
        });

        puzzles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, levalpage.class);
                startActivity(intent);

            }
        });


    }
}