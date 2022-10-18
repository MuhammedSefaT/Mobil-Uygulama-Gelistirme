package com.example.projex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

public Button mesajGoster;
public EditText sayi1girilecek,sayi2girilecek,islemTuru;
public float sayi1,sayi2,sonuc;
public String islem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mesajGoster=(Button)findViewById(R.id.mesaj);
        sayi1girilecek=(EditText)findViewById(R.id.sayi1girilecek);
        sayi2girilecek=(EditText)findViewById(R.id.sayi2girilecek);
        islemTuru=(EditText)findViewById(R.id.islemturu);
    }

    public void butonTikla(View v){
        sayi1 = Float.parseFloat(sayi1girilecek.getText().toString());
        sayi2 = Float.parseFloat(sayi2girilecek.getText().toString());

        if (islemTuru.getText().toString().trim().equals("+")){
            sonuc = sayi1+sayi2;
            Toast.makeText(this, "Sonuç :" + sonuc, Toast.LENGTH_SHORT).show();
        }
        if (islemTuru.getText().toString().trim().equals("-")){
            sonuc = sayi1-sayi2;
            Toast.makeText(this, "Sonuç :" + sonuc, Toast.LENGTH_SHORT).show();
        }
        if (islemTuru.getText().toString().trim().equals("*")){
            sonuc = sayi1*sayi2;
            Toast.makeText(this, "Sonuç :" + sonuc, Toast.LENGTH_SHORT).show();
        }
        if (islemTuru.getText().toString().trim().equals("/")){
            sonuc = sayi1/sayi2;
            Toast.makeText(this, "Sonuç :" + sonuc, Toast.LENGTH_SHORT).show();
        }
    }

    public void birlestir(View v){
    }
}