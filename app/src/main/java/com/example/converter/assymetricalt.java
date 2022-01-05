package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class assymetricalt extends AppCompatActivity {
    EditText R1,R2,D;
    Button calculate;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assymetricalt);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        R1=findViewById(R.id.inputR1value);
        R2=findViewById(R.id.inputR2VALUE);
        D=findViewById(R.id.attenuation);
        calculate=findViewById(R.id.calculate);
        output=findViewById(R.id.outputtext);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String r1=R1.getText().toString();
                String r2=R2.getText().toString();
                String d=D.getText().toString();

                if (r1.trim().equals(""))
                {
                    output.setText("Enter input impedence 🤨");
                    output.setTextColor(Color.RED);
                    return;
                }
                if (r2.trim().equals(""))
                {
                    output.setText("Enter output impedence 🤨");
                    output.setTextColor(Color.RED);
                    return;
                }
                if (d.trim().equals(""))
                {
                    output.setText("Enter Attenuation 🤨");
                    output.setTextColor(Color.RED);
                    return;
                }
                double ri=Double.parseDouble(r1);
                double ro=Double.parseDouble(r2);
                double db=Double.parseDouble(d);

                double N=Math.pow(10,(db/20));
                double a =Math.pow(N,2);
                double x=((a+1)/(a-1));
                double y=((N)/(a-1));
                double root =Math.sqrt((ri*ro));
                double ra=((ri*x)-(2*root*y));
                double rb=(2*root*y);
                double rc=((ro*x)-(2*root*y));

                String s1 = String.format("%.5f",ra);
                ra = Double.valueOf(s1);
                String s2 = String.format("%.5f",rb);
                rb = Double.valueOf(s2);
                String s3 = String.format("%.5f",rc);
                rc = Double.valueOf(s3);

                output.setText("Ra = "+ra+"\nRb= "+rb+"\nRc = "+rc);
                output.setTextColor(Color.BLACK);

            }
        });
    }
}