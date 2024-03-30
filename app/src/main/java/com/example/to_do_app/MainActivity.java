package com.example.to_do_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private MyAdapter mAdapter;
    private List<Notes> mDataList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton add = findViewById(R.id.add);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your action here
                Intent i = new Intent(MainActivity.this, AddNoteActivity.class);
                startActivity(i);
            }
        });

        mRecyclerView = findViewById(R.id.tasksRecyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize and set adapter
        mAdapter = new MyAdapter(mDataList);
        mRecyclerView.setAdapter(mAdapter);

        // Add data to the list and notify adapter
        mDataList.add(new Notes("Item 1","dfghjkm"));
        mDataList.add(new Notes("Item 2","cdftyukm"));
        mAdapter.notifyDataSetChanged();



    }
}