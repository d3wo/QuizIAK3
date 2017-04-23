package com.example.dewo.quiz2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Page4Activity extends AppCompatActivity {

    private String nama;
    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);

        catchPreviousIntent();

    }


    private void catchPreviousIntent() {
        Intent intent = getIntent();
        nama = intent.getStringExtra("nama");
        score = Integer.valueOf(intent.getStringExtra("score"));
        Toast.makeText(this, String.valueOf(score), Toast.LENGTH_SHORT).show();
    }

    public void gasClicked (View view){
        selanjutnya();
    }

    public void listrikClicked (View view){
        score = score + 1;
        selanjutnya();
    }

    private void selanjutnya() {
        Intent intent = new Intent(this, Page5Activity.class);
        intent.putExtra("nama", nama);
        intent.putExtra("score", String.valueOf(score));
        startActivity(intent);
    }



}
