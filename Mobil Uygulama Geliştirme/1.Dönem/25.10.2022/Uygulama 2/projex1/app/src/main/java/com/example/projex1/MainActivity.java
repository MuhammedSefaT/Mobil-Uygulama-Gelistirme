package com.example.projex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText s1G,s2G,sonuc;
    public int s1,s2,islemSonuc;
    public String comm,isc;
    public Spinner sp1;
    public Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.mesaj);
        s1G = (EditText)findViewById(R.id.sayi1girilecek);
        s2G = (EditText)findViewById(R.id.sayi2girilecek);
        sp1 = (Spinner)findViewById(R.id.com);
    }

    public void butonaTiklandi(View v){
        s1 = Integer.getInteger(s1G.getText().toString());
        s2 = Integer.getInteger(s2G.getText().toString());

        if (sp1.getSelectedItem().toString().equals("+")){
            islemSonuc = s1+s2;
        }
        else if (sp1.getSelectedItem().toString().equals("-")){
            islemSonuc = s1-s2;
        }
        else if (sp1.getSelectedItem().toString().equals("*")){
            islemSonuc = s1*s2;
        }
        else if (sp1.getSelectedItem().toString().equals("/")){
            islemSonuc = s1/s2;
        }
        else{
            Toast.makeText(this, "İşlem Seçmediniz !!!", Toast.LENGTH_LONG).show();
        }

        sonuc.setText(String.valueOf(islemSonuc).toString());
    }
}