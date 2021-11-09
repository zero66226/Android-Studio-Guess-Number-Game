package com.example.word;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

   int a = (int)(Math.random()*9+1);

   int x=0;


    String b = "太大";
    String s = "太小";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void sA(View view) {


        TextView r1 = (TextView) findViewById(R.id.tv1);

        if (a==1){
            r1.setText("你猜對了,你總共猜錯"+x+"次");

        }
        else {
            x=x+1;
            if (a>1) {

                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MainActivity2.class);

                intent.putExtra("s", s);


                startActivity(intent);
            }
            else{
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MainActivity2.class);

                intent.putExtra("b", b);


                startActivity(intent);

            }

        }
    }
    public void sB(View view) {
        TextView r1 = (TextView) findViewById(R.id.tv1);

        if (a==2){
            r1.setText("你猜對了,你總共猜錯"+x+"次");

        }
        else {
            x=x+1;
            if (a>2) {

                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MainActivity2.class);

                intent.putExtra("s", s);


                startActivity(intent);
            }
            else{
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MainActivity2.class);

                intent.putExtra("b", b);


                startActivity(intent);

            }

        }

    }
    public void sC(View view) {

        TextView r1 = (TextView) findViewById(R.id.tv1);

        if (a==3){
            r1.setText("你猜對了,你總共猜錯"+x+"次");

        }
        else {
            x=x+1;
            if (a>3) {

                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MainActivity2.class);

                intent.putExtra("s", s);


                startActivity(intent);
            }
            else{
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MainActivity2.class);

                intent.putExtra("b", b);


                startActivity(intent);

            }

        }

    }
    public void sD(View view) {
        TextView r1 = (TextView) findViewById(R.id.tv1);

        if (a==4){
            r1.setText("你猜對了,你總共猜錯"+x+"次");

        }
        else {
            x=x+1;
            if (a>4) {

                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MainActivity2.class);

                intent.putExtra("s", s);


                startActivity(intent);
            }
            else{
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MainActivity2.class);

                intent.putExtra("b", b);


                startActivity(intent);

            }

        }

    }
    public void sE(View view) {
        TextView r1 = (TextView) findViewById(R.id.tv1);

        if (a==5){
            r1.setText("你猜對了,你總共猜錯"+x+"次");

        }
        else {
            x=x+1;
            if (a>5) {

                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MainActivity2.class);

                intent.putExtra("s", s);


                startActivity(intent);
            }
            else{
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MainActivity2.class);

                intent.putExtra("b", b);


                startActivity(intent);

            }

        }

    }
    public void sF(View view) {
        TextView r1 = (TextView) findViewById(R.id.tv1);

        if (a==6){
            r1.setText("你猜對了,你總共猜錯"+x+"次");

        }
        else {
            x=x+1;
            if (a>6) {


                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MainActivity2.class);

                intent.putExtra("s", s);


                startActivity(intent);
            }
            else{
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MainActivity2.class);

                intent.putExtra("b", b);


                startActivity(intent);

            }

        }

    }
    public void sG(View view) {
        TextView r1 = (TextView) findViewById(R.id.tv1);

        if (a==7){
            r1.setText("你猜對了,你總共猜錯"+x+"次");

        }
        else {
            x=x+1;
            if (a>7) {


                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MainActivity2.class);

                intent.putExtra("s", s);


                startActivity(intent);
            }
            else{
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MainActivity2.class);

                intent.putExtra("b", b);


                startActivity(intent);

            }

        }

    }
    public void sH(View view) {
        TextView r1 = (TextView) findViewById(R.id.tv1);

        if (a==8){
            r1.setText("你猜對了,你總共猜錯"+x+"次");

        }
        else {
            x=x+1;
            if (a>8) {


                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MainActivity2.class);

                intent.putExtra("s", s);


                startActivity(intent);
            }
            else{
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MainActivity2.class);

                intent.putExtra("b", b);


                startActivity(intent);

            }

        }

    }
    public void sI(View view) {

        TextView r1 = (TextView) findViewById(R.id.tv1);

        if (a==9){
            r1.setText("你猜對了,你總共猜錯"+x+"次");

        }
        else {
            x=x+1;
            if (a>9) {


                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MainActivity2.class);

                intent.putExtra("s", s);


                startActivity(intent);
            }
            else{
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MainActivity2.class);

                intent.putExtra("b", b);


                startActivity(intent);

            }

        }

    }

    public void re(View view) {
        x=0;
        a = (int)(Math.random()*9+1);
        TextView r1 = (TextView) findViewById(R.id.tv1);
        r1.setText("");


    }
}



