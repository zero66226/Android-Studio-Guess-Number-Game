package com.example.word;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView r = (TextView) findViewById(R.id.tvT);

        Intent intent = this.getIntent();
        String b = intent.getStringExtra("b");
        String s = intent.getStringExtra("s");


       if (b != null) {
           r.setText(b);
      }
        if (s != null) {
            r.setText(s);
       }


    }

    public void bk(View view) {


        MainActivity2.this.finish();

    }
}