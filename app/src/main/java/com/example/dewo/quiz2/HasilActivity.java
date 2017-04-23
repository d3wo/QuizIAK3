package com.example.dewo.quiz2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class HasilActivity extends AppCompatActivity {


    private String nama;
    private int score;
    private TextView textNama, textScore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);


        textNama = (TextView) findViewById(R.id.nama);
        textScore = (TextView) findViewById(R.id.nilai);

        catchPreviousIntent();

        displayNama();
        displayScore();



    }


    private void displayScore() {

        float nilai = (float)score/7*100;
        String s = String.format("%.2f", nilai);
        textScore.setText(s);
    }

    private void displayNama() {
        textNama.setText(nama);

    }

    private void catchPreviousIntent() {
        Intent intent = getIntent();
        nama = intent.getStringExtra("nama");
        score = Integer.valueOf(intent.getStringExtra("score"));
        Toast.makeText(this, String.valueOf(score), Toast.LENGTH_SHORT).show();
    }


    public void mainLagi(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();

    }
}

