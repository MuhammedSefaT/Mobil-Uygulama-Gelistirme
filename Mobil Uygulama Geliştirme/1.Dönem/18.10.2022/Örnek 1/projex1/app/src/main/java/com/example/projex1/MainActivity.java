package com.example.projex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

public Button mesajGoster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mesajGoster=(Button)findViewById(R.id.mesaj);
    }

    public void butonTikla(View v){
        Toast.makeText(this, "merhaba", Toast.LENGTH_SHORT).show();
    }
}