package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class symmetricalpi extends AppCompatActivity {
    EditText chI,D;
    Button calculate;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symmetricalpi);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        chI=findViewById(R.id.chimpedence);
        D=findViewById(R.id.attenuation);
        calculate=findViewById(R.id.calculate);
        output=findViewById(R.id.outputtext);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String chi=chI.getText().toString();

                String d=D.getText().toString();

                if (chi.trim().equals(""))
                {
                    output.setText("Enter characteristic impedence 🤨");
                    output.setTextColor(Color.RED);
                    return;
                }
                if (d.trim().equals(""))
                {
                    output.setText("Enter output impedence 🤨");
                    output.setTextColor(Color.RED);
                    return;
                }

                double ch=Double.parseDouble(chi);
                double db=Double.parseDouble(d);

                double N=Math.pow(10,(db/20));
                double a =Math.pow(N,2);
                double n1=((N+1)/(N-1));
                double n2=((a-1)/(2*(N)));
                double ra=(ch*n2);
                double rb=(ch*n1);

                String s1 = String.format("%.5f",ra);
                ra = Double.valueOf(s1);
                String s2 = String.format("%.5f",rb);
                rb = Double.valueOf(s2);



                output.setText("Ra = "+ra+"\nRb= "+rb);
                output.setTextColor(Color.BLACK);
            }
        });
    }
}