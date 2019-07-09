package com.example.user.words;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class BmainTest extends AppCompatActivity implements ListView.OnItemClickListener {
    ListView list;
    String[] NameItems = new String[84];
    ArrayAdapter adapter;

    static String KEY_ITEM_ID = "ID";//ключ который оределяет индекс пункта
    static int RETURN_RESULT = 1;//request code
    static String KEY_SEND_DATA = "count";//получение результа (количество правильных ответов)

    String SaveReturnList = "";

    int getDay;
    int number_answer = 0;//
    int day = 1;

    SharedPreferences sPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmain_test);
        sPref = getPreferences(MODE_PRIVATE);
        list = (ListView) findViewById(R.id.ListTest);
        Toolbar toolbar = null;
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        SaveReturnList = sPref.getString("save","");

        if(SaveReturnList.equals("")) {//Если первый запуск то инициализация. Если есть какие-то результаты то восстанавливаем состояние NameItems
            NameItems = InitializationItems(NameItems);
        }else{
            NameItems = RestoreArrayNameItems(SaveReturnList);
        }
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, NameItems);

        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
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
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        getDay = position;
        Intent sendIntent = new Intent(this, PlayTest.class);
        if (position != 0) {
            position *= 10;
        }
        sendIntent.putExtra(KEY_ITEM_ID, position);
        Log.d("log", "Position" + String.valueOf(position));
        startActivityForResult(sendIntent, RETURN_RESULT);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d("log", "Получение результа ");
        if (requestCode == RETURN_RESULT) {
            if (resultCode == RESULT_OK) {

                number_answer = data.getIntExtra(KEY_SEND_DATA, 0);
                Log.d("log", "Установка результа " + String.valueOf(number_answer));

                NameItems[getDay] = "День " + String.valueOf(getDay + 1) + "\n" + "Выполнено\t" + String.valueOf(number_answer) + "/10";
                adapter.notifyDataSetChanged();

                SharedPreferences.Editor ed = sPref.edit();//сохранение результатов в списке
                SaveReturnList = SaveArrayNameItems(NameItems);
                ed.putString("save", SaveReturnList);
                ed.commit();

            }
        }
    }

    public String[] InitializationItems(String[] NameItems) {

        for (int i = 0; i < NameItems.length; i++) {
            NameItems[i] = "День " + day + "\n" + "Выполнено\t" + String.valueOf(number_answer) + "/10";
            day++;
        }
        return NameItems;
    }

    public String SaveArrayNameItems(String[] NameItems) {
        String str = "";
        for (int i = 0; i <NameItems.length; i++) {
            str += NameItems[i] + ",";
        }
        return str;
    }

    public String[] RestoreArrayNameItems(String str) {
        StringTokenizer st = new StringTokenizer(str, ",");
        for (int i = 0; i < NameItems.length; i++) {
            NameItems[i] = st.nextToken();
        }
        return NameItems;
    }

}
