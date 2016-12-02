package com.example.alex_deem.studentlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Recycler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        List<String> list = new ArrayList<>();
        for(int i = 0; i < 100;i++){
            list.add(String.format("学生"+i));
    }
        RecyclerView.Adapter adapter = new MyAdapeter(this,list);
        recyclerView.setAdapter(adapter);
    }
}





