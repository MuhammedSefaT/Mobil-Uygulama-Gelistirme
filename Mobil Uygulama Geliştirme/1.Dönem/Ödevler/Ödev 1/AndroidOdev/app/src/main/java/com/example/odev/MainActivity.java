package com.example.odev;

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

    public EditText s1;
    public Button btn;
    public int tutulanSayi = 0,girilenSayi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1 = (EditText) findViewById(R.id.sayi1girilecek);
        btn = (Button) findViewById(R.id.btn1);

        tutulanSayi = ThreadLocalRandom.current().nextInt(10,100 +1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(s1.getText().toString())){
                    Toast.makeText(MainActivity.this, "Oyunu oynamak için bir sayı gir asker!", Toast.LENGTH_LONG).show();
                    tutulanSayi = ThreadLocalRandom.current().nextInt(10,100 +1);
                }
                else{
                    TahminEt();
                }
            }
        });
    }

    public void TahminEt() {
        girilenSayi = Integer.valueOf(s1.getText().toString().trim());

        if (girilenSayi == tutulanSayi){
            Toast.makeText(MainActivity.this, "Doğru Bildiniz Tebrikler", Toast.LENGTH_LONG).show();
            tutulanSayi = ThreadLocalRandom.current().nextInt(10,100 +1);

        }
        else{
            //Toast.makeText(this, "Yanlış Bildiniz Tekrar Deneyin!!!", Toast.LENGTH_SHORT).show();
            if (girilenSayi > tutulanSayi){
                Toast.makeText(MainActivity.this, "Yüksek Cevap Verdiniz. Tekrar Deneyiniz!", Toast.LENGTH_LONG).show();
            }
            else if (girilenSayi < tutulanSayi){
                Toast.makeText(MainActivity.this, "Düşük Cevap Verdiniz. Tekrar Deneyiniz!", Toast.LENGTH_LONG).show();
            }
        }
    }

    public void PesEt(View v){
        Toast.makeText(this, "Tutulan Sayı :" + tutulanSayi, Toast.LENGTH_SHORT).show();
        tutulanSayi = ThreadLocalRandom.current().nextInt(10,100 +1);
    }
}