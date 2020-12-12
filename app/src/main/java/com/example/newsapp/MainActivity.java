package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String s1[], s2[];
    RecyclerView recyclerView;
    int image[] = {R.drawable.Screenshot1, R.drawable.Screenshot2, R.drawable.Screenshot3, R.drawable.Screenshot4,
                    R.drawable.Screenshot5, R.drawable.Screenshot6, R.drawable.Screenshot7, R.drawable.Screenshot8}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);
        s1= getResources().getStringArray(R.array.languages);
        s2= getResources().getStringArray(R.array.discription);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, image);
    }
}