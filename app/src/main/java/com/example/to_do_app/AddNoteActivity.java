package com.example.to_do_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class AddNoteActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<Notes> list = new ArrayList<>();

    private EditText editTitle;
    private EditText editDescription;
    private Button buttonSave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_add_note);

        editTitle = findViewById(R.id.editTitle);
        editDescription = findViewById(R.id.editDescription);
        buttonSave = findViewById(R.id.saveBtn);


        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveNote();
            }
        });
    }

    private void saveNote() {
        String title = editTitle.getText().toString();
        String description = editDescription.getText().toString();

        Toast.makeText(AddNoteActivity.this, "Note saved: " + title, Toast.LENGTH_SHORT).show();

        finish();

        recyclerView = findViewById(R.id.tasksRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new MyAdapter(list);
        recyclerView.setAdapter(adapter);

        list.add(new Notes("Item 1","dfghjkm"));
        list.add(new Notes("Item 2","cdftyukm"));
        adapter.notifyDataSetChanged();

    }
}