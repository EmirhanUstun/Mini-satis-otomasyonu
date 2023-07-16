package com.example.popcornapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class OdemeEkrani extends AppCompatActivity {

    Button btnOde;
    TextView txtCVC;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odeme_ekrani);

        btnOde = findViewById(R.id.btnOde);
        txtCVC = findViewById(R.id.txtCVC);

        txtCVC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(OdemeEkrani.this, "Kartın Arkasındaki Kart Güvenlik Kodu", Toast.LENGTH_LONG).show();

            }
        });


        btnOde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(OdemeEkrani.this, "Ödeme Gerçekleşti.", Toast.LENGTH_SHORT).show();

            }
        });


    }
}