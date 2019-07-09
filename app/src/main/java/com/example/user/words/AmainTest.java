package com.example.user.words;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class AmainTest extends AppCompatActivity implements View.OnClickListener{
Button startEng;
Button startRus;
static ArrayList<String>ListMistakes = new ArrayList<>();
ListView list;
ArrayAdapter adapter;
TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amain_test);
        startEng = (Button)findViewById(R.id.startEng);
        startRus = (Button)findViewById(R.id.startRus);
        text = (TextView)findViewById(R.id.textMistake);
        list = (ListView)findViewById(R.id.listMistakes);
        Toolbar toolbar = null;
            toolbar = (Toolbar)findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);


        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, ListMistakes);
        list.setAdapter(adapter);
        startEng.setOnClickListener(this);
        startRus.setOnClickListener(this);
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
    public void onClick(View v) {
         switch (v.getId()){
             case R.id.startEng:
                 Intent intent1 = new Intent(this,ENG_A_PlayTest.class);
                 startActivity(intent1);
                 break;
                 case R.id.startRus:
                 Intent intent2 = new Intent(this,RUS_A_PlayTest.class);
                 startActivity(intent2);
                 break;
         }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        if(ListMistakes !=null) {
            adapter.notifyDataSetChanged();
        }
    }
}
