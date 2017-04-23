package com.example.dewo.quiz2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Page6Activity extends AppCompatActivity {

    private String nama;
    private int score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page6);

        catchPreviousIntent();
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_abate:
                if (checked)
                    score = score+1;
                selanjutnya();
                break;
            case R.id.radio_kina:
                if (checked)
                    selanjutnya();
                break;
            case R.id.radio_parcok:
                if (checked)
                    selanjutnya();
                break;
        }
    }

    private void selanjutnya() {
        Intent intent = new Intent(this, HasilActivity.class);
        intent.putExtra("nama", nama);
        intent.putExtra("score", String.valueOf(score));
        startActivity(intent);
    }


    private void catchPreviousIntent() {
        Intent intent = getIntent();
        nama = intent.getStringExtra("nama");
        score = Integer.valueOf(intent.getStringExtra("score"));
    }



}

