package com.android.recyclerbinding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(new RecyclerAdapter(this, getData()));
    }

    private ArrayList<foodModel> getData(){
        String []listFood = {"bread","burger","hotdog","sandwich","pizza"};
        ArrayList<foodModel> list = new ArrayList<>();

        for(int i=0; i<listFood.length;i++){
            foodModel model = new foodModel();
            model.namaMakanan = listFood[i];
            list.add(model);
        }

        return list;
    }
}
