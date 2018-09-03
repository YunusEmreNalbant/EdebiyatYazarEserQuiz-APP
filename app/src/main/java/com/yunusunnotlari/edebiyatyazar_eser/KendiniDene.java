package com.yunusunnotlari.edebiyatyazar_eser;

import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class KendiniDene extends AppCompatActivity {

    String dogrucevap;
    Button soruButton,cevapAbutton,cevapBbutton,cevapCbutton,cevapDbutton;
    Sorular sorular = new Sorular();
    boolean tiklandi = false;
    int sayac=0;
    int soruSayisi=25;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kendini_dene);

        soruButton =(Button) findViewById(R.id.soruButton);
        cevapAbutton =(Button) findViewById(R.id.cevapAbutton);
        cevapBbutton=(Button) findViewById(R.id.cevapBbutton);
        cevapCbutton=(Button) findViewById(R.id.cevapCbutton);
        cevapDbutton=(Button) findViewById(R.id.cevapDbutton);

        cevapAbutton.setBackgroundColor(Color.GRAY);
        cevapBbutton.setBackgroundColor(Color.GRAY);
        cevapCbutton.setBackgroundColor(Color.GRAY);
        cevapDbutton.setBackgroundColor(Color.GRAY);

        while(soruSayisi>0) {
            SoruGetir();
            soruSayisi--;
        }


        cevapAbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!tiklandi) {
                    if (cevapAbutton.getText().toString().equals(dogrucevap)) {
                        cevapAbutton.setBackgroundColor(Color.GREEN);
                        sayac++;
                        if(sayac>=3){
                            Toast.makeText(KendiniDene.this, "Harika Gidiyorsun, Devam!", Toast.LENGTH_SHORT).show();
                        }
                        tiklandi = true;
                        new CountDownTimer(2000,1000){

                            @Override
                            public void onTick(long millisUntilFinished) {
                                String sayac = String.valueOf(millisUntilFinished/1000);
                                Toast.makeText(getApplicationContext(),sayac,Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onFinish() {

                                    SoruGetir();



                            }
                        }.start();
                    } else {
                        cevapAbutton.setBackgroundColor(Color.RED);
                        sayac--;
                        tiklandi = true;

                        if (cevapBbutton.getText().toString().equals(dogrucevap)) {
                            cevapBbutton.setBackgroundColor(Color.GREEN);
                        } else if (cevapCbutton.getText().toString().equals(dogrucevap)) {
                            cevapCbutton.setBackgroundColor(Color.GREEN);
                        } else if (cevapDbutton.getText().toString().equals(dogrucevap)) {
                            cevapDbutton.setBackgroundColor(Color.GREEN);
                        }
                        new CountDownTimer(3000,1000){

                            @Override
                            public void onTick(long millisUntilFinished) {
                                String sayac = String.valueOf(millisUntilFinished/1000);
                                Toast.makeText(getApplicationContext(),sayac,Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onFinish()
                            {

                                    SoruGetir();


                            }
                        }.start();
                    }

                }
            }
        });

        cevapBbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!tiklandi) {
                    if (cevapBbutton.getText().toString().equals(dogrucevap)) {
                        cevapBbutton.setBackgroundColor(Color.GREEN);
                        sayac++;
                        if(sayac>=3 && sayac<6){
                            Toast.makeText(KendiniDene.this, "Harika Gidiyorsun, Devam!", Toast.LENGTH_SHORT).show();
                        }
                        if(sayac>=6 )
                        {
                            Toast.makeText(KendiniDene.this, "Kendini aşıyorsun!", Toast.LENGTH_SHORT).show();
                        }

                        tiklandi = true;
                        new CountDownTimer(2000,1000){

                            @Override
                            public void onTick(long millisUntilFinished) {
                                String sayac = String.valueOf(millisUntilFinished/1000);
                                Toast.makeText(getApplicationContext(),sayac,Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onFinish() {


                                    SoruGetir();


                            }
                        }.start();
                    } else {
                        cevapBbutton.setBackgroundColor(Color.RED);
                        sayac--;

                        tiklandi = true;

                        if (cevapAbutton.getText().toString().equals(dogrucevap)) {
                            cevapAbutton.setBackgroundColor(Color.GREEN);
                        } else if (cevapCbutton.getText().toString().equals(dogrucevap)) {
                            cevapCbutton.setBackgroundColor(Color.GREEN);
                        } else if (cevapDbutton.getText().toString().equals(dogrucevap)) {
                            cevapDbutton.setBackgroundColor(Color.GREEN);
                        }
                        new CountDownTimer(2000,1000){

                            @Override
                            public void onTick(long millisUntilFinished) {
                                String sayac = String.valueOf(millisUntilFinished/1000);
                                Toast.makeText(getApplicationContext(),sayac,Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onFinish() {


                                    SoruGetir();


                            }
                        }.start();
                    }

                }
            }
        });

        cevapCbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!tiklandi) {
                    if (cevapCbutton.getText().toString().equals(dogrucevap)) {
                        cevapCbutton.setBackgroundColor(Color.GREEN);
                        sayac++;
                        if(sayac>=3 && sayac<6){
                            Toast.makeText(KendiniDene.this, "Harika Gidiyorsun, Devam!", Toast.LENGTH_SHORT).show();
                        }
                        if(sayac>=6 )
                        {
                            Toast.makeText(KendiniDene.this, "Kendini aşıyorsun!", Toast.LENGTH_SHORT).show();
                        }
                        tiklandi = true;
                        new CountDownTimer(2000,1000){

                            @Override
                            public void onTick(long millisUntilFinished) {
                                String sayac = String.valueOf(millisUntilFinished/1000);
                                Toast.makeText(getApplicationContext(),sayac,Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onFinish() {



                                    SoruGetir();


                            }
                        }.start();
                    } else {
                        cevapCbutton.setBackgroundColor(Color.RED);
                        sayac--;
                        tiklandi = true;

                        if (cevapBbutton.getText().toString().equals(dogrucevap)) {
                            cevapBbutton.setBackgroundColor(Color.GREEN);
                        } else if (cevapAbutton.getText().toString().equals(dogrucevap)) {
                            cevapAbutton.setBackgroundColor(Color.GREEN);
                        } else if (cevapDbutton.getText().toString().equals(dogrucevap)) {
                            cevapDbutton.setBackgroundColor(Color.GREEN);
                        }
                        new CountDownTimer(3000,1000){

                            @Override
                            public void onTick(long millisUntilFinished) {
                                String sayac = String.valueOf(millisUntilFinished/1000);
                                Toast.makeText(getApplicationContext(),sayac,Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onFinish()

                            {

                                    SoruGetir();


                            }
                        }.start();
                    }

                }
            }
        });

        cevapDbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!tiklandi) {
                    if (cevapDbutton.getText().toString().equals(dogrucevap)) {
                        cevapDbutton.setBackgroundColor(Color.GREEN);
                        sayac++;
                        if(sayac>=3 && sayac<6){
                            Toast.makeText(KendiniDene.this, "Harika Gidiyorsun, Devam!", Toast.LENGTH_SHORT).show();
                        }
                        if(sayac>=6 )
                        {
                            Toast.makeText(KendiniDene.this, "Kendini aşıyorsun!", Toast.LENGTH_SHORT).show();
                        }
                        tiklandi = true;
                        new CountDownTimer(3000,1000){

                            @Override
                            public void onTick(long millisUntilFinished) {
                                String sayac = String.valueOf(millisUntilFinished/1000);
                                Toast.makeText(getApplicationContext(),sayac,Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onFinish() {



                                    SoruGetir();


                            }
                        }.start();
                    } else {
                        cevapDbutton.setBackgroundColor(Color.RED);
                        sayac--;
                        tiklandi = true;

                        if (cevapBbutton.getText().toString().equals(dogrucevap)) {
                            cevapBbutton.setBackgroundColor(Color.GREEN);
                        } else if (cevapCbutton.getText().toString().equals(dogrucevap)) {
                            cevapCbutton.setBackgroundColor(Color.GREEN);
                        } else if (cevapAbutton.getText().toString().equals(dogrucevap)) {
                            cevapAbutton.setBackgroundColor(Color.GREEN);
                        }
                        new CountDownTimer(3000,1000){

                            @Override
                            public void onTick(long millisUntilFinished) {
                                String sayac = String.valueOf(millisUntilFinished/1000);
                                Toast.makeText(getApplicationContext(),sayac,Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onFinish() {



                                    SoruGetir();


                            }
                        }.start();
                    }

                }
            }
        });


        }

        public void SoruGetir()
        {
            tiklandi = false;
            cevapAbutton.setBackgroundColor(Color.GRAY);
            cevapBbutton.setBackgroundColor(Color.GRAY);
            cevapCbutton.setBackgroundColor(Color.GRAY);
            cevapDbutton.setBackgroundColor(Color.GRAY);


            String sorucevap= sorular.SoruGetir();
            String[] sorucaveparray = sorucevap.split("#");
            String soru = sorucaveparray[0];
            soruButton.setText(soru);
            String[] cevaplar = sorucaveparray[1].split("-");
            dogrucevap = cevaplar[0];
            String cevapA = cevaplar[1];
            String cevapB = cevaplar[2];
            String cevapC = cevaplar[3];
            ArrayList<String> siklar = new ArrayList<>();
            siklar.add(dogrucevap);
            siklar.add(cevapA);
            siklar.add(cevapB);
            siklar.add(cevapC);
            Random random = new Random();
            int indis1 = random.nextInt(siklar.size());
            cevapAbutton.setText(siklar.get(indis1));
            siklar.remove(indis1);
            int indis2 = random.nextInt(siklar.size());
            cevapBbutton.setText(siklar.get(indis2));
            siklar.remove(indis2);
            int indis3 = random.nextInt(siklar.size());
            cevapCbutton.setText(siklar.get(indis3));
            siklar.remove(indis3);
            int indis4 = random.nextInt(siklar.size());
            cevapDbutton.setText(siklar.get(indis4));
            siklar.remove(indis4);
        }
}
