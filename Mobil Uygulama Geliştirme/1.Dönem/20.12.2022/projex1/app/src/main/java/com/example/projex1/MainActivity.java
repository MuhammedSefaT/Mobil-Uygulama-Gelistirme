package com.example.projex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {

    public EditText sayi1,sayi2;
    public long say1,say2,sonuc;
    public Button btn,btn2,btn3;
    public int rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sayi1 = (EditText)findViewById(R.id.sayi1gir);
        sayi2 = (EditText)findViewById(R.id.sayi2gir);
        btn = (Button)findViewById(R.id.button);
        btn2 = (Button)findViewById(R.id.carptopla);

        btn.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
               if (TextUtils.isEmpty(sayi1.getText().toString()) && TextUtils.isEmpty(sayi2.getText().toString()) | TextUtils.isEmpty(sayi1.getText().toString()) | TextUtils.isEmpty(sayi2.getText().toString())){
                   Toast.makeText(MainActivity.this, "Hatalı giriş", Toast.LENGTH_SHORT).show();
               }
               else{
                   say1 = Long.valueOf(sayi1.getText().toString().trim());
                   say2 = Long.valueOf(sayi2.getText().toString().trim());
                   long sonuc = topla(say1,say2);
                   Toast.makeText(MainActivity.this, "Cevap :" + sonuc, Toast.LENGTH_LONG).show();
               }
           }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(sayi1.getText().toString()) && TextUtils.isEmpty(sayi2.getText().toString()) | TextUtils.isEmpty(sayi1.getText().toString()) | TextUtils.isEmpty(sayi2.getText().toString())){
                    Toast.makeText(MainActivity.this, "Hatalı giriş", Toast.LENGTH_SHORT).show();
                }
                else{
                    say1 = Long.valueOf(sayi1.getText().toString().trim());
                    say2 = Long.valueOf(sayi2.getText().toString().trim());
                    long sonuc = carpTopla(say1,say2);
                    Toast.makeText(MainActivity.this, "Cevap :" + sonuc, Toast.LENGTH_LONG).show();
                }
            }
        });
    }


    public long topla(long s1, long s2){
        sonuc = 0;
        for (long i = s1; i <= s2; i++){
            if (i%3 == 0){
                sonuc = sonuc + i;
            }
        }
        return sonuc;
    }

    public long carpTopla(long s1, long s2){
        long sonuc = 0;
        for (long i = 1; i <= s1; i++){
            sonuc = sonuc + s2;
        }
        return sonuc;
    }

    public void tahminEt(View v)
    {
        say1 = Long.valueOf(sayi1.getText().toString().trim());
        int rnd = ThreadLocalRandom.current().nextInt(10,100);

        if (say1 == rnd){
            Toast.makeText(this, "Doğru Bildiniz. Tebrikler", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Tekrar Dene (Sonuc : " + rnd + ")", Toast.LENGTH_SHORT).show();
        }
    }
}