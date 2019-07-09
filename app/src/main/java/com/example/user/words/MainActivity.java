package com.example.user.words;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    static ArrayList<String> EnglishWords = new ArrayList<>();
    static ArrayList<String> RussianWords = new ArrayList<>();

   Button Atest;
    Button Btest;
  Button Ctest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Atest = (Button) findViewById(R.id.ATest);
        Btest = (Button) findViewById(R.id.BTest);
        Ctest = (Button) findViewById(R.id.CTest);

        Atest.setOnClickListener(this);
        Btest.setOnClickListener(this);
        Ctest.setOnClickListener(this);

        EngWords();
        RusWords();

    }

    public void EngWords() {

        EnglishWords.add("remember");
        EnglishWords.add("study");
        EnglishWords.add("they");
        EnglishWords.add("here");
        EnglishWords.add("very well");
        EnglishWords.add("in this");
        EnglishWords.add("so");
        EnglishWords.add("there");
        EnglishWords.add("country");
        EnglishWords.add("very hard");
        EnglishWords.add("feel");
        EnglishWords.add("happy");
        EnglishWords.add("also");
        EnglishWords.add("place");
        EnglishWords.add("really");
        EnglishWords.add("seem");
        EnglishWords.add("look");//17
        EnglishWords.add("in English");
        EnglishWords.add("read");
        EnglishWords.add("strange");
        EnglishWords.add("this");
        EnglishWords.add("that");
        EnglishWords.add("mistake");
        EnglishWords.add("happen");
        EnglishWords.add("more");//25
        EnglishWords.add("practice");
        EnglishWords.add("often");
        EnglishWords.add("go to school");
        EnglishWords.add("go to the cinema");
        EnglishWords.add("go to the park");
        EnglishWords.add("do");
        EnglishWords.add("make");
        EnglishWords.add("count");
        EnglishWords.add("offer");
        EnglishWords.add("teach");//35
        EnglishWords.add("miss");
        EnglishWords.add("always");
        EnglishWords.add("his");
        EnglishWords.add("on time");
        EnglishWords.add("usually");
        EnglishWords.add("relax at home");
        EnglishWords.add("have a rest");
        EnglishWords.add("learn English");
        EnglishWords.add("find a job");
        EnglishWords.add("sometimes");//45
        EnglishWords.add("useful");
        EnglishWords.add("everything");
        EnglishWords.add("all");
        EnglishWords.add("her");
        EnglishWords.add("lesson");
        EnglishWords.add("their");
        EnglishWords.add("profit");
        EnglishWords.add("the same");
        EnglishWords.add("girlfriend");
        EnglishWords.add("boyfriend");//55
        EnglishWords.add("very much");
        EnglishWords.add("support");
        EnglishWords.add("come to work");
        EnglishWords.add("go home");
        EnglishWords.add("come home");
        EnglishWords.add("thing");
        EnglishWords.add("early");
        EnglishWords.add("late");
        EnglishWords.add("word");
        EnglishWords.add("success");//65
        EnglishWords.add("dress");
        EnglishWords.add("flat");
        EnglishWords.add("improve");
        EnglishWords.add("speak English correctly(rightly)");
        EnglishWords.add("learn English fast");
        EnglishWords.add("be");
        EnglishWords.add("right now");
        EnglishWords.add("speak English fluently");
        EnglishWords.add("one more time");
        EnglishWords.add("live abroad");//75
        EnglishWords.add("another");
        EnglishWords.add("Thanks you");
        EnglishWords.add("Thanks a lot");
        EnglishWords.add("Thank you very much");
        EnglishWords.add("I like");
        EnglishWords.add("I really like");
        EnglishWords.add("I like it, too");
        EnglishWords.add("We like");
        EnglishWords.add("You like");
        EnglishWords.add("They like");//85
        EnglishWords.add("He like");
        EnglishWords.add("She like");
        EnglishWords.add("hotel");
        EnglishWords.add("I would like");
        EnglishWords.add("cup");
        EnglishWords.add("drink");
        EnglishWords.add("visit");
        EnglishWords.add("become");
        EnglishWords.add("agree");
        EnglishWords.add("discuss");//95
        EnglishWords.add("later");
        EnglishWords.add("tell you");
        EnglishWords.add("about");
        EnglishWords.add("interest");
        EnglishWords.add("attract");
        EnglishWords.add("recommend");
        EnglishWords.add("son");
        EnglishWords.add("daughter");
        EnglishWords.add("live");
        EnglishWords.add("life");//105
        EnglishWords.add("change");
        EnglishWords.add("My friend and i");
        EnglishWords.add("call");
        EnglishWords.add("believe");
        EnglishWords.add("them");
        EnglishWords.add("us");
        EnglishWords.add("bring");
        EnglishWords.add("happiness");
        EnglishWords.add("harder");
        EnglishWords.add("correct");//115
        EnglishWords.add("solve problem");
        EnglishWords.add("rule");
        EnglishWords.add("at all");
        EnglishWords.add("any");
        EnglishWords.add("advice");
        EnglishWords.add("less");
        EnglishWords.add("pay for");
        EnglishWords.add("from time to time");
        EnglishWords.add("so many");
        EnglishWords.add("order");//125
        EnglishWords.add("question");
        EnglishWords.add("motivate");
        EnglishWords.add("explain");
        EnglishWords.add("as soon as possible");
        EnglishWords.add("train");
        EnglishWords.add("memory");
        EnglishWords.add("regularly");
        EnglishWords.add("article");
        EnglishWords.add("beautiful");
        EnglishWords.add("My girlfriend and i");//135
        EnglishWords.add("show");
        EnglishWords.add("work on");
        EnglishWords.add("decision");
        EnglishWords.add("classical");
        EnglishWords.add("song");
        EnglishWords.add("listen to music");
        EnglishWords.add("use");
        EnglishWords.add("use the internet");
        EnglishWords.add("go to the gym");
        EnglishWords.add("enough");//145
        EnglishWords.add("knowledge");
        EnglishWords.add("ignore");
        EnglishWords.add("hate");
        EnglishWords.add("look for a job");
        EnglishWords.add("hear");
        EnglishWords.add("listen to the radio");
        EnglishWords.add("watch");
        EnglishWords.add("project");
        EnglishWords.add("profession");
        EnglishWords.add("boring");//155
        EnglishWords.add("useless");
        EnglishWords.add("important");
        EnglishWords.add("unimportant");
        EnglishWords.add("exam");
        EnglishWords.add("very difficult");
        EnglishWords.add("very easy");
        EnglishWords.add("all the truth");
        EnglishWords.add("excellent results");
        EnglishWords.add("brilliant results");
        EnglishWords.add("make mistakes");//165
        EnglishWords.add("situation");
        EnglishWords.add("exercise");
        EnglishWords.add("too easy");
        EnglishWords.add("depend");
        EnglishWords.add("depend on");
        EnglishWords.add("Where");
        EnglishWords.add("spend time");
        EnglishWords.add("together");
        EnglishWords.add("Why");
        EnglishWords.add("What");//175
        EnglishWords.add("How");
        EnglishWords.add("When");
        EnglishWords.add("get to work");
        EnglishWords.add("get to this place");
        EnglishWords.add("get to that place");
        EnglishWords.add("get here");
        EnglishWords.add("get there");
        EnglishWords.add("get home");
        EnglishWords.add("prefer");
        EnglishWords.add("get up");//185
        EnglishWords.add("go to bed");
        EnglishWords.add("complain");
        EnglishWords.add("refuse");
        EnglishWords.add("again and again");
        EnglishWords.add("add");
        EnglishWords.add("worry");
        EnglishWords.add("movie");
        EnglishWords.add("film");
        EnglishWords.add("different");
        EnglishWords.add("Which");//195
        EnglishWords.add("leave home");
        EnglishWords.add("go to the zoo");
        EnglishWords.add("criticize");
        EnglishWords.add("disagree");
        EnglishWords.add("promise");
        EnglishWords.add("answer");
        EnglishWords.add("travel");
        EnglishWords.add("much more");
        EnglishWords.add("with great pleasure");
        EnglishWords.add("share");//205
        EnglishWords.add("point if view");
        EnglishWords.add("inspire");
        EnglishWords.add("mention");
        EnglishWords.add("ask");
        EnglishWords.add("theater");
        EnglishWords.add("better job");
        EnglishWords.add("Let's talk");
        EnglishWords.add("housework");
        EnglishWords.add("but");
        EnglishWords.add("with them");//215
        EnglishWords.add("with us");
        EnglishWords.add("at work");
        EnglishWords.add("at home");
        EnglishWords.add("at school");
        EnglishWords.add("sure");
        EnglishWords.add("kind");
        EnglishWords.add("rich");
        EnglishWords.add("poor");
        EnglishWords.add("lazy");
        EnglishWords.add("husband");//225
        EnglishWords.add("wife");
        EnglishWords.add("high");
        EnglishWords.add("low");
        EnglishWords.add("detail");
        EnglishWords.add("informative");
        EnglishWords.add("small mistake");
        EnglishWords.add("the best");
        EnglishWords.add("in the world");
        EnglishWords.add("example");
        EnglishWords.add("too");//235
        EnglishWords.add("too boring");
        EnglishWords.add("expensive");
        EnglishWords.add("cheap");
        EnglishWords.add("cold");
        EnglishWords.add("warm");
        EnglishWords.add("hot");
        EnglishWords.add("wonderful");
        EnglishWords.add("great");
        EnglishWords.add("It's rainy");
        EnglishWords.add("It's sunny");//245
        EnglishWords.add("obvious");
        EnglishWords.add("possible");
        EnglishWords.add("simple");
        EnglishWords.add("impossible");
        EnglishWords.add("on the right");
        EnglishWords.add("on the left");
        EnglishWords.add("I'm fine");
        EnglishWords.add("worse");
        EnglishWords.add("young man");
        EnglishWords.add("meeting");//255
        EnglishWords.add("popular");
        EnglishWords.add("clever");
        EnglishWords.add("smart");
        EnglishWords.add("talented");
        EnglishWords.add("effective");
        EnglishWords.add("wise");
        EnglishWords.add("story");
        EnglishWords.add("hard-working");
        EnglishWords.add("busy");
        EnglishWords.add("at the moment");//265
        EnglishWords.add("designer");
        EnglishWords.add("men");
        EnglishWords.add("women");
        EnglishWords.add("small problem");
        EnglishWords.add("feeling");
        EnglishWords.add("power");
        EnglishWords.add("Chinese");
        EnglishWords.add("It's windy");
        EnglishWords.add("married");
        EnglishWords.add("single");//275
        EnglishWords.add("tired");
        EnglishWords.add("full of");
        EnglishWords.add("angry");
        EnglishWords.add("sad");
        EnglishWords.add("wrong");
        EnglishWords.add("in the first place");
        EnglishWords.add("colleagues");
        EnglishWords.add("in the second place");
        EnglishWords.add("successful");
        EnglishWords.add("unsuccessful");//285
        EnglishWords.add("old");
        EnglishWords.add("young");
        EnglishWords.add("in the city");
        EnglishWords.add("singer");
        EnglishWords.add("actress");
        EnglishWords.add("actor");
        EnglishWords.add("far");
        EnglishWords.add("near");
        EnglishWords.add("special offer");
        EnglishWords.add("in the right place");//295
        EnglishWords.add("lucky");
        EnglishWords.add("in the wrong place");
        EnglishWords.add("in the building");
        EnglishWords.add("opinion");
        EnglishWords.add("own");
        EnglishWords.add("funny");
        EnglishWords.add("newspaper");
        EnglishWords.add("magazine");
        EnglishWords.add("children");
        EnglishWords.add("dangerous");//305
        EnglishWords.add("powerful");
        EnglishWords.add("profitable");
        EnglishWords.add("famous");
        EnglishWords.add("news");
        EnglishWords.add("pocket");
        EnglishWords.add("bag");
        EnglishWords.add("against");
        EnglishWords.add("cost");
        EnglishWords.add("the nearest");
        EnglishWords.add("trousers");//315
        EnglishWords.add("pair of trousers");
        EnglishWords.add("jeans");
        EnglishWords.add("on a business trip");
        EnglishWords.add("on holiday");
        EnglishWords.add("manner");
        EnglishWords.add("satisfied with");
        EnglishWords.add("optimistic");
        EnglishWords.add("pessimistic");
        EnglishWords.add("in the bathroom");
        EnglishWords.add("in the kitchen");//325
        EnglishWords.add("pencil");
        EnglishWords.add("afraid");
        EnglishWords.add("afraid of");
        EnglishWords.add("passion");
        EnglishWords.add("glad");
        EnglishWords.add("lough at");
        EnglishWords.add("strategy");
        EnglishWords.add("enjoy");
        EnglishWords.add("foreign");
        EnglishWords.add("serious");//335
        EnglishWords.add("joke");
        EnglishWords.add("musician");
        EnglishWords.add("expert");
        EnglishWords.add("area");
        EnglishWords.add("a waste of time");
        EnglishWords.add("comfortable");
        EnglishWords.add("dream");
        EnglishWords.add("choice");
        EnglishWords.add("necessary");
        EnglishWords.add("natural");//345
        EnglishWords.add("on the floor");
        EnglishWords.add("chance");
        EnglishWords.add("compare");
        EnglishWords.add("match");
        EnglishWords.add("conference");
        EnglishWords.add("loud");
        EnglishWords.add("intensive");
        EnglishWords.add("behaviour");
        EnglishWords.add("summer");
        EnglishWords.add("spring");//355
        EnglishWords.add("autumn");
        EnglishWords.add("winter");
        EnglishWords.add("subject");
        EnglishWords.add("adapt to");
        EnglishWords.add("condition");
        EnglishWords.add("prepare for");
        EnglishWords.add("attack");
        EnglishWords.add("trust");
        EnglishWords.add("stimulate");
        EnglishWords.add("specialist");//365
        EnglishWords.add("crazy");
        EnglishWords.add("mad");
        EnglishWords.add("tourist");
        EnglishWords.add("ill");
        EnglishWords.add("illness");
        EnglishWords.add("friendly");
        EnglishWords.add("fat");
        EnglishWords.add("recommendation");
        EnglishWords.add("surprising");
        EnglishWords.add("brand");//375
        EnglishWords.add("convenient");
        EnglishWords.add("Inconvenient");
        EnglishWords.add("Chair");
        EnglishWords.add("Armchair");
        EnglishWords.add("Key");
        EnglishWords.add("Table");
        EnglishWords.add("Desk");
        EnglishWords.add("Presentation");
        EnglishWords.add("It isn't clear");
        EnglishWords.add("Go shopping");//385
        EnglishWords.add("Do the shopping");
        EnglishWords.add("communicate");
        EnglishWords.add("other");
        EnglishWords.add("elementary");
        EnglishWords.add("salary");
        EnglishWords.add("tomorrow");
        EnglishWords.add("today");
        EnglishWords.add("Clinic");
        EnglishWords.add("Price");
        EnglishWords.add("salad");//395
        EnglishWords.add("cake");
        EnglishWords.add("pie");
        EnglishWords.add("furniture");
        EnglishWords.add("advertising");
        EnglishWords.add("advertisement");
        EnglishWords.add("atmosphere");
        EnglishWords.add("analyze");
        EnglishWords.add("data");
        EnglishWords.add("write it down");
        EnglishWords.add("formal");//405
        EnglishWords.add("informal");
        EnglishWords.add("unhappy");
        EnglishWords.add("polite");
        EnglishWords.add("impolite");
        EnglishWords.add("moral");
        EnglishWords.add("immoral");
        EnglishWords.add("better result");
        EnglishWords.add("compete");
        EnglishWords.add("cook well");
        EnglishWords.add("I'm fond of...");//415
        EnglishWords.add("payment");
        EnglishWords.add("journalist");
        EnglishWords.add("unusual");
        EnglishWords.add("spend");
        EnglishWords.add("alone");
        EnglishWords.add("experience");
        EnglishWords.add("at the airport");
        EnglishWords.add("I hope");
        EnglishWords.add("elder brother");
        EnglishWords.add("younger brother");//425
        EnglishWords.add("tasty / delicious");
        EnglishWords.add("very tasty");
        EnglishWords.add("absolutely delicious");
        EnglishWords.add("the meaning of");
        EnglishWords.add("phrase");
        EnglishWords.add("expression");
        EnglishWords.add("mean");
        EnglishWords.add("that");
        EnglishWords.add("this year");
        EnglishWords.add("next year");//435
        EnglishWords.add("by tomorrow");
        EnglishWords.add("by next week");
        EnglishWords.add("by next month");
        EnglishWords.add("by next year");
        EnglishWords.add("each other");
        EnglishWords.add("separately");
        EnglishWords.add("interested in");
        EnglishWords.add("keen on");
        EnglishWords.add("some people");
        EnglishWords.add("celebrate");//445
        EnglishWords.add("to");
        EnglishWords.add("incorrect");
        EnglishWords.add("thanks to");
        EnglishWords.add("explanations");
        EnglishWords.add("the simplicity of");
        EnglishWords.add("community");
        EnglishWords.add("frighten");
        EnglishWords.add("nowadays");
        EnglishWords.add("admire");
        EnglishWords.add("realize");//455
        EnglishWords.add("can");
        EnglishWords.add("must");
        EnglishWords.add("should");
        EnglishWords.add("may / might");
        EnglishWords.add("swim");
        EnglishWords.add("slowly");
        EnglishWords.add("the worst");
        EnglishWords.add("longer");
        EnglishWords.add("the longest");
        EnglishWords.add("the must interesting");//465
        EnglishWords.add("river");
        EnglishWords.add("rude");
        EnglishWords.add("quickly / fast");
        EnglishWords.add("Native speaker");
        EnglishWords.add("morning");
        EnglishWords.add("evening");
        EnglishWords.add("in the morning");
        EnglishWords.add("in the evening");
        EnglishWords.add("at 12 o'clock");
        EnglishWords.add("in the afternoon");//475
        EnglishWords.add("sentence");
        EnglishWords.add("in the third");
        EnglishWords.add("in the next");
        EnglishWords.add("in the example");
        EnglishWords.add("child");
        EnglishWords.add("adult");
        EnglishWords.add("grown up");
        EnglishWords.add("thin");
        EnglishWords.add("slim");
        EnglishWords.add("sell");//485
        EnglishWords.add("little");
        EnglishWords.add("forget");
        EnglishWords.add("light");
        EnglishWords.add("divorced");
        EnglishWords.add("cry");
        EnglishWords.add("tall");
        EnglishWords.add("advanced");
        EnglishWords.add("beginner");
        EnglishWords.add("intermediate");
        EnglishWords.add("Pre-intermediate");//495
        EnglishWords.add("Upper-intermediate");
        EnglishWords.add("educated");
        EnglishWords.add("each of us");
        EnglishWords.add("personal");
        EnglishWords.add("clear explanations");
        EnglishWords.add("behave");
        EnglishWords.add("reading");
        EnglishWords.add("in the same place");
        EnglishWords.add("unclear");
        EnglishWords.add("a specialist in this area");//505
        EnglishWords.add("training");
        EnglishWords.add("minimize");
        EnglishWords.add("costs");
        EnglishWords.add("get tired");
        EnglishWords.add("soon");
        EnglishWords.add("maximize");
        EnglishWords.add("get");
        EnglishWords.add("manipulate");
        EnglishWords.add("achieve");
        EnglishWords.add("aim");//515
        EnglishWords.add("think it over");
        EnglishWords.add("grateful to");
        EnglishWords.add("grateful for");
        EnglishWords.add("save");
        EnglishWords.add("some");
        EnglishWords.add("explain to");
        EnglishWords.add("alternative");
        EnglishWords.add("get married");
        EnglishWords.add("marry her");
        EnglishWords.add("repair");//525
        EnglishWords.add("create");
        EnglishWords.add("marry him");
        EnglishWords.add("follow");
        EnglishWords.add("shock");
        EnglishWords.add("surprise");
        EnglishWords.add("uncomfortable");
        EnglishWords.add("surprise you greatly");
        EnglishWords.add("sooner or later");
        EnglishWords.add("explain it to us");
        EnglishWords.add("not only");//535
        EnglishWords.add("reinvent the wheel");
        EnglishWords.add("very surprised");
        EnglishWords.add("Everyone");
        EnglishWords.add("disappointed");
        EnglishWords.add("sales manager");
        EnglishWords.add("calculate");
        EnglishWords.add("forgive");
        EnglishWords.add("hurry up");
        EnglishWords.add("lend");
        EnglishWords.add("sum");//545
        EnglishWords.add("sum of money");
        EnglishWords.add("borrow");
        EnglishWords.add("The authorities");
        EnglishWords.add("regulate");
        EnglishWords.add("somehow");
        EnglishWords.add("devote to");
        EnglishWords.add("health");
        EnglishWords.add("confuse / mix up");
        EnglishWords.add("but, of course");
        EnglishWords.add("a different meaning");//555
        EnglishWords.add("regret it");
        EnglishWords.add("measure");
        EnglishWords.add("punish");
        EnglishWords.add("apologize");
        EnglishWords.add("devote more free time to");
        EnglishWords.add("pass");
        EnglishWords.add("preparation");
        EnglishWords.add("solution to");
        EnglishWords.add("guarantee");
        EnglishWords.add("dictionary");//565
        EnglishWords.add("lead to success");
        EnglishWords.add("interrupt");
        EnglishWords.add("take part");
        EnglishWords.add("in competition");
        EnglishWords.add("in tournament");
        EnglishWords.add("in championship");
        EnglishWords.add("in contest");
        EnglishWords.add("influence");
        EnglishWords.add("record");
        EnglishWords.add("uninformative");//575
        EnglishWords.add("smoke");
        EnglishWords.add("anymore");
        EnglishWords.add("any longer");
        EnglishWords.add("deny");
        EnglishWords.add("legal");
        EnglishWords.add("illegal");
        EnglishWords.add("invest");
        EnglishWords.add("react to");
        EnglishWords.add("continue");
        EnglishWords.add("insist on");//585
        EnglishWords.add("in one day");
        EnglishWords.add("notice");
        EnglishWords.add("guest");
        EnglishWords.add("absence");
        EnglishWords.add("grandfather");
        EnglishWords.add("absent");
        EnglishWords.add("present");
        EnglishWords.add("attractive");
        EnglishWords.add("the only right");
        EnglishWords.add("approach");//595
        EnglishWords.add("innovative");
        EnglishWords.add("step");
        EnglishWords.add("radical");
        EnglishWords.add("automatically");
        EnglishWords.add("event");
        EnglishWords.add("publish");
        EnglishWords.add("attitude");
        EnglishWords.add("attitude to");
        EnglishWords.add("towards");
        EnglishWords.add("point at");//605
        EnglishWords.add("last forever");
        EnglishWords.add("last for");
        EnglishWords.add("hour");
        EnglishWords.add("about");
        EnglishWords.add("the day after tomorrow");
        EnglishWords.add("inform");
        EnglishWords.add("in the end");
        EnglishWords.add("in the beginning");
        EnglishWords.add("at the end of");
        EnglishWords.add("at the beginning of");//615
        EnglishWords.add("available");
        EnglishWords.add("financial problems");
        EnglishWords.add("get dark");
        EnglishWords.add("main");
        EnglishWords.add("sign");
        EnglishWords.add("report");
        EnglishWords.add("commercial");
        EnglishWords.add("potential");
        EnglishWords.add("threat");
        EnglishWords.add("miss");//625
        EnglishWords.add("more intensively");
        EnglishWords.add("much higher");
        EnglishWords.add("pronunciation");
        EnglishWords.add("catch");
        EnglishWords.add("criminal");
        EnglishWords.add("guess");
        EnglishWords.add("look at me");
        EnglishWords.add("impress");
        EnglishWords.add("al last");
        EnglishWords.add("fail");//635
        EnglishWords.add("express");
        EnglishWords.add("satisfy");
        EnglishWords.add("satisfaction");
        EnglishWords.add("dissatisfaction");
        EnglishWords.add("the current situation");
        EnglishWords.add("join");
        EnglishWords.add("produce");
        EnglishWords.add("come back");
        EnglishWords.add("return");
        EnglishWords.add("belong to");//645
        EnglishWords.add("literature");
        EnglishWords.add("materials");
        EnglishWords.add("Whose");
        EnglishWords.add("start doing");
        EnglishWords.add("continue doing");
        EnglishWords.add("finish doing");
        EnglishWords.add("take place");
        EnglishWords.add("on a regular basis");
        EnglishWords.add("owe them");
        EnglishWords.add("this kind of");//655
        EnglishWords.add("employee");
        EnglishWords.add("worker");
        EnglishWords.add("make a report");
        EnglishWords.add("write a report");
        EnglishWords.add("He is out");
        EnglishWords.add("He is away");
        EnglishWords.add("suit");
        EnglishWords.add("a standard procedure");
        EnglishWords.add("keep");
        EnglishWords.add("in a year");//665
        EnglishWords.add("resolve this conflict");
        EnglishWords.add("It will be necessary");
        EnglishWords.add("thoroughly");
        EnglishWords.add("careful");
        EnglishWords.add("carefully");
        EnglishWords.add("earn");
        EnglishWords.add("everywhere");
        EnglishWords.add("fruit");
        EnglishWords.add("vegetables");
        EnglishWords.add("eat");//675
        EnglishWords.add("achievement");
        EnglishWords.add("send");
        EnglishWords.add("receive");
        EnglishWords.add("letter");
        EnglishWords.add("smile at");
        EnglishWords.add("spend on");
        EnglishWords.add("translate from / into");
        EnglishWords.add("proud of");
        EnglishWords.add("tired of");
        EnglishWords.add("good at");//685
        EnglishWords.add("bad at");
        EnglishWords.add("not necessarily mean");
        EnglishWords.add("reason for");
        EnglishWords.add("double");
        EnglishWords.add("sales");
        EnglishWords.add("despite");
        EnglishWords.add("in spite of");
        EnglishWords.add("the crisis");
        EnglishWords.add("significantly / considerably");
        EnglishWords.add("and so on / et cetera");//695
        EnglishWords.add("a huge / tremendous success");
        EnglishWords.add("forever");
        EnglishWords.add("stay at home");
        EnglishWords.add("initiative");
        EnglishWords.add("You'll be lucky");
        EnglishWords.add("look it up in");
        EnglishWords.add("learn English for free");
        EnglishWords.add("I'll be out");
        EnglishWords.add("go to the restaurant");
        EnglishWords.add("a real sensation");//705
        EnglishWords.add("It seems to me");
        EnglishWords.add("wish");
        EnglishWords.add("deserve");
        EnglishWords.add("almost");
        EnglishWords.add("get in touch with");
        EnglishWords.add("a couple of");
        EnglishWords.add("turn");
        EnglishWords.add("year ago");
        EnglishWords.add("happily");
        EnglishWords.add("include");//715
        EnglishWords.add("turn/switch on");
        EnglishWords.add("turn/switch off");
        EnglishWords.add("near that");
        EnglishWords.add("on foot");
        EnglishWords.add("prestigious");
        EnglishWords.add("last year");
        EnglishWords.add("the day before yesterday");
        EnglishWords.add("a strong level");
        EnglishWords.add("and then");
        EnglishWords.add("suddenly");//725
        EnglishWords.add("unexpectedly");
        EnglishWords.add("suggest doing something");
        EnglishWords.add("calm");
        EnglishWords.add("develop");
        EnglishWords.add("abilities");
        EnglishWords.add("skills");
        EnglishWords.add("require");
        EnglishWords.add("efforts");
        EnglishWords.add("goods");
        EnglishWords.add("difficulties");//735
        EnglishWords.add("appearance");
        EnglishWords.add("partly");
        EnglishWords.add("the following questions");
        EnglishWords.add("opportunity");
        EnglishWords.add("imagine");
        EnglishWords.add("imagination");
        EnglishWords.add("knock at/on the door");
        EnglishWords.add("all the best");
        EnglishWords.add("introduce");
        EnglishWords.add("soldier");//745
        EnglishWords.add("order");
        EnglishWords.add("jump over");
        EnglishWords.add("fill in");
        EnglishWords.add("accuse");
        EnglishWords.add("accusation");
        EnglishWords.add("invite you to");
        EnglishWords.add("monthly");
        EnglishWords.add("the fence");
        EnglishWords.add("clothes");
        EnglishWords.add("speech");//755
        EnglishWords.add("consider");
        EnglishWords.add("half an hour");
        EnglishWords.add("about an hour");
        EnglishWords.add("more than 20 min");
        EnglishWords.add("attention");
        EnglishWords.add("very rarely");
        EnglishWords.add("task");
        EnglishWords.add("cross");
        EnglishWords.add("by mistake");
        EnglishWords.add("confirm");//765
        EnglishWords.add("the date of meeting");
        EnglishWords.add("the time of meeting");
        EnglishWords.add("topic");
        EnglishWords.add("conversation");
        EnglishWords.add("completely");
        EnglishWords.add("several");
        EnglishWords.add("part");
        EnglishWords.add("wash");
        EnglishWords.add("wash up the dishes");
        EnglishWords.add("pack");//775
        EnglishWords.add("not far from here");
        EnglishWords.add("saints");
        EnglishWords.add("It often rains there");
        EnglishWords.add("thief");
        EnglishWords.add("snowed");
        EnglishWords.add("accident");
        EnglishWords.add("hands");
        EnglishWords.add("face");
        EnglishWords.add("crime");
        EnglishWords.add("divide into");//785
        EnglishWords.add("parcel to");
        EnglishWords.add("inform of");
        EnglishWords.add("take");
        EnglishWords.add("repeat");
        EnglishWords.add("arrest");
        EnglishWords.add("well-paid");
        EnglishWords.add("to our surprise");
        EnglishWords.add("unexpected");
        EnglishWords.add("walk");
        EnglishWords.add("after midnight");//795
        EnglishWords.add("enemy");
        EnglishWords.add("the village");
        EnglishWords.add("to keep word");
        EnglishWords.add("suspicious");
        EnglishWords.add("innocent");
        EnglishWords.add("during");
        EnglishWords.add("immediately / at once");
        EnglishWords.add("lecture");
        EnglishWords.add("guilt");
        EnglishWords.add("defend");//805
        EnglishWords.add("cousin");
        EnglishWords.add("park");
        EnglishWords.add("unique");
        EnglishWords.add("wine");
        EnglishWords.add("guite rarely");
        EnglishWords.add("for hours");
        EnglishWords.add("daily");
        EnglishWords.add("anniversary");
        EnglishWords.add("cook lunch");
        EnglishWords.add("cook dinner");//815
        EnglishWords.add("cook breakfast");
        EnglishWords.add("respect");
        EnglishWords.add("deliver");
        EnglishWords.add("beauty");
        EnglishWords.add("for no reason");
        EnglishWords.add("remain");
        EnglishWords.add("theory");
        EnglishWords.add("move to");
        EnglishWords.add("provide");
        EnglishWords.add("figure");//825
        EnglishWords.add("well-known");
        EnglishWords.add("by accident");
        EnglishWords.add("have a good/great time");
        EnglishWords.add("do someone a favour");
        EnglishWords.add("bitterly disappointed");
        EnglishWords.add("put off");
        EnglishWords.add("quietly");
        EnglishWords.add("loudly");
        EnglishWords.add("instead of");
        EnglishWords.add("for the first time");//835
        EnglishWords.add("differently");
        EnglishWords.add("upset");
        EnglishWords.add("wallet");
        EnglishWords.add("find out");
        EnglishWords.add("give up");
        EnglishWords.add("mean to");
        EnglishWords.add("an hour later");
        EnglishWords.add("outstanding");
        EnglishWords.add("let");
        EnglishWords.add("leave for");//845
        EnglishWords.add("sit down");
        EnglishWords.add("stand");
        EnglishWords.add("behind");
        EnglishWords.add("lose");
        EnglishWords.add("meet");
        EnglishWords.add("classmate");
        EnglishWords.add("set");
        EnglishWords.add("set up");
        EnglishWords.add("glass of");
        EnglishWords.add("by heart");//855
        EnglishWords.add("cut into");
        EnglishWords.add("the meat");
        EnglishWords.add("piece");

    }

    public void RusWords() {
        RussianWords.add("помнить");
        RussianWords.add("учиться,изучать");
        RussianWords.add("они");
        RussianWords.add("здесь");
        RussianWords.add("очень хорошо");
        RussianWords.add("в этом");
        RussianWords.add("так,такой,такая");
        RussianWords.add("там");
        RussianWords.add("страна");
        RussianWords.add("очень усердно");
        RussianWords.add("чувствовать себя");
        RussianWords.add("счастливый");
        RussianWords.add("также");
        RussianWords.add("место");
        RussianWords.add("реально,действительно");
        RussianWords.add("казаться,кажется");
        RussianWords.add("выглядит");//17
        RussianWords.add("на английском");
        RussianWords.add("читать");
        RussianWords.add("странно");
        RussianWords.add("эта,эту");
        RussianWords.add("та,ту");
        RussianWords.add("ошибка");
        RussianWords.add("случаться,происходит");
        RussianWords.add("больше,еще");//25
        RussianWords.add("практика");
        RussianWords.add("часто");
        RussianWords.add("ходить в школу");
        RussianWords.add("ходить в кино");
        RussianWords.add("ходить в парк");
        RussianWords.add("выполнять,делать");
        RussianWords.add("делать");
        RussianWords.add("считать");
        RussianWords.add("предложение");
        RussianWords.add("преподавать");//35
        RussianWords.add("скучать по(тебе,ней)");
        RussianWords.add("всегда");
        RussianWords.add("его");
        RussianWords.add("вовремя");
        RussianWords.add("обычно");
        RussianWords.add("расслабляться дома");
        RussianWords.add("отдыхать дома");
        RussianWords.add("выучить английский");
        RussianWords.add("найти работу");
        RussianWords.add("иногда");//45
        RussianWords.add("польза,полезно");
        RussianWords.add("всё");
        RussianWords.add("всё");
        RussianWords.add("её");
        RussianWords.add("урок");
        RussianWords.add("их");
        RussianWords.add("прибыль");
        RussianWords.add("также,то же самое");
        RussianWords.add("девушка");
        RussianWords.add("парень");//55
        RussianWords.add("очень сильно");
        RussianWords.add("поддерживать");
        RussianWords.add("прийти на работу");
        RussianWords.add("идти домой");
        RussianWords.add("прийти домой");
        RussianWords.add("вещь");
        RussianWords.add("рано");
        RussianWords.add("поздно");
        RussianWords.add("слово");
        RussianWords.add("успех");//65
        RussianWords.add("платье");
        RussianWords.add("квартира");
        RussianWords.add("улучшить");
        RussianWords.add("говорить на английском правильно");
        RussianWords.add("выучить английски быстро");
        RussianWords.add("быть");
        RussianWords.add("прямо сейчас");
        RussianWords.add("говорить на английском свободно");
        RussianWords.add("ещё раз");
        RussianWords.add("жить заграницей");//75
        RussianWords.add("другой");
        RussianWords.add("спасибо тебе");
        RussianWords.add("спасибо большое");
        RussianWords.add("большое спасибо");
        RussianWords.add("мне нравится");
        RussianWords.add("мне действительно нравится");
        RussianWords.add("мне нравится это также");
        RussianWords.add("нам нравится");
        RussianWords.add("тебе нравится");
        RussianWords.add("им нравится");//85
        RussianWords.add("ему нравится");
        RussianWords.add("ей нравится");
        RussianWords.add("отель");
        RussianWords.add("я хотел бы");
        RussianWords.add("чашка");
        RussianWords.add("пить,напиток");
        RussianWords.add("посетить");
        RussianWords.add("стать");
        RussianWords.add("согласен");
        RussianWords.add("обсуждать");//95
        RussianWords.add("позже,спустя");
        RussianWords.add("сказать тебе");
        RussianWords.add("об,о");
        RussianWords.add("интересоваться");
        RussianWords.add("атаковать");
        RussianWords.add("рекомендовать");
        RussianWords.add("сын");
        RussianWords.add("дочь");
        RussianWords.add("жить");
        RussianWords.add("жизнь");//105
        RussianWords.add("изменить");
        RussianWords.add("Я с моим другом");
        RussianWords.add("звонить");
        RussianWords.add("верить");
        RussianWords.add("им");
        RussianWords.add("нас");
        RussianWords.add("приносить");
        RussianWords.add("счастье");
        RussianWords.add("усерднее");
        RussianWords.add("исправить");//115
        RussianWords.add("решить проблему");
        RussianWords.add("правило");
        RussianWords.add("во все");
        RussianWords.add("любой");
        RussianWords.add("совет,советовать");
        RussianWords.add("меньше");
        RussianWords.add("платить за");
        RussianWords.add("время от времени");
        RussianWords.add("так много");
        RussianWords.add("заказывать,приказывать");//125
        RussianWords.add("вопрос");
        RussianWords.add("мотивировать");
        RussianWords.add("объяснять");
        RussianWords.add("как можно скорее");
        RussianWords.add("тренировать");
        RussianWords.add("память");
        RussianWords.add("регулярно");
        RussianWords.add("статья,артикль");
        RussianWords.add("красивая");
        RussianWords.add("Я с моей девушкой");//135
        RussianWords.add("показывать");
        RussianWords.add("работать над");
        RussianWords.add("решение");
        RussianWords.add("классическая");
        RussianWords.add("песня");
        RussianWords.add("слушать музыку");
        RussianWords.add("использовать");
        RussianWords.add("пользоваться интернетом");
        RussianWords.add("ходить в зал");
        RussianWords.add("достаточно");//145
        RussianWords.add("знания");
        RussianWords.add("игрнорировать");
        RussianWords.add("ненавидеть");
        RussianWords.add("искать работу");
        RussianWords.add("слышать");
        RussianWords.add("слушать радио");
        RussianWords.add("смотреть");
        RussianWords.add("проект");
        RussianWords.add("профессия");
        RussianWords.add("скучный");//155
        RussianWords.add("бесполезно");
        RussianWords.add("важно");
        RussianWords.add("неважно");
        RussianWords.add("экзамен");
        RussianWords.add("очеь сложно");
        RussianWords.add("очень легко");
        RussianWords.add("всю правду");
        RussianWords.add("отличные результаты");
        RussianWords.add("блестящие результаты");
        RussianWords.add("сделать ошибку");//165
        RussianWords.add("ситуация");
        RussianWords.add("упражнение");
        RussianWords.add("слишком легко");
        RussianWords.add("зависит(ь)");
        RussianWords.add("зависит(ь) от");
        RussianWords.add("где,куда");
        RussianWords.add("проводить время");
        RussianWords.add("вместе");
        RussianWords.add("почему,зачем");
        RussianWords.add("что");//175
        RussianWords.add("как");
        RussianWords.add("когда");
        RussianWords.add("добираться до работы");
        RussianWords.add("добирать до этого места");
        RussianWords.add("добираться до того места");
        RussianWords.add("добираться до сюда");
        RussianWords.add("добираться до туда");
        RussianWords.add("добираться до дома");
        RussianWords.add("предпочитать");
        RussianWords.add("просыпаться,вставать");//185
        RussianWords.add("ложиться спать");
        RussianWords.add("жаловаться");
        RussianWords.add("отказываться");
        RussianWords.add("снова и снова");
        RussianWords.add("добавить");
        RussianWords.add("волноваться");
        RussianWords.add("фильм");
        RussianWords.add("фильм");
        RussianWords.add("различные,разные");
        RussianWords.add("который,которое");//195
        RussianWords.add("уехать из,покидать");
        RussianWords.add("ходить в зоопарк");
        RussianWords.add("критиковать");
        RussianWords.add("не соглашаться");
        RussianWords.add("обещать");
        RussianWords.add("ответ,отвечать");
        RussianWords.add("путешествовать");
        RussianWords.add("намного больше");
        RussianWords.add("с большим удовольствием");
        RussianWords.add("разделять,делиться");//205
        RussianWords.add("точка зрения");
        RussianWords.add("вдохновлять");
        RussianWords.add("упоминать");
        RussianWords.add("спрашивать");
        RussianWords.add("театр");
        RussianWords.add("более лучшая работа");
        RussianWords.add("давай поговорим");
        RussianWords.add("работа по-дому");
        RussianWords.add("но");
        RussianWords.add("с ними");//215
        RussianWords.add("с нами");
        RussianWords.add("на работе");
        RussianWords.add("дома");
        RussianWords.add("в школе");
        RussianWords.add("уверен,уверенный");
        RussianWords.add("добрый");
        RussianWords.add("богатый");
        RussianWords.add("бедный");
        RussianWords.add("ленивый");
        RussianWords.add("муж");//225
        RussianWords.add("жена");
        RussianWords.add("высокий");
        RussianWords.add("низкий");
        RussianWords.add("деталь");
        RussianWords.add("информативный");
        RussianWords.add("маленькая ошибка");
        RussianWords.add("самый лучший");
        RussianWords.add("в мире");
        RussianWords.add("пример");
        RussianWords.add("слишком");//235
        RussianWords.add("слишком скучно");
        RussianWords.add("дорого");
        RussianWords.add("дёшево");
        RussianWords.add("холодно");
        RussianWords.add("тепло");
        RussianWords.add("жарко,горячо");
        RussianWords.add("прекрано");
        RussianWords.add("великолепно,великий");
        RussianWords.add("дождливо");
        RussianWords.add("солнечно");//245
        RussianWords.add("очевидно");
        RussianWords.add("возможно");
        RussianWords.add("просто");
        RussianWords.add("невозможно");
        RussianWords.add("направо");
        RussianWords.add("налево");
        RussianWords.add("у меня хорошо");
        RussianWords.add("хуже");
        RussianWords.add("молодой человек(мужчина)");
        RussianWords.add("встреча");//255
        RussianWords.add("популярно");
        RussianWords.add("умный");
        RussianWords.add("смышленный");
        RussianWords.add("талантливый");
        RussianWords.add("эффективный");
        RussianWords.add("мудрый(ая)");
        RussianWords.add("рассказ,история");
        RussianWords.add("трудолюбивый");
        RussianWords.add("занят");
        RussianWords.add("в настоящий момент");//265
        RussianWords.add("дизайнер");
        RussianWords.add("мужчины");
        RussianWords.add("женщины");
        RussianWords.add("маленькая проблема");
        RussianWords.add("чувство");
        RussianWords.add("сила,энергия");
        RussianWords.add("Китайский");
        RussianWords.add("Ветренно");
        RussianWords.add("женат");
        RussianWords.add("холост");//275
        RussianWords.add("уставший");
        RussianWords.add("полон(чем-то))");
        RussianWords.add("злой,рассерженный");
        RussianWords.add("грустный");
        RussianWords.add("неправ");
        RussianWords.add("на превом месте");
        RussianWords.add("коллеги");
        RussianWords.add("на втором месте");
        RussianWords.add("успешный");
        RussianWords.add("неуспешный");//285
        RussianWords.add("старый");
        RussianWords.add("молодой");
        RussianWords.add("в городе");
        RussianWords.add("певец");
        RussianWords.add("актриса");
        RussianWords.add("актер");
        RussianWords.add("далеко");
        RussianWords.add("близко");
        RussianWords.add("особое предложение");
        RussianWords.add("в правильном месте");//295
        RussianWords.add("удачливый");
        RussianWords.add("в неправильном месте");
        RussianWords.add("в здании");
        RussianWords.add("мнение");
        RussianWords.add("собственный,владеть");
        RussianWords.add("смешно(й),забаный");
        RussianWords.add("газета");
        RussianWords.add("журнал");
        RussianWords.add("дети");
        RussianWords.add("опасно");//305
        RussianWords.add("сильный,мощный");
        RussianWords.add("прибыльная");
        RussianWords.add("знаменитый");
        RussianWords.add("новости");
        RussianWords.add("карман");
        RussianWords.add("сумка,рюкзак");
        RussianWords.add("против");
        RussianWords.add("стоимость");
        RussianWords.add("ближайший");
        RussianWords.add("брюки");//315
        RussianWords.add("пара брюк");
        RussianWords.add("джинсы");
        RussianWords.add("в командировке");
        RussianWords.add("в отпуске");
        RussianWords.add("манера");
        RussianWords.add("удовлетворен(чем-то)");
        RussianWords.add("оптимистичный");
        RussianWords.add("пессимистичный");
        RussianWords.add("в ванной");
        RussianWords.add("на кухне");//325
        RussianWords.add("карандаш");
        RussianWords.add("бояться");
        RussianWords.add("бояться(кого-то,чего-то)");
        RussianWords.add("страсть");
        RussianWords.add("рад");
        RussianWords.add("смеяться над");
        RussianWords.add("стратегия");
        RussianWords.add("наслаждаться");
        RussianWords.add("чужой,иностранный");
        RussianWords.add("серьёзно");//335
        RussianWords.add("шутка");
        RussianWords.add("музыкант");
        RussianWords.add("экспрет");
        RussianWords.add("область");
        RussianWords.add("потея времени");
        RussianWords.add("комфортно");
        RussianWords.add("мечта,сон");
        RussianWords.add("выбор");
        RussianWords.add("необходимый");
        RussianWords.add("естественный,природный");//345
        RussianWords.add("на полу");
        RussianWords.add("шанс");
        RussianWords.add("сравнивать");
        RussianWords.add("матч");
        RussianWords.add("конференция");
        RussianWords.add("громко");
        RussianWords.add("интенсивный");
        RussianWords.add("поведение");
        RussianWords.add("лето");
        RussianWords.add("весна");//355
        RussianWords.add("осень");
        RussianWords.add("зима");
        RussianWords.add("предмет");
        RussianWords.add("адаптироваться к");
        RussianWords.add("условие");
        RussianWords.add("готовиться к");
        RussianWords.add("атаковать");
        RussianWords.add("доверять");
        RussianWords.add("стимулировать");
        RussianWords.add("специалист");//365
        RussianWords.add("сумашедший");
        RussianWords.add("безумный");
        RussianWords.add("турист");
        RussianWords.add("болен");
        RussianWords.add("болезнь");
        RussianWords.add("дружелюбный");
        RussianWords.add("толстый");
        RussianWords.add("рекомендация");
        RussianWords.add("удивительный");
        RussianWords.add("бранд");//375
        RussianWords.add("удобное(речь о времени)");
        RussianWords.add("неудобное(речь о времени)");
        RussianWords.add("стул");
        RussianWords.add("кресло");
        RussianWords.add("ключ");
        RussianWords.add("стол");
        RussianWords.add("письменный стол");
        RussianWords.add("презентация");
        RussianWords.add("непонятно");
        RussianWords.add("ходить за покупками");//385
        RussianWords.add("делать покупки");
        RussianWords.add("общаться");
        RussianWords.add("другие,другое");
        RussianWords.add("элементарный");
        RussianWords.add("зарплата");
        RussianWords.add("затрава");
        RussianWords.add("сегодня");
        RussianWords.add("клиника");
        RussianWords.add("цена");
        RussianWords.add("салат");//395
        RussianWords.add("торт");
        RussianWords.add("пирог");
        RussianWords.add("мебель");
        RussianWords.add("реклама");
        RussianWords.add("рекламное объявление");
        RussianWords.add("атмосфера");
        RussianWords.add("анализ");
        RussianWords.add("данные");
        RussianWords.add("записать это");
        RussianWords.add("формальный");//405
        RussianWords.add("неформальный");
        RussianWords.add("несчастливый");
        RussianWords.add("вежливый");
        RussianWords.add("невежливый");
        RussianWords.add("моральный");
        RussianWords.add("аморальный");
        RussianWords.add("хороший результат");
        RussianWords.add("конкурировать");
        RussianWords.add("готовить хорошо");
        RussianWords.add("Я обожаю...");//415
        RussianWords.add("платеж");
        RussianWords.add("журналист");
        RussianWords.add("необычный");
        RussianWords.add("тратить");
        RussianWords.add("один,одна");
        RussianWords.add("опыт,испытать");
        RussianWords.add("в аэропорту");
        RussianWords.add("Я надеюсь");
        RussianWords.add("страший брат");
        RussianWords.add("младший брат");//425
        RussianWords.add("вкусная");
        RussianWords.add("очень вкусная");
        RussianWords.add("очень очень вкусная");
        RussianWords.add("значение(чего-то)");
        RussianWords.add("фраза");
        RussianWords.add("выражение");
        RussianWords.add("иметь ввиду,означает");
        RussianWords.add("что");
        RussianWords.add("в этом году");
        RussianWords.add("в следующем году");//435
        RussianWords.add("к завтрашнему дню");
        RussianWords.add("к следующей неделе");
        RussianWords.add("к следующему месяцу");
        RussianWords.add("к следующему году");
        RussianWords.add("друг друга");
        RussianWords.add("раздельно");
        RussianWords.add("интересоваться в");
        RussianWords.add("увлекаться(чем-то)");
        RussianWords.add("некоторые люди");
        RussianWords.add("праздновать");//445
        RussianWords.add("чтобы");
        RussianWords.add("неправильный");
        RussianWords.add("поблагодорить(кого-то)");
        RussianWords.add("объяснения");
        RussianWords.add("простота(чего-то)");
        RussianWords.add("сообщество");
        RussianWords.add("пугать");
        RussianWords.add("в данный момент");
        RussianWords.add("восхищаться");
        RussianWords.add("осознавать");//455
        RussianWords.add("могу");
        RussianWords.add("должен");
        RussianWords.add("следует");
        RussianWords.add("возможо");
        RussianWords.add("плавать");
        RussianWords.add("медленно");
        RussianWords.add("наихудший");
        RussianWords.add("длинный");
        RussianWords.add("самый длинный");
        RussianWords.add("самое интересное");//465
        RussianWords.add("река");
        RussianWords.add("грубый");
        RussianWords.add("быстрый");
        RussianWords.add("носитель языка");
        RussianWords.add("утро");
        RussianWords.add("вечер");
        RussianWords.add("утром");
        RussianWords.add("вечером");
        RussianWords.add("в 12 часов");
        RussianWords.add("днём");//475
        RussianWords.add("предложение(в тексте)");
        RussianWords.add("в третьем");
        RussianWords.add("в следующем");
        RussianWords.add("в примере");
        RussianWords.add("ребенок");
        RussianWords.add("взрослый");
        RussianWords.add("взрослый");
        RussianWords.add("худой");
        RussianWords.add("стройная");
        RussianWords.add("продавать");//485
        RussianWords.add("маленький");
        RussianWords.add("забыть");
        RussianWords.add("свет");
        RussianWords.add("разведен");
        RussianWords.add("плакать,кричать");
        RussianWords.add("высокий");
        RussianWords.add("продвинутый");
        RussianWords.add("начинающий");
        RussianWords.add("средний");
        RussianWords.add("ниже среднего");//495
        RussianWords.add("выше среднего");
        RussianWords.add("образованный");
        RussianWords.add("каждый из нас");
        RussianWords.add("личные");
        RussianWords.add("ясные объяснения");
        RussianWords.add("вести себя");
        RussianWords.add("чтение");
        RussianWords.add("в том же месте");
        RussianWords.add("неясно");
        RussianWords.add("спциалист в этой области");//505
        RussianWords.add("тренировка,обучение");
        RussianWords.add("минимизировать");
        RussianWords.add("издержки");
        RussianWords.add("уставать");
        RussianWords.add("скоро");
        RussianWords.add("максимизировать");
        RussianWords.add("становиться,получать");
        RussianWords.add("манипулировать");
        RussianWords.add("достигать");
        RussianWords.add("цель");//515
        RussianWords.add("обдумать это");
        RussianWords.add("благодарен(кому-то)");
        RussianWords.add("благодарен(за что-то)");
        RussianWords.add("сохранить,спасти");
        RussianWords.add("некоторые");
        RussianWords.add("объяснить(кому-то)");
        RussianWords.add("альтернатива");
        RussianWords.add("пожениться");
        RussianWords.add("жениться на ней");
        RussianWords.add("чинить");//525
        RussianWords.add("создавать");
        RussianWords.add("выйти замуж");
        RussianWords.add("последовать");
        RussianWords.add("шокировать");
        RussianWords.add("удивить");
        RussianWords.add("дискомфортный");
        RussianWords.add("удивить тебя очень сильно");
        RussianWords.add("рано или поздно");
        RussianWords.add("объяснить это нам");
        RussianWords.add("не только");//535
        RussianWords.add("изобретать заново колесо");
        RussianWords.add("очень удивлен");
        RussianWords.add("все");
        RussianWords.add("разочарован");
        RussianWords.add("менеджер по продажам");
        RussianWords.add("посчитать,вычислять");
        RussianWords.add("простить");
        RussianWords.add("торопиться");
        RussianWords.add("одолжить");
        RussianWords.add("сумма");//545
        RussianWords.add("сумма денег");
        RussianWords.add("занять(деньги)");
        RussianWords.add("власти");
        RussianWords.add("регулировать");
        RussianWords.add("как-то");
        RussianWords.add("удилять");
        RussianWords.add("здоровье");
        RussianWords.add("путать");
        RussianWords.add("но конечно");
        RussianWords.add("разное значение");//555
        RussianWords.add("жалеть об этом");
        RussianWords.add("мера");
        RussianWords.add("наказать");
        RussianWords.add("извиниться");
        RussianWords.add("удилять больше свободного времени");
        RussianWords.add("сдать");
        RussianWords.add("подготовка");
        RussianWords.add("решение(чего-то)");
        RussianWords.add("гарантировать");
        RussianWords.add("словарь");//565
        RussianWords.add("приведет к успеху");
        RussianWords.add("перебивать,прервать");
        RussianWords.add("приянть участие");
        RussianWords.add("в соревновании");
        RussianWords.add("в турнире");
        RussianWords.add("в чемпионате");
        RussianWords.add("в схватке");
        RussianWords.add("влиять");
        RussianWords.add("записывать");
        RussianWords.add("неинформативный");//575
        RussianWords.add("курить");
        RussianWords.add("больше");
        RussianWords.add("дольше,дальше");
        RussianWords.add("отрицать");
        RussianWords.add("легальный");
        RussianWords.add("нелегальный");
        RussianWords.add("инвестировать");
        RussianWords.add("реагировать на");
        RussianWords.add("продолжить");
        RussianWords.add("настаивать над");//585
        RussianWords.add("за день");
        RussianWords.add("заметить");
        RussianWords.add("гость");
        RussianWords.add("отсутствие");
        RussianWords.add("дедушка");
        RussianWords.add("отсутствовать");
        RussianWords.add("присутствовать");
        RussianWords.add("привлекательная");
        RussianWords.add("единственно правильным");
        RussianWords.add("подход");//595
        RussianWords.add("инновационный");
        RussianWords.add("шаг");
        RussianWords.add("радикальный");
        RussianWords.add("автоматически");
        RussianWords.add("событие");
        RussianWords.add("опубликовать");
        RussianWords.add("отношения");
        RussianWords.add("отношение к");
        RussianWords.add("отношение к");
        RussianWords.add("указать на");//605
        RussianWords.add("длится вечно");
        RussianWords.add("длится");
        RussianWords.add("час");
        RussianWords.add("около");
        RussianWords.add("послезавтра");
        RussianWords.add("информативный");
        RussianWords.add("в конце");
        RussianWords.add("в начале");
        RussianWords.add("в конце(чего-то)");
        RussianWords.add("в начале(чего-то)");//615
        RussianWords.add("доступный");
        RussianWords.add("финансовые проблемы");
        RussianWords.add("темнеть");
        RussianWords.add("главный");
        RussianWords.add("подписать");
        RussianWords.add("отчёт");
        RussianWords.add("комерческий");
        RussianWords.add("потенциальный");
        RussianWords.add("угроза");
        RussianWords.add("пропустить");//625
        RussianWords.add("более интенсивно");
        RussianWords.add("намного выше");
        RussianWords.add("произношение");
        RussianWords.add("поймать");
        RussianWords.add("преступник");
        RussianWords.add("отгадать");
        RussianWords.add("посмотри на меня");
        RussianWords.add("впечатлять");
        RussianWords.add("наконец");
        RussianWords.add("завалить");//635
        RussianWords.add("выражать");
        RussianWords.add("удовлетворять");
        RussianWords.add("удовлетворение");
        RussianWords.add("недовольство");
        RussianWords.add("текущая ситуация");
        RussianWords.add("присоединиться к");
        RussianWords.add("производить");
        RussianWords.add("вернуться");
        RussianWords.add("вернуться");
        RussianWords.add("принадлежит(кому-то)");//645
        RussianWords.add("литература");
        RussianWords.add("материалы");
        RussianWords.add("чей");
        RussianWords.add("начать делать");
        RussianWords.add("продолжить делать");
        RussianWords.add("закончить делать");
        RussianWords.add("проходить(мероприятие)");
        RussianWords.add("на регулярной основе");
        RussianWords.add("должен им");
        RussianWords.add("такого рода");//655
        RussianWords.add("рабочий(компании)");
        RussianWords.add("рабочий");
        RussianWords.add("сделать отчет");
        RussianWords.add("написать отчет");
        RussianWords.add("Он не дома");
        RussianWords.add("Он отсутствует(т.е уехал)");
        RussianWords.add("подходит(вещь)");
        RussianWords.add("стандартная процедура");
        RussianWords.add("сохранить,уберечь");
        RussianWords.add("за год");//665
        RussianWords.add("разрешить этот конфликт");
        RussianWords.add("Это будет необходимо");
        RussianWords.add("тщательно");
        RussianWords.add("острожный");
        RussianWords.add("аккуратно");
        RussianWords.add("зарабатывать");
        RussianWords.add("везде");
        RussianWords.add("фрукты");
        RussianWords.add("овощи");
        RussianWords.add("принимать пищу");//675
        RussianWords.add("достижение");
        RussianWords.add("отправить");
        RussianWords.add("получить");
        RussianWords.add("письмо");
        RussianWords.add("улыбнуться (кому-то)");
        RussianWords.add("тратить на");
        RussianWords.add("переводить с/на");
        RussianWords.add("гордиться");
        RussianWords.add("уставать от");
        RussianWords.add("хорош в");//685
        RussianWords.add("плох в");
        RussianWords.add("необязательно означает");
        RussianWords.add("причина(чего-то)");
        RussianWords.add("удвоить");
        RussianWords.add("продажи");
        RussianWords.add("несмотря на");
        RussianWords.add("несмотря на");
        RussianWords.add("кризис");
        RussianWords.add("значительно");
        RussianWords.add("и так далее");//695
        RussianWords.add("огромный/громадный успех");
        RussianWords.add("навсегда,вечно");
        RussianWords.add("остаться дома");
        RussianWords.add("инициатива");
        RussianWords.add("Тебе повезёт");
        RussianWords.add("посмотреть это в");
        RussianWords.add("выучить анлийский бесплатно");
        RussianWords.add("меня не будет дома");
        RussianWords.add("сходить в ресторант");
        RussianWords.add("настоящая сенсация");//705
        RussianWords.add("это кажется мне");
        RussianWords.add("желать");
        RussianWords.add("заслуживать");
        RussianWords.add("практически");
        RussianWords.add("связаться с");
        RussianWords.add("пара(чего-то)");
        RussianWords.add("повернуться");
        RussianWords.add("год назад");
        RussianWords.add("счастливо");
        RussianWords.add("включать(в список)");//715
        RussianWords.add("включить");
        RussianWords.add("выключить");
        RussianWords.add("рядом с тем");
        RussianWords.add("пешком");
        RussianWords.add("престижный");
        RussianWords.add("в прошлом году");
        RussianWords.add("позавчера");
        RussianWords.add("сильный уровень");
        RussianWords.add("и затем");
        RussianWords.add("вдруг");//725
        RussianWords.add("неожиданно");
        RussianWords.add("предлагать сделать что-то");
        RussianWords.add("спокойный");
        RussianWords.add("развиваться");
        RussianWords.add("способности");
        RussianWords.add("навыки");
        RussianWords.add("требовать");
        RussianWords.add("усилия");
        RussianWords.add("товары");
        RussianWords.add("сложности");//735
        RussianWords.add("внешность");
        RussianWords.add("частично");
        RussianWords.add("на следующие вопросы");
        RussianWords.add("возможности");
        RussianWords.add("воображать");
        RussianWords.add("воображение");
        RussianWords.add("постучать в дверь");
        RussianWords.add("всего наилучшего");
        RussianWords.add("предстваить,знакомить");
        RussianWords.add("солдат");//745
        RussianWords.add("приказать");
        RussianWords.add("перепрыгнуть через");
        RussianWords.add("заполнить(документы)");
        RussianWords.add("обвинять");
        RussianWords.add("обвинение");
        RussianWords.add("пригласить тебя");
        RussianWords.add("ежемесячно");
        RussianWords.add("забор");
        RussianWords.add("одежда");
        RussianWords.add("речь");//755
        RussianWords.add("полагать");
        RussianWords.add("полчаса");
        RussianWords.add("около часа");
        RussianWords.add("больше чем 20 минут");
        RussianWords.add("внимание");
        RussianWords.add("очень редко");
        RussianWords.add("задача");
        RussianWords.add("перебежать");
        RussianWords.add("по ошибке");
        RussianWords.add("подтверждать");//765
        RussianWords.add("дата встречи");
        RussianWords.add("время встречи");
        RussianWords.add("тема");
        RussianWords.add("разговор");
        RussianWords.add("полностью");
        RussianWords.add("несколько");
        RussianWords.add("часть");
        RussianWords.add("помыть");
        RussianWords.add("помыть посуду");
        RussianWords.add("упаковать");//775
        RussianWords.add("недалеко отсюда");
        RussianWords.add("святые");
        RussianWords.add("Там часто идет дождь");
        RussianWords.add("вор");
        RussianWords.add("шёл снег");
        RussianWords.add("проишествие");
        RussianWords.add("руки");
        RussianWords.add("лицо");
        RussianWords.add("преступление");
        RussianWords.add("разделить на(части)");//785
        RussianWords.add("посылка(кому-то)");
        RussianWords.add("проинформировать об");
        RussianWords.add("приянть,взять");
        RussianWords.add("повторять");
        RussianWords.add("арестовать");
        RussianWords.add("хорошо-оплачиваемая");
        RussianWords.add("к нашему удивлению");
        RussianWords.add("неожиданный");
        RussianWords.add("пойти");
        RussianWords.add("после полуночи");//795
        RussianWords.add("враг");
        RussianWords.add("деревня");
        RussianWords.add("сдержать слово");
        RussianWords.add("подозрительный");
        RussianWords.add("невинный");
        RussianWords.add("во время");
        RussianWords.add("сразу же");
        RussianWords.add("лекция");
        RussianWords.add("вина");
        RussianWords.add("защищать");//805
        RussianWords.add("двоюродный брат");
        RussianWords.add("парковаться");
        RussianWords.add("уникальный");
        RussianWords.add("вино");
        RussianWords.add("довольно редко");
        RussianWords.add("часами");
        RussianWords.add("ежедневно");
        RussianWords.add("годовщина");
        RussianWords.add("приготовить ланч");
        RussianWords.add("приготовить обед");//815
        RussianWords.add("приготовить завтрак");
        RussianWords.add("уважение");
        RussianWords.add("доставлять");
        RussianWords.add("красота");
        RussianWords.add("без всякой причины");
        RussianWords.add("оставаться(добрым,злым)");
        RussianWords.add("теория");
        RussianWords.add("двигать,переезжать");
        RussianWords.add("обеспечивать,предоставлять");
        RussianWords.add("цифра");//825
        RussianWords.add("известная");
        RussianWords.add("случайно");
        RussianWords.add("хорошо/прекрасно проводить время");
        RussianWords.add("сделать кому-то одолжение");
        RussianWords.add("горько разочарован");
        RussianWords.add("откладывать");
        RussianWords.add("тихо");
        RussianWords.add("громко");
        RussianWords.add("вместо");
        RussianWords.add("в первый раз");//835
        RussianWords.add("по-другому");
        RussianWords.add("расстроенный");
        RussianWords.add("бумажник");
        RussianWords.add("выяснять,обнаруживать");
        RussianWords.add("бросать (что-то делать)");
        RussianWords.add("намереватся");
        RussianWords.add("на час позже");
        RussianWords.add("выдающийся");
        RussianWords.add("позволить");
        RussianWords.add("поехать(куда-то)");//845
        RussianWords.add("присесть");
        RussianWords.add("встать");
        RussianWords.add("позади");
        RussianWords.add("потерять");
        RussianWords.add("встретиться");
        RussianWords.add("одноклассник");
        RussianWords.add("постваить");
        RussianWords.add("основать(компанию)");
        RussianWords.add("стакан(воды)");
        RussianWords.add("наизусть");//855
        RussianWords.add("резать на(части)");
        RussianWords.add("мясо");
        RussianWords.add("кусок");

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ATest:
                Intent intentA = new Intent(this, AmainTest.class);
                startActivity(intentA);
                break;

            case R.id.BTest:
                Intent intentB = new Intent(this, BmainTest.class);
                startActivity(intentB);
                break;

            case R.id.CTest:
                Intent intentC = new Intent(this, CmainTest.class);
                startActivity(intentC);
                break;

        }
    }
}
