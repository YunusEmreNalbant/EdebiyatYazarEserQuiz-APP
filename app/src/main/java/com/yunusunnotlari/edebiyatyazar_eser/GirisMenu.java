package com.yunusunnotlari.edebiyatyazar_eser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GirisMenu extends AppCompatActivity {
    Button onemlibilgilerButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris_menu);

        Button yazareserButton = (Button) findViewById(R.id.yazareserButton);
        Button cikmissorularButton = (Button) findViewById(R.id.yazareserButton);
        Button onemlibilgilerButton = (Button) findViewById(R.id.yazareserButton);
        Button cikisButton = (Button) findViewById(R.id.yazareserButton);


    }

    public void onemlibilgiler(View view)
    {
        Intent intent= new Intent(getApplicationContext(),OnemliBilgiler.class);
        startActivity(intent);
    }

    public  void ilkler (View view)
    {
        Intent intent = new Intent(getApplicationContext(),IlklerMenu.class);
        startActivity(intent);
    }

    public void yazareser(View view)
    {
        Intent intent=new Intent(getApplicationContext(),YazarEser.class);
        startActivity(intent);

    }

    public void kendinidene (View view)
    {
        Intent intent = new Intent(getApplicationContext(),KendiniDene.class);
        startActivity(intent);

    }


}
