package com.example.projex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText isim,tel,mail,address;
    public RadioButton rad1,rad2;
    public Spinner sp1;
    public Button mesaj;
    public String isimAl,telAl,mailAl,addressAl,secCevap,com;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        isim = (EditText)findViewById(R.id.isimGirilecek);
        tel = (EditText)findViewById(R.id.telGirilecek);
        mail = (EditText)findViewById(R.id.mailGirilecek);
        address = (EditText)findViewById(R.id.addressGirilecek);
        sp1 = (Spinner)findViewById(R.id.combo1);
        rad1 = (RadioButton)findViewById(R.id.sec1);
        rad2 = (RadioButton)findViewById(R.id.sec2);
        mesaj = (Button)findViewById(R.id.mesajGoster);

    }

    public void butonaTiklandi(View v){
        isimAl = isim.getText().toString();
        telAl = tel.getText().toString();
        mailAl = mail.getText().toString();
        addressAl = address.getText().toString();

        if (rad1.isChecked()){
            secCevap = rad1.getText().toString();
        }
        else if (rad2.isChecked()){
            secCevap = rad2.getText().toString();
        }
        else{
            Toast.makeText(this, "Seçim Yapın !", Toast.LENGTH_SHORT).show();
        }

        com = sp1.getSelectedItem().toString();

        Toast.makeText(this, isimAl + " " + telAl + " " + mailAl + " " + com + " " + addressAl + " " + secCevap, Toast.LENGTH_LONG).show();
    }
}