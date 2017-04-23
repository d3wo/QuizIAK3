package com.example.dewo.quiz2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Page2Activity extends AppCompatActivity {


    private static final String NAMAUSER = "nama";
    private static final String SCORE = "score";
    int score;
    private String nama;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        catchPreviousIntent();

    }


    private void catchPreviousIntent() {
        Intent intent = getIntent();
        nama = intent.getStringExtra("nama");

    }





    public void selanjutnya(View view){


        EditText txtJawaban = (EditText) findViewById(R.id.page2_txtJawaban);
        String jawaban = txtJawaban.getText().toString();

        //checkJawaban(jawaban);
        if(jawaban.equals("knalpot")){
            score = 1;
        }

        nextPage();



    }





    private void nextPage() {
        Intent intent = new Intent(this, Page3Activity.class);
        intent.putExtra(NAMAUSER, nama);
        intent.putExtra(SCORE, String.valueOf(score));
        startActivity(intent);
    }

    private void checkJawaban(String jawaban) {


    }

}
