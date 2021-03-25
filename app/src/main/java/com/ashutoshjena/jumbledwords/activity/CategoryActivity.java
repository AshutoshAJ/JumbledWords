package com.ashutoshjena.jumbledwords.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.ashutoshjena.jumbledwords.R;
import com.ashutoshjena.jumbledwords.adapter.CategoryRecyclerAdapter;
import com.ashutoshjena.jumbledwords.pojo.Categories;
import com.ashutoshjena.jumbledwords.pojo.Images;

import java.util.ArrayList;

public class CategoryActivity extends AppCompatActivity implements CategoryRecyclerAdapter.OnRecyclerViewItemClickListener{

    ArrayList<String> categoriesList;
    ArrayList<Integer> imageResourcesList;
    RecyclerView recyclerView;
    CategoryRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        categoriesList = Categories.getCategories();
        imageResourcesList = Images.getImageResources();

        recyclerView = findViewById(R.id.categoryRecyclerView);

        adapter = new CategoryRecyclerAdapter(categoriesList, imageResourcesList, this, CategoryActivity.this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void OnRecyclerViewItemClick(int position) {
        String category = categoriesList.get(position);
        Intent intent = new Intent(this, GameActivity.class);
        intent.putExtra("Category", category);
        startActivity(intent);
    }
}