package com.example.user.words;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Mistakes_B extends AppCompatActivity {
static ArrayList<String>ListMistakes = new ArrayList<>();
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mistakes__b_test);
        Toolbar toolbar ;
        toolbar = (Toolbar)findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        listView = (ListView)findViewById(R.id.listMistakes);
        ArrayAdapter<String > adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,ListMistakes);
        listView.setAdapter(adapter);

    }
    @Override
    public void setSupportActionBar(@Nullable android.support.v7.widget.Toolbar toolbar) {
        super.setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();

        ListMistakes.clear();

    }
}
