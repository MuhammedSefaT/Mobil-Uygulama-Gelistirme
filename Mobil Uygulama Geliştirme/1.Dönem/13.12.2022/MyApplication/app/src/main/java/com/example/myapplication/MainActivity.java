package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText sayi1,sayi2;
    public Spinner combo;
    public long s1,s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sayi1 = (EditText)findViewById(R.id.sayi1gir);
        sayi2 = (EditText)findViewById(R.id.sayi2gir);
        combo = (Spinner)findViewById(R.id.islemtur);
    }

    //Ana metodlar
    public void Medot1(View v){
        s1 = Long.valueOf(sayi1.getText().toString().trim());
        s2 = Long.valueOf(sayi2.getText().toString().trim());
        Topla1();
    }

    public void Medot2(View v){
        s1 = Long.valueOf(sayi1.getText().toString().trim());
        s2 = Long.valueOf(sayi2.getText().toString().trim());
        long sonuc = Topla2();
        Toast.makeText(this, "Sonuc :" + sonuc, Toast.LENGTH_SHORT).show();
    }

    public void Medot3(View v){
        s1 = Long.valueOf(sayi1.getText().toString().trim());
        s2 = Long.valueOf(sayi2.getText().toString().trim());
        Topla3(s1,s2);
    }

    public void Medot4(View v){
        s1 = Long.valueOf(sayi1.getText().toString().trim());
        s2 = Long.valueOf(sayi2.getText().toString().trim());
        long sonuc = Topla4(s1,s2);
        Toast.makeText(this, "Sonuc :" + sonuc, Toast.LENGTH_SHORT).show();
    }

    public void Faktoriyel(View v){
        long faksonuc = 1;
        s1 = Long.valueOf(sayi1.getText().toString().trim());
        for (int i=1;i<=s1;i++){
            faksonuc = faksonuc*i;
        }
        Toast.makeText(this, "Faktoriyel :" + Long.toString(faksonuc).toString(), Toast.LENGTH_SHORT).show();
    }

    public void SayilariTopla(View v){
        s1 = Long.valueOf(sayi1.getText().toString().trim());
        s2 = Long.valueOf(sayi2.getText().toString().trim());
        long sonuc = 0;
        for (long i = s1;i < s2;i++){
            sonuc = sonuc + i;
        }
        Toast.makeText(this, "Toplam Sonuç :" + Long.toString(sonuc).toString(), Toast.LENGTH_SHORT).show();
    }

    // İşlem Metodları

    public void Topla1(){
        long sonuc = 0;
        if (combo.getSelectedItem().toString().trim().equals("+")){
            sonuc = s1+s2;
        }
        if (combo.getSelectedItem().toString().trim().equals("-")){
            sonuc = s1-s2;
        }
        if (combo.getSelectedItem().toString().trim().equals("*")){
            sonuc = s1*s2;
        }
        if (combo.getSelectedItem().toString().trim().equals("/")){
            sonuc = s1/s2;
        }

        Toast.makeText(this, "Sonuc :" + String.valueOf(sonuc), Toast.LENGTH_SHORT).show();
    }

    public long Topla2(){
        long sonuc = 0;
        if (combo.getSelectedItem().toString().trim().equals("+")){
            sonuc = s1+s2;
        }
        if (combo.getSelectedItem().toString().trim().equals("-")){
            sonuc = s1-s2;
        }
        if (combo.getSelectedItem().toString().trim().equals("*")){
            sonuc = s1*s2;
        }
        if (combo.getSelectedItem().toString().trim().equals("/")){
            sonuc = s1/s2;
        }
        return sonuc;
    }

    public void Topla3(long s1, long s2){
        long sonuc = 0;
        if (combo.getSelectedItem().toString().trim().equals("+")){
            sonuc = s1+s2;
        }
        if (combo.getSelectedItem().toString().trim().equals("-")){
            sonuc = s1-s2;
        }
        if (combo.getSelectedItem().toString().trim().equals("*")){
            sonuc = s1*s2;
        }
        if (combo.getSelectedItem().toString().trim().equals("/")){
            sonuc = s1/s2;
        }
        Toast.makeText(this, "Sonuc :" + sonuc, Toast.LENGTH_SHORT).show();
    }

    public long Topla4(long s1, long s2){
        long sonuc = 0;
        if (combo.getSelectedItem().toString().trim().equals("+")){
            sonuc = s1+s2;
        }
        if (combo.getSelectedItem().toString().trim().equals("-")){
            sonuc = s1-s2;
        }
        if (combo.getSelectedItem().toString().trim().equals("*")){
            sonuc = s1*s2;
        }
        if (combo.getSelectedItem().toString().trim().equals("/")){
            sonuc = s1/s2;
        }
        return sonuc;
    }
}