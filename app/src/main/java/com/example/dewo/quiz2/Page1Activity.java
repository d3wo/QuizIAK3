package com.example.dewo.quiz2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Page1Activity extends AppCompatActivity {

    private static final String NAMA = "nama";
    private String nama;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);





    }





    public void mulai(View view){

        EditText txtNama = (EditText)findViewById(R.id.txtNama);
        nama = txtNama.getText().toString();

        Intent intent = new Intent(this, Page2Activity.class);
        intent.putExtra(NAMA, nama);
        startActivity(intent);

        Toast.makeText(this, "Selamat bermain " + nama, Toast.LENGTH_SHORT).show();
    }

}
