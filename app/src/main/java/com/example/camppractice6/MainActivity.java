package com.example.camppractice6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> data = new ArrayList<>();
    MyListAdapter adapter;

    RecyclerView recyclerView;

    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        data.add("Peach");
        data.add("Apple");
        data.add("Mandarin");

        //recyclerview
        adapter = new MyListAdapter(this, data);
        recyclerView = findViewById(R.id.fruitlist);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        et=findViewById(R.id.etFruit);

    }

    public void onAdd(View view){
        String newName= et.getText().toString();
        data.add(newName);
        adapter.notifyDataSetChanged(); //data 변경됐으니깐 다시 뿌려

    }
}