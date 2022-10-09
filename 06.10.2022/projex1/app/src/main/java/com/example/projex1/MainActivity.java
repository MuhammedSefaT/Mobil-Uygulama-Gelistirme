package com.example.projex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button mesajGoster;
    public EditText sayi1,sayi2;
    public int sayi1icerik,sayi2icerik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*mesajGoster=(Button)findViewById(R.id.mesaj);
        textBox=(EditText)findViewById(R.id.sayi1);
        //
        textBox2=(EditText)findViewById(R.id.sayi2);*/

        sayi1=(EditText)findViewById(R.id.sayi1);
        sayi2=(EditText)findViewById(R.id.sayi2);
    }

    public void butonaTiklandi(View test){
        /*mesajGoster.setText("Mesaj Gösterildi");
        Toast.makeText(MainActivity.this,"Merhaba Dünya!",Toast.LENGTH_LONG).show();
        textBox.setText("Sana da Merhaba!");
        //
        textBox2.setText("Merhaba 2");*/

        sayi1icerik = Integer.parseInt(sayi1.getText().toString());
        sayi2icerik = Integer.parseInt(sayi2.getText().toString());

        String toplam = String.valueOf(sayi1icerik+sayi2icerik);
        Toast.makeText(MainActivity.this,toplam,Toast.LENGTH_LONG).show();
    }
}