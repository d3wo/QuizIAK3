package com.example.dewo.quiz2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Page5Activity extends AppCompatActivity {


    private String nama;
    private int score;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);

        catchPreviousIntent();


    }

    private void catchPreviousIntent() {
        Intent intent = getIntent();
        nama = intent.getStringExtra("nama");
        score = Integer.valueOf(intent.getStringExtra("score"));
    }


    public void btn36OnClicked (View view){
        selanjutnya();
    }
    public void btn49OnClicked (View view){
        selanjutnya();
    }
    public void btn64OnClicked (View view){
        score = score+1;
        selanjutnya();
    }
    public void btn81OnClicked (View view){
        selanjutnya();
    }

    private void selanjutnya() {
        Intent intent = new Intent(this, Page6Activity.class);
        intent.putExtra("nama", nama);
        intent.putExtra("score", String.valueOf(score));
        startActivity(intent);
    }



}
