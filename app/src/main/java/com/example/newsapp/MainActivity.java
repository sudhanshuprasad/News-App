package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String s1[], s2[];
    RecyclerView recyclerView;
    int image[] = {R.drawable.ss2, R.drawable.ss3, R.drawable.ss4, R.drawable.ss5,
                    R.drawable.ss6, R.drawable.ss7, R.drawable.ss8, R.drawable.ss1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);
        s1= getResources().getStringArray(R.array.languages);
        s2= getResources().getStringArray(R.array.discription);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, image);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}