package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[],s2[];
    int image[]={
            R.drawable.java,
            R.drawable.java,
            R.drawable.java,
            R.drawable.java
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.pieces);
        s2 = getResources().getStringArray(R.array.desc);

        BlogAdapter blogAdapter = new BlogAdapter(this,s1,s2,image);
        recyclerView.setAdapter(blogAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
