package com.example.user.words;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CmainTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmain_test);
        Toolbar toolbar = null;
        toolbar = (Toolbar)findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        ListView list = (ListView)findViewById(R.id.ListDictionary);
        ArrayList<String> Words = new ArrayList<>();
        for(int i = 0;i<MainActivity.EnglishWords.size();i++){
            Words.add(MainActivity.EnglishWords.get(i) + " - " + MainActivity.RussianWords.get(i));
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,Words);
        list.setAdapter(adapter);
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
}
