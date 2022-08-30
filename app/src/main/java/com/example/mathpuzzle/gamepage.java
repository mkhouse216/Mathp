package com.example.mathpuzzle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class gamepage extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, submit, skip, hint;
    ImageView deletee;
    ImageView mainimage;
    int gamelevel;


    TextView textView, textset;
    String join;
    String ans[] = {"10", "25", "6", "14", "128", "7", "50", "1025", "100", "3", "212", "3011", "14", "16", "1", "2", "44", "45", "625", "1", "13", "47", "50",
            "34", "6", "41", "16", "126", "82", "14", "7", "132", "34", "48", "42", "288", "45", "4", "111", "47", "27", "87", "22", "253", "12", "38", "178",
            "1", "6", "10", "2", "20", "7", "511", "143547", "84", "11", "27", "3", "5", "39", "31", "10", "130", "22", "3", "14", "42", "164045", "11", "481",
            "86", "84", "13", "8"};
    int level[] = {R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4, R.drawable.p5, R.drawable.p6, R.drawable.p7,
            R.drawable.p8, R.drawable.p9, R.drawable.p10, R.drawable.p11, R.drawable.p12, R.drawable.p13, R.drawable.p14,
            R.drawable.p15, R.drawable.p16, R.drawable.p17, R.drawable.p18, R.drawable.p19, R.drawable.p20, R.drawable.p21,
            R.drawable.p22, R.drawable.p23, R.drawable.p24, R.drawable.p25, R.drawable.p26, R.drawable.p27, R.drawable.p28,
            R.drawable.p29, R.drawable.p30, R.drawable.p31, R.drawable.p32, R.drawable.p33, R.drawable.p34, R.drawable.p35,
            R.drawable.p36, R.drawable.p37, R.drawable.p38, R.drawable.p39, R.drawable.p40, R.drawable.p41, R.drawable.p42,
            R.drawable.p43, R.drawable.p44, R.drawable.p45, R.drawable.p46, R.drawable.p47, R.drawable.p48, R.drawable.p49,
            R.drawable.p50, R.drawable.p51, R.drawable.p52, R.drawable.p53, R.drawable.p54, R.drawable.p55, R.drawable.p56,
            R.drawable.p57, R.drawable.p58, R.drawable.p59, R.drawable.p60, R.drawable.p61, R.drawable.p62, R.drawable.p63,
            R.drawable.p64, R.drawable.p65, R.drawable.p66, R.drawable.p67, R.drawable.p68, R.drawable.p69, R.drawable.p70,
            R.drawable.p71, R.drawable.p72, R.drawable.p73, R.drawable.p74, R.drawable.p75};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamepage);

        gamelevel = getIntent().getIntExtra("pos", 0);

        b1 = findViewById(R.id.bt1);
        b2 = findViewById(R.id.bt2);
        b3 = findViewById(R.id.bt3);
        b4 = findViewById(R.id.bt4);
        b5 = findViewById(R.id.bt5);
        b5 = findViewById(R.id.bt5);
        b6 = findViewById(R.id.bt6);
        b7 = findViewById(R.id.bt7);
        b8 = findViewById(R.id.bt8);
        b9 = findViewById(R.id.bt9);
        b0 = findViewById(R.id.bt0);
        mainimage = findViewById(R.id.gameimage);
        submit = findViewById(R.id.submit);
        deletee = findViewById(R.id.deletee);
        hint = findViewById(R.id.hint);
        skip = findViewById(R.id.skip);
        textView = findViewById(R.id.textview);
        textset = findViewById(R.id.textset);


        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.statuslist.remove(gamelevel);

                MainActivity.statuslist.add(gamelevel, MainActivity.Isskip);

                MainActivity.Adddata.putString("status" + gamelevel, MainActivity.Isskip);

                gamelevel++;

                MainActivity.Adddata.putInt("level", gamelevel);
                MainActivity.Adddata.apply();

                Intent intent = new Intent(gamepage.this, gamepage.class);
                intent.putExtra("pos", gamelevel);
                startActivity(intent);
                finish();
            }
        });


        mainimage.setImageResource(level[gamelevel]);
        textset.setText("Puzzle " + (gamelevel + 1));


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = b1.getText().toString();
                join = textView.getText().toString();
                textView.setText(join + s1);
                //1

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = b2.getText().toString();
                join = textView.getText().toString();
                textView.setText(join + s1);
                //1

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = b3.getText().toString();
                join = textView.getText().toString();
                textView.setText(join + s1);
                //1

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = b4.getText().toString();
                join = textView.getText().toString();
                textView.setText(join + s1);
                //1

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = b5.getText().toString();
                join = textView.getText().toString();
                textView.setText(join + s1);
                //1

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = b6.getText().toString();
                join = textView.getText().toString();
                textView.setText(join + s1);
                //1

            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = b7.getText().toString();
                join = textView.getText().toString();
                textView.setText(join + s1);
                //1

            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = b8.getText().toString();
                join = textView.getText().toString();
                textView.setText(join + s1);
                //1

            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = b9.getText().toString();
                join = textView.getText().toString();
                textView.setText(join + s1);
                //1

            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = b0.getText().toString();
                join = textView.getText().toString();
                textView.setText(join + s1);
                //1

            }
        });

        deletee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = textView.getText().toString();

                if (s1.length() > 0) {
                    textView.setText(s1.substring(0, s1.length() - 1));
                } else {
                    textView.setText("");
                }
                //DL


            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String a = textView.getText().toString();
                if (a.equals(ans[gamelevel])) {

                    String levelstatus = MainActivity.statuslist.get(gamelevel);

                    if (levelstatus.equals(MainActivity.Isclear)) {
                        Intent intent = new Intent(gamepage.this, winpage.class);
                        intent.putExtra("pos", gamelevel);
                        startActivity(intent);
                        finish();
                        // win Page
                    } else if (levelstatus.equals(MainActivity.Isskip)) {


                        MainActivity.statuslist.remove(gamelevel);

                        MainActivity.statuslist.add(gamelevel, MainActivity.Isclear);

                        MainActivity.Adddata.putString("status" + gamelevel, MainActivity.Isclear);

                        Intent intent = new Intent(gamepage.this, winpage.class);
                        intent.putExtra("pos", gamelevel);
                        startActivity(intent);
                        finish();
                        // win

                    } else {


                        MainActivity.statuslist.remove(gamelevel);

                        MainActivity.statuslist.add(gamelevel, MainActivity.Isclear);

                        MainActivity.Adddata.putString("status" + gamelevel, MainActivity.Isclear);

                        gamelevel++;

                        MainActivity.Adddata.putInt("level", gamelevel);
                        MainActivity.Adddata.apply();

                        Intent intent = new Intent(gamepage.this, winpage.class);
                        intent.putExtra("pos", (gamelevel - 1));
                        startActivity(intent);
                        finish();


                    }


                } else {

                    if (textView.getText() == "") {
                        Toast.makeText(gamepage.this, "Empty Answer", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(gamepage.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                        textView.setText("");
                    }
                }

            }
        });

    }
}