package com.example.dewo.quiz2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class Page3Activity extends AppCompatActivity {

    private static final String NAMAUSER = "nama";
    private static final String SCORE = "score";
    private String nama;
    private int score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);


        catchPreviousIntent();

    }

    private void catchPreviousIntent() {
        Intent intent = getIntent();
        nama = intent.getStringExtra("nama");
        score = Integer.valueOf(intent.getStringExtra("score"));
        Toast.makeText(this, nama, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, String.valueOf(score), Toast.LENGTH_SHORT).show();


    }



    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkbox_anjing:
                if (checked){}
                else{}
                break;
            case R.id.checkbox_kepiting:
                if (checked){score = score + 1;}
                else{score = score - 1;}
                break;
            case R.id.checkbox_kura_kura:
                if (checked){score = score + 1;}
                else{score = score - 1;}
                break;
            case R.id.checkbox_katak:
                if (checked){
                    score = score + 1;
                }
                else{
                    score = score - 1;

                }
                break;
            // TODO: Veggie sandwich
        }
    }

    public void selanjutnya(View view){


        Intent intent = new Intent(this, Page4Activity.class);
        intent.putExtra(NAMAUSER, nama);
        intent.putExtra(SCORE, String.valueOf(score));
        startActivity(intent);
    }


}
