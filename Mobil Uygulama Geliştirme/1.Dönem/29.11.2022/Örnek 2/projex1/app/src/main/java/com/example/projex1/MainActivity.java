package com.example.projex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public Button s0,s1,s2,s3,s4,s5,s6,s7,s8,s9,Sonuc,Toplama,Cikarma,Bolme,Carpma,Virgul,Islem,Temizle,Sil;
    public EditText sayi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s0 = (Button)findViewById(R.id.sifir);
        s1 = (Button)findViewById(R.id.bir);
        s2 = (Button)findViewById(R.id.iki);
        s3 = (Button)findViewById(R.id.uc);
        s4 = (Button)findViewById(R.id.dort);
        s5 = (Button)findViewById(R.id.bes);
        s6 = (Button)findViewById(R.id.alti);
        s7 = (Button)findViewById(R.id.yedi);
        s8 = (Button)findViewById(R.id.sekiz);
        s9 = (Button)findViewById(R.id.dokuz);

        Sonuc = (Button)findViewById(R.id.sonuc);
        Virgul = (Button)findViewById(R.id.virgul);
        Carpma = (Button)findViewById(R.id.carpma);
        Cikarma = (Button)findViewById(R.id.cikarma);
        Toplama = (Button)findViewById(R.id.toplama);
        Bolme = (Button)findViewById(R.id.bolme);
        Islem = (Button)findViewById(R.id.islem);
        Temizle = (Button)findViewById(R.id.temizle);
        Sil = (Button)findViewById(R.id.sil);

        sayi = (EditText)findViewById(R.id.sayigirilkecek);
    }

    public void btn0tikla(View v){
        String okunanbilgi = sayi.getText().toString().trim();
        sayi.setText(okunanbilgi + "0");
    }

    public void btn1tikla(View v){
        String okunanbilgi = sayi.getText().toString().trim();
        sayi.setText(okunanbilgi + "1");
    }

    public void btn2tikla(View v){
        String okunanbilgi = sayi.getText().toString().trim();
        sayi.setText(okunanbilgi + "2");
    }

    public void btn3tikla(View v){
        String okunanbilgi = sayi.getText().toString().trim();
        sayi.setText(okunanbilgi + "3");
    }

    public void btn4tikla(View v){
        String okunanbilgi = sayi.getText().toString().trim();
        sayi.setText(okunanbilgi + "4");
    }

    public void btn5tikla(View v){
        String okunanbilgi = sayi.getText().toString().trim();
        sayi.setText(okunanbilgi + "5");
    }

    public void btn6tikla(View v){
        String okunanbilgi = sayi.getText().toString().trim();
        sayi.setText(okunanbilgi + "6");
    }

    public void btn7tikla(View v){
        String okunanbilgi = sayi.getText().toString().trim();
        sayi.setText(okunanbilgi + "7");
    }

    public void btn8tikla(View v){
        String okunanbilgi = sayi.getText().toString().trim();
        sayi.setText(okunanbilgi + "8");
    }

    public void btn9tikla(View v){
        String okunanbilgi = sayi.getText().toString().trim();
        sayi.setText(okunanbilgi + "9");
    }

    public void btntemizletikla(View v){

    }

    public void btnboltikla(View v){

    }

    public void btncarptikla(View v){

    }

    public void btncikartikla(View v){

    }

    public void btntoplatikla(View v){

    }

    public void btnsiltikla(View v){

    }

    public void btnislemtikla(View v){

    }

    public void btnvirgultikla(View v){

    }

    public void btnsonuctikla(View v){

    }
}