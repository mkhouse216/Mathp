package com.example.mathpuzzle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class levalpage extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levalpage);

        recyclerView=findViewById(R.id.recycle_view);

        LevalADApter levalADApter=new LevalADApter(levalpage.this);

        recyclerView.setAdapter(levalADApter);


    }
}