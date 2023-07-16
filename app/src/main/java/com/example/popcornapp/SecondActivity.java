package com.example.popcornapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    Button btnSepet;
    CheckBox checkNormal;
    CheckBox checkOgrenci;
    CheckBox checkIndirimli;
    CheckBox checkBuyuk;
    CheckBox checkOrta;
    CheckBox checkKucuk;
    CheckBox checkGazlı;
    CheckBox checkMeyve;
    CheckBox checkSu;
    CheckBox checkCikolata;
    CheckBox checkCips;
    CheckBox checkKahve;
    CheckBox checkP1;
    CheckBox checkP2;

    TextView txt23;
    TextView toplamFiyat;
    int tFiyat = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tanimlama();
        fiyatHesaplama();


    }

    public void fiyatHesaplama()
    {
        checkNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkNormal.isChecked())
                {
                    tFiyat += 40;
                    toplamFiyat.setText(tFiyat + "₺");
                }
                else
                {
                    tFiyat -= 40;
                    toplamFiyat.setText(tFiyat + "₺");

                }
            }
        });
        checkOgrenci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkOgrenci.isChecked())
                {
                    tFiyat += 25;
                    toplamFiyat.setText(tFiyat + "₺");

                }
                else
                {
                    tFiyat -= 25;
                    toplamFiyat.setText(tFiyat + "₺");

                }
            }
        });
        checkIndirimli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkIndirimli.isChecked())
                {
                    tFiyat += 25;
                    toplamFiyat.setText(tFiyat + "₺");

                }
                else
                {
                    tFiyat -= 25;
                    toplamFiyat.setText(tFiyat + "₺");

                }
            }
        });
        checkBuyuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBuyuk.isChecked())
                {
                    tFiyat += 25;
                    toplamFiyat.setText(tFiyat + "₺");

                }
                else
                {
                    tFiyat -= 25;
                    toplamFiyat.setText(tFiyat + "₺");

                }
            }
        });
        checkOrta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkOrta.isChecked())
                {
                    tFiyat += 20;
                    toplamFiyat.setText(tFiyat + "₺");

                }
                else
                {
                    tFiyat -= 20;
                    toplamFiyat.setText(tFiyat + "₺");

                }
            }
        });
        checkKucuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkKucuk.isChecked())
                {
                    tFiyat += 15;
                    toplamFiyat.setText(tFiyat + "₺");

                }
                else
                {
                    tFiyat -= 15;
                    toplamFiyat.setText(tFiyat + "₺");

                }
            }
        });
        checkGazlı.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkGazlı.isChecked())
                {
                    tFiyat += 15;
                    toplamFiyat.setText(tFiyat + "₺");

                }
                else
                {
                    tFiyat -= 15;
                    toplamFiyat.setText(tFiyat + "₺");

                }
            }
        });
        checkMeyve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkMeyve.isChecked())
                {
                    tFiyat += 10;
                    toplamFiyat.setText(tFiyat + "₺");

                }
                else
                {
                    tFiyat -= 10;
                    toplamFiyat.setText(tFiyat + "₺");

                }
            }
        });
        checkSu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkSu.isChecked())
                {
                    tFiyat += 5;
                    toplamFiyat.setText(tFiyat + "₺");

                }
                else
                {
                    tFiyat -= 5;
                    toplamFiyat.setText(tFiyat + "₺");

                }
            }
        });
        checkCikolata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkCikolata.isChecked())
                {
                    tFiyat += 12;
                    toplamFiyat.setText(tFiyat + "₺");

                }
                else
                {
                    tFiyat -= 12;
                    toplamFiyat.setText(tFiyat + "₺");

                }
            }
        });
        checkCips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkCips.isChecked())
                {
                    tFiyat += 20;
                    toplamFiyat.setText(tFiyat + "₺");

                }
                else
                {
                    tFiyat -= 20;
                    toplamFiyat.setText(tFiyat + "₺");

                }
            }
        });
        checkKahve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkKahve.isChecked())
                {
                    tFiyat += 15;
                    toplamFiyat.setText(tFiyat + "₺");

                }
                else
                {
                    tFiyat -= 15;
                    toplamFiyat.setText(tFiyat + "₺");

                }
            }
        });
        checkP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkP1.isChecked())
                {
                    tFiyat += 45;
                    toplamFiyat.setText(tFiyat + "₺");

                }
                else
                {
                    tFiyat -= 45;
                    toplamFiyat.setText(tFiyat + "₺");

                }
            }
        });
        checkP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkP2.isChecked())
                {
                    tFiyat += 30;
                    toplamFiyat.setText(tFiyat + "₺");

                }
                else
                {
                    tFiyat -= 30;
                    toplamFiyat.setText(tFiyat + "₺");

                }
            }
        });
    }

    public void tanimlama() {

        checkNormal = findViewById(R.id.checkNormal);
        checkOgrenci = findViewById(R.id.checkOgrenci);
        checkIndirimli = findViewById(R.id.checkIndirimli);
        checkBuyuk = findViewById(R.id.checkBuyuk);
        checkOrta = findViewById(R.id.checkOrta);
        checkKucuk = findViewById(R.id.checkKucuk);
        checkCikolata = findViewById(R.id.checkCikolata);
        checkCips = findViewById(R.id.checkCips);
        checkSu = findViewById(R.id.checkSu);
        checkGazlı = findViewById(R.id.checkGazli);
        checkMeyve = findViewById(R.id.checkMeyve);
        checkKahve = findViewById(R.id.checkKahve);
        checkP1 = findViewById(R.id.checkP1);
        checkP2 = findViewById(R.id.checkP2);

        txt23 = findViewById(R.id.textView23);
        toplamFiyat = findViewById(R.id.txtToplamFiyat);

        btnSepet = findViewById(R.id.btnSepet);

        btnSepet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SecondActivity.this, OdemeEkrani.class);
                startActivity(intent);

            }
        });

    }


}