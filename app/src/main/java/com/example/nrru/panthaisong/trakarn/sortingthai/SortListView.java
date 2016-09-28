package com.example.nrru.panthaisong.trakarn.sortingthai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class SortListView extends AppCompatActivity {

    //Explicit
    private ListView listView;
    private String[] strings;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort_list_view);

        listView = (ListView) findViewById(R.id.sortListView);
        strings = getResources().getStringArray(R.array.soft);

        // Create ListView

        SortAdapter sortAdapter = new SortAdapter(this, strings);
        listView.setAdapter(sortAdapter);


    } //Main Method
} // Main Class
