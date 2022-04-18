package com.example.dz_3_daniyar_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> name= new ArrayList<>();
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        recyclerView=findViewById(R.id.recycler);
        PersonAdapter adapter = new PersonAdapter(name);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        name=new ArrayList<>();
        name.add("Muhammad");
        name.add("Muhammad");
        name.add("Muhammad");
        name.add("Muhammad");
        name.add("Muhammad");
        name.add("Muhammad");
        name.add("Muhammad");
        name.add("Muhammad");
        name.add("Muhammad");
        name.add("Muhammad");
        name.add("Muhammad");
        name.add("Muhammad");
        name.add("Muhammad");
        name.add("Muhammad");

    }
}