package com.example.projex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText text1,text2;
    Spinner comboBox1;
    int s1,s2,sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = (EditText)findViewById(R.id.s1girilecek);
        text2 = (EditText)findViewById(R.id.s2girilecek);
        comboBox1 = (Spinner)findViewById(R.id.combo);
    }

    public void dortIslem(View v){

        s1 = Integer.parseInt(text1.getText().toString());
        s2 = Integer.parseInt(text2.getText().toString());

        if (comboBox1.getSelectedItem().equals("+")){
            sonuc = s1+s2;
            Toast.makeText(this, "Sonuç :" + sonuc, Toast.LENGTH_SHORT).show();
        }
        else if (comboBox1.getSelectedItem().equals("-")){
            sonuc = s1-s2;
            Toast.makeText(this, "Sonuç :" + sonuc, Toast.LENGTH_SHORT).show();
        }
        else if (comboBox1.getSelectedItem().equals("*")){
            sonuc = s1*s2;
            Toast.makeText(this, "Sonuç :" + sonuc, Toast.LENGTH_SHORT).show();
        }
        else if (comboBox1.getSelectedItem().equals("/")){
            sonuc = s1/s2;
            Toast.makeText(this, "Sonuç :" + sonuc, Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Hata", Toast.LENGTH_SHORT).show();
        }
    }
}