package com.example.android_recyclerview_sample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import com.example.android_recyclerview_sample.model.Sandwich;
import com.example.android_recyclerview_sample.utils.JsonUtils;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Sandwich> sandwichList ;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] sandwiches = getResources().getStringArray(R.array.sandwich_details);

        sandwichList = new ArrayList<Sandwich>();

        for (String item: sandwiches){

                sandwichList.add(JsonUtils.parseSandwichJson(item));
        }

    }
}

// TODO (02) Create SandwichAdapter class and extend it
// from RecyclerView.Adapter<TextItemViewHolder>

// TODO (03) Create a variable, data, that holds a list of Sandwich.

// TODO (04) Override getItemCount() to return the total number of items in the data set.

// TODO (05) Override onBindViewHolder() and have it update the contents of the
// ViewHolder to reflect the item at the given position.

// TODO (06) Override onCreateViewHolder()

// TODO (07) Create a new SandwichAdapter variable,
