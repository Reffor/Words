package com.example.user.words;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class PlayTest extends AppCompatActivity implements View.OnClickListener {
    TextView text;
    TextView textNumber;

    Button word1;
    Button word2;
    Button word3;
    Button word4;
    Animation anim;

    String EngWord = "";
    String RightAnswer = "";
    String str="";

    int rightAnswers = 0;
    int ItemIndex = 0;
    int WordIndex = 0;//из PlayList(0-10)
    ArrayList<String> PlayList = new ArrayList<>();

    int[] MasIndex = new int[10];

    Bundle arg;

    int num1;
    int num2;
    int num3;
    int num4;

    String EngWord1 = "";
    String EngWord2 = "";
    String EngWord3 = "";
    String EngWord4 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_test);
        text = (TextView) findViewById(R.id.Twords);
        textNumber = (TextView) findViewById(R.id.numberWord);
        word1 = (Button) findViewById(R.id.word1);
        word2 = (Button) findViewById(R.id.word2);
        word3 = (Button) findViewById(R.id.word3);
        word4 = (Button) findViewById(R.id.word4);

        arg = getIntent().getExtras();
        ItemIndex = arg.getInt(BmainTest.KEY_ITEM_ID);

        Log.d("log", String.valueOf(ItemIndex));
        AddWordsToPlayList(ItemIndex);
        StartGame(WordIndex);

        word1.setOnClickListener(this);
        word2.setOnClickListener(this);
        word3.setOnClickListener(this);
        word4.setOnClickListener(this);
    }

    public void StartGame(int WordIndex) {
        anim = AnimationUtils.loadAnimation(this, R.anim.alpha);

        count();
        RightAnswer = PlayList.get(WordIndex).toString();
        text.setText(RightAnswer);
        text.startAnimation(anim);
        EngWord = MainActivity.EnglishWords.get(MasIndex[WordIndex]);//получение слова из английского списка,которое переводит слово написанное в TextView
        Random r = new Random();
        int num = r.nextInt(4);

        while (CheckGenerate()) {
            num1 = Generate();
            num2 = Generate();
            num3 = Generate();
            num4 = Generate();
        }

        EngWord1 = MainActivity.EnglishWords.get(num1).toString();
        EngWord2 = MainActivity.EnglishWords.get(num2).toString();
        EngWord3 = MainActivity.EnglishWords.get(num3).toString();
        EngWord4 = MainActivity.EnglishWords.get(num4).toString();


        switch (num) {
            case 0:
                word1.setText(EngWord);
                break;
            case 1:
                word2.setText(EngWord);
                break;
            case 2:
                word3.setText(EngWord);
                break;
            case 3:
                word4.setText(EngWord);
                break;
        }

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
        num1 = 0;
        num2 = 0;
        num3 = 0;
        num4 = 0;


    }

    public boolean CheckGenerate() {
        if (num1 == num2 || num1 == num3 || num1 == num4 || num2 == num3 || num2 == num4 || num3 == num4 ||
                num1 == WordIndex || num2 == WordIndex || num3 == WordIndex || num4 == WordIndex) {
            return true;
        }
        return false;
    }

    public int Generate() {
        int i = MainActivity.EnglishWords.size();
        Random r = new Random();
        i = r.nextInt(i);
        Log.d("log", String.valueOf(i));
        return i;

    }


    public void AddWordsToPlayList(int position) {
        Log.d("log", "StartAddWords Position" + position);

        for (int i = position, j = 0; i < position + 10; i++, j++) {

            PlayList.add(MainActivity.RussianWords.get(i));
            MasIndex[j] = i;
            Log.d("log", MainActivity.RussianWords.get(i));
        }
    }


    @Override
    public void onClick(View v) {
        Button button = ((Button) v);
        String Eword = button.getText().toString();//получаем слово из нажатой кнопки

        //сделать зеленый фон кнопки при правильном ответе и красный при неправильном
        if (MainActivity.RussianWords.indexOf(RightAnswer) == MainActivity.EnglishWords.indexOf(Eword)) {
            rightAnswers++;

        } else {
            Mistakes_B.ListMistakes.add(EngWord + " - " + RightAnswer);
            //button.setBackground(getResources().getDrawable(R.drawable.red_border));
        }


        if (WordIndex < 9) {
            WordIndex++;
            Log.d("log", String.valueOf(WordIndex));

            StartGame(WordIndex);
        } else {
            Log.d("log", "StartDialogWindow");
            AlertDialog.Builder builder = new AlertDialog.Builder(PlayTest.this);
                if(rightAnswers==10){
                    str = "Всё верно";
                }else{
                    str = "Неправильных ответов " + String.valueOf(10-rightAnswers);
                }
            builder.setMessage(str)
                    .setCancelable(false)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent ReturnBmain = new Intent();
                            ReturnBmain.putExtra(BmainTest.KEY_SEND_DATA, rightAnswers);
                            setResult(RESULT_OK, ReturnBmain);
                            finish();
                        }
                    });
            if (rightAnswers != 10) {
                builder.setNegativeButton("Check mistakes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent ReturnBmain = new Intent(PlayTest.this, Mistakes_B.class);
                        ReturnBmain.putExtra(BmainTest.KEY_SEND_DATA, rightAnswers);
                        setResult(RESULT_OK, ReturnBmain);
                        startActivity(ReturnBmain);
                        finish();
                    }
                });
            }

            AlertDialog adialog = builder.create();
            adialog.setTitle("Результат");
            adialog.show();

        }


    }

    int i = 0;

    public void count() {
        i++;
        textNumber.setText(i + "/" + "10");

    }
}
