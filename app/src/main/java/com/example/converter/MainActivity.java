package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView startodelta,deltatostar,pinetwork,tnetwork,pielements,telements,symmetricalt,symmetricalpi,asst,asspi,network;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        startodelta=findViewById(R.id.startodelta);
        deltatostar=findViewById(R.id.deltatostar);
        pinetwork=findViewById(R.id.forpi);
        tnetwork=findViewById(R.id.forT);
        pielements=findViewById(R.id.elementspi);
        telements=findViewById(R.id.elementsT);
        symmetricalt=findViewById(R.id.symmetricalT);
        symmetricalpi=findViewById(R.id.symmetricalpi);
        asst=findViewById(R.id.asymmetricalt);
        asspi=findViewById(R.id.asymmetricalpi);
        network=findViewById(R.id.parameters);



        startodelta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });

        deltatostar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                startActivity(intent);

            }
        });

        pinetwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,pinetwork.class);
                startActivity(intent);

            }
        });

        tnetwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,tnetwork.class);
                startActivity(intent);

            }
        });
        pielements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,pielements.class);
                startActivity(intent);

            }
        });
        telements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,telements.class);
                startActivity(intent);

            }
        });

        symmetricalt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,symmetricalt.class);
                startActivity(intent);

            }
        });

        symmetricalpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,symmetricalpi.class);
                startActivity(intent);
            }
        });

        asst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,assymetricalt.class);
                startActivity(intent);
            }
        });

        asspi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,assymetricalpi.class);
                startActivity(intent);
            }
        });

        network.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,networkparam.class);
                startActivity(intent);

            }
        });


    }


}