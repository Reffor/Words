package com.example.user.words;

import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class ENG_A_PlayTest extends AppCompatActivity implements View.OnClickListener {
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
    String RusWord1 = "";
    String RusWord2 = "";
    String RusWord3 = "";
    String RusWord4 = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng__a__play_test);
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
        IndexRight = r.nextInt(MainActivity.RussianWords.size());

        RightAnswerEng = MainActivity.EnglishWords.get(IndexRight);
        text.setText(RightAnswerEng);
        text.startAnimation(anim);
        RightAnswerRus = MainActivity.RussianWords.get(IndexRight);
        int num = r.nextInt(4);

        switch (num) {
            case 0:
                word1.setText(RightAnswerRus);
                break;
            case 1:
                word2.setText(RightAnswerRus);
                break;
            case 2:
                word3.setText(RightAnswerRus);
                break;
            case 3:
                word4.setText(RightAnswerRus);
                break;
        }
        while(CheckGenerate()) {
            IndexRight1 = r.nextInt(MainActivity.RussianWords.size());
            IndexRight2 = r.nextInt(MainActivity.RussianWords.size());
            IndexRight3 = r.nextInt(MainActivity.RussianWords.size());
            IndexRight4 = r.nextInt(MainActivity.RussianWords.size());
        }
        RusWord1 = MainActivity.RussianWords.get(IndexRight1);
        RusWord2 = MainActivity.RussianWords.get(IndexRight2);
        RusWord3 = MainActivity.RussianWords.get(IndexRight3);
        RusWord4 = MainActivity.RussianWords.get(IndexRight4);

        IndexRight1 =0;
        IndexRight2 =0;
        IndexRight3 =0;
        IndexRight4 =0;

        if (num != 0) {
            word1.setText(RusWord1);
        }
        if (num != 1) {
            word2.setText(RusWord2);
        }
        if (num != 2) {
            word3.setText(RusWord3);
        }
        if (num != 3) {
            word4.setText(RusWord4);
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
        int TextButtonIndex = MainActivity.RussianWords.indexOf(button.getText().toString());
        Animation animBut =  AnimationUtils.loadAnimation(this,R.anim.alpha);

        if(TextButtonIndex == IndexRight){
            rightAnswers++;
        }else {
            if(!AmainTest.ListMistakes.contains(RightAnswerEng)) {
                AmainTest.ListMistakes.add(RightAnswerEng + " - " + RightAnswerRus);
            }
        }
        button.startAnimation(animBut);
        StartGame();
    }
public void count(){
        i++;
        textNumer.setText(i+"/"+MainActivity.EnglishWords.size());
}

}
