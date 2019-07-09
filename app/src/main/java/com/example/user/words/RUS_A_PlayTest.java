package com.example.user.words;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class RUS_A_PlayTest extends AppCompatActivity implements View.OnClickListener{
    TextView text;
    TextView textNumer;

    Button word1;
    Button word2;
    Button word3;
    Button word4;

    Animation anim;

    int IndexRight;
    int IndexRight1;
    int IndexRight2;
    int IndexRight3;
    int IndexRight4;

    int i=0;

    int rightAnswers = 0;
    String RightAnswerRus = "";
    String RightAnswerEng = "";
    String EngWord1 = "";
    String EngWord2 = "";
    String EngWord3 = "";
    String EngWord4 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a__play_test);
        Toolbar toolbar = null;
        toolbar = (Toolbar)findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        text = (TextView) findViewById(R.id.Twords);
        textNumer = (TextView) findViewById(R.id.numberWord);
        word1 = (Button) findViewById(R.id.word1);
        word2 = (Button) findViewById(R.id.word2);
        word3 = (Button) findViewById(R.id.word3);
        word4 = (Button) findViewById(R.id.word4);

      StartGame();

      word1.setOnClickListener(this);
      word2.setOnClickListener(this);
      word3.setOnClickListener(this);
      word4.setOnClickListener(this);
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

    public void StartGame() {
        anim = AnimationUtils.loadAnimation(this,R.anim.alpha);
        count();
        Random r = new Random();
        IndexRight = r.nextInt(MainActivity.EnglishWords.size());

        RightAnswerRus = MainActivity.RussianWords.get(IndexRight);
        text.setText(RightAnswerRus);
        text.startAnimation(anim);
        RightAnswerEng = MainActivity.EnglishWords.get(IndexRight);
        int num = r.nextInt(4);

        switch (num) {
            case 0:
                word1.setText(RightAnswerEng);
                break;
            case 1:
                word2.setText(RightAnswerEng);
                break;
            case 2:
                word3.setText(RightAnswerEng);
                break;
            case 3:
                word4.setText(RightAnswerEng);
                break;
        }
        while(CheckGenerate()) {
            IndexRight1 = r.nextInt(MainActivity.EnglishWords.size());
            IndexRight2 = r.nextInt(MainActivity.EnglishWords.size());
            IndexRight3 = r.nextInt(MainActivity.EnglishWords.size());
            IndexRight4 = r.nextInt(MainActivity.EnglishWords.size());
        }
        EngWord1 = MainActivity.EnglishWords.get(IndexRight1);
        EngWord2 = MainActivity.EnglishWords.get(IndexRight2);
        EngWord3 = MainActivity.EnglishWords.get(IndexRight3);
        EngWord4 = MainActivity.EnglishWords.get(IndexRight4);

        IndexRight1 =0;
        IndexRight2 =0;
        IndexRight3 =0;
        IndexRight4 =0;

        if (num != 0) {
            word1.setText(EngWord1);
        }
        if (num != 1) {
            word2.setText(EngWord2);
        }
        if (num != 2) {
            word3.setText(EngWord3);
        }
        if (num != 3) {
            word4.setText(EngWord4);
        }

    }

    public boolean CheckGenerate() {
        if (IndexRight1 == IndexRight2 || IndexRight1 == IndexRight3 || IndexRight1 == IndexRight4 || IndexRight2 == IndexRight3 || IndexRight2 == IndexRight4
                || IndexRight3 == IndexRight4 || IndexRight1 == IndexRight || IndexRight2 == IndexRight || IndexRight3 == IndexRight || IndexRight4 == IndexRight) {
            return true;
        }
        return false;
    }


    @Override
    public void onClick(View v) {
        Button button = (Button) v;

        Animation animBut ;
        animBut =  AnimationUtils.loadAnimation(this,R.anim.alpha);

        int TextButtonIndex = MainActivity.EnglishWords.indexOf(button.getText().toString());

        if(TextButtonIndex == IndexRight){
            rightAnswers++;
        }else{
            AmainTest.ListMistakes.add(RightAnswerEng+" - "+RightAnswerRus);
        }

        button.startAnimation(animBut);
        StartGame();
    }
public void count(){
        i++;
        textNumer.setText(i+"/"+MainActivity.RussianWords.size());
}

}
