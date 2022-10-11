package com.example.projex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public  Button mesaj;
    public EditText sayi1girilecek,sayi2girilecek;
    public int sayi1,sayi2,toplam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mesaj = (Button)findViewById(R.id.mesaj);
        sayi1girilecek = (EditText)findViewById(R.id.sayi1girilecek);
        sayi2girilecek = (EditText)findViewById(R.id.sayi2girilecek);
    }

    public void sayiTopla(View v){
        sayi1 = Integer.parseInt(sayi1girilecek.getText().toString());
        sayi2 = Integer.parseInt(sayi2girilecek.getText().toString());

        toplam = sayi1+sayi2;
        Toast.makeText(MainActivity.this,"Sonuç : " + String.valueOf(toplam),Toast.LENGTH_LONG).show();
        sayi1girilecek.setText(" "); // editText'lerin içeriğini silmek için kullanılır.
        sayi2girilecek.setText(" "); // editText'lerin içeriğini silmek için kullanılır.
        sayi1girilecek.setHint("Sayı 1");
        sayi2girilecek.setHint("Sayı 2");
    }

    public void sayiCikar(View v){
        sayi1 = Integer.parseInt(sayi1girilecek.getText().toString());
        sayi2 = Integer.parseInt(sayi2girilecek.getText().toString());

        toplam = sayi1-sayi2;
        Toast.makeText(MainActivity.this,"Sonuç : " + String.valueOf(toplam),Toast.LENGTH_LONG).show();
        sayi1girilecek.setText(" "); // editText'lerin içeriğini silmek için kullanılır.
        sayi2girilecek.setText(" "); // editText'lerin içeriğini silmek için kullanılır.
    }

    public void sayiCarp(View v){
        sayi1 = Integer.parseInt(sayi1girilecek.getText().toString());
        sayi2 = Integer.parseInt(sayi2girilecek.getText().toString());

        toplam= sayi1*sayi2;
        Toast.makeText(MainActivity.this,"Sonuç : " + String.valueOf(toplam),Toast.LENGTH_LONG).show();
        sayi1girilecek.setText(" "); // editText'lerin içeriğini silmek için kullanılır.
        sayi2girilecek.setText(" "); // editText'lerin içeriğini silmek için kullanılır.
    }

    public void sayiBol(View v){
        sayi1 = Integer.parseInt(sayi1girilecek.getText().toString());
        sayi2 = Integer.parseInt(sayi2girilecek.getText().toString());

        toplam= sayi1/sayi2;
        Toast.makeText(MainActivity.this,"Sonuç : " + String.valueOf(toplam),Toast.LENGTH_LONG).show();
        sayi1girilecek.setText(" "); // editText'lerin içeriğini silmek için kullanılır.
        sayi2girilecek.setText(" "); // editText'lerin içeriğini silmek için kullanılır.
    }

    public void sayiModAl(View v){
        sayi1 = Integer.parseInt(sayi1girilecek.getText().toString());
        sayi2 = Integer.parseInt(sayi2girilecek.getText().toString());

        toplam= sayi1%sayi2;
        Toast.makeText(MainActivity.this,"Sonuç : " + String.valueOf(toplam),Toast.LENGTH_LONG).show();
        sayi1girilecek.setText(" "); // editText'lerin içeriğini silmek için kullanılır.
        sayi2girilecek.setText(" "); // editText'lerin içeriğini silmek için kullanılır.
    }
}














