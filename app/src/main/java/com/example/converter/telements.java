package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Double.NaN;

public class telements extends AppCompatActivity {
    EditText ZOC1r,ZOC1i,ZOC2r,ZOC2i,ZSC1r,ZSC1i,ZSC2r,ZSC2i;
    Button calculate;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telements);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ZOC1r=findViewById(R.id.ZOC1rT);
        ZOC2r=findViewById(R.id.ZOC2rT);
        ZSC1r=findViewById(R.id.ZSC1rT);
        ZSC2r=findViewById(R.id.ZSC2rT);
        ZOC1i=findViewById(R.id.ZOC1iT);
        ZOC2i=findViewById(R.id.ZOC2iT);
        ZSC1i=findViewById(R.id.ZSC1iT);
        ZSC2i=findViewById(R.id.ZSC2iT);
        calculate=findViewById(R.id.calculatefortelements);
        output=findViewById(R.id.outputfortelements);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String zoc1r=ZOC1r.getText().toString();
                String zoc2r=ZOC2r.getText().toString();
                String zsc1r=ZSC1r.getText().toString();
                String zsc2r=ZSC2r.getText().toString();
                String zoc1i=ZOC1i.getText().toString();
                String zoc2i=ZOC2i.getText().toString();
                String zsc1i=ZSC1i.getText().toString();
                String zsc2i=ZSC2i.getText().toString();
                if (zoc1r.trim().equals(""))
                {
                    output.setText("ENTER ZOC1 VALUE 🤨");
                    output.setTextColor(Color.RED);
                    return;
                }
                if (zoc2r.trim().equals(""))
                {
                    output.setText("ENTER ZOC2 VALUE 🤨");
                    output.setTextColor(Color.RED);
                    return;
                }
                if (zsc1r.trim().equals(""))
                {
                    output.setText("ENTER ZSC1 VALUE 🤨");
                    output.setTextColor(Color.RED);
                    return;
                }
                if (zsc2r.trim().equals(""))
                {
                    output.setText("ENTER ZSC2 VALUE 🤨");
                    output.setTextColor(Color.RED);
                    return;

                }

                if (zoc1i.trim().equals(""))
                {
                    output.setText("ENTER ZOC1 VALUE 🤨");
                    output.setTextColor(Color.RED);
                    return;
                }
                if (zoc2i.trim().equals(""))
                {
                    output.setText("ENTER ZOC2 VALUE 🤨");
                    output.setTextColor(Color.RED);
                    return;
                }
                if (zsc1i.trim().equals(""))
                {
                    output.setText("ENTER ZSC1 VALUE 🤨");
                    output.setTextColor(Color.RED);
                    return;
                }
                if (zsc2i.trim().equals(""))
                {
                    output.setText("ENTER ZSC2 VALUE 🤨");
                    output.setTextColor(Color.RED);
                    return;

                }


                double a=Double.parseDouble(zoc1r);
                double c=Double.parseDouble(zoc2r);
                double e=Double.parseDouble(zsc1r);
                double g=Double.parseDouble(zsc2r);
                double b=Double.parseDouble(zoc1i);
                double d=Double.parseDouble(zoc2i);
                double f=Double.parseDouble(zsc1i);
                double h=Double.parseDouble(zsc2i);

                double a1=((c*(a-e))-(d*(b-f)));
                double a2=((c*(b-f))+(d*(a-e)));
                double powa1a1=(Math.pow(a1,2)+Math.pow(a2,2));
                double sqrt=(Math.sqrt(powa1a1));

                double a3=Math.sqrt((sqrt+a1)/2);
                double a4=Math.sqrt((sqrt-a1)/2);
                double a5=((c*e)-(d*f));
                double a6=((c*f)+(d*e));

                double pow2=(Math.pow(a3,2)+Math.pow(a4,2));

                double Zbr=(((a5*a3)+(a6*a4))/(pow2));
                double Zbi=(((a6*a3)-(a5*a4))/(pow2));

                double b1=(c-a3);
                double b2=(d-a4);
                double c1=(a-a3);
                double c2=(b-a4);

                double pow3=(Math.pow(b1,2)+Math.pow(b2,2));
                double pow4=(Math.pow(c1,2)+Math.pow(c2,2));

                double Zar=(((b1*a5)+(b2*a6))/(pow3));
                double Zai=(((b1*a6)-(b2*a5))/(pow3));
                double Zcr=(((c1*a5)+(c2*a6))/(pow4));
                double Zci=(((c1*a6)-(c2*a5))/(pow4));

                double sum1=(Zar+Zbr+Zcr);
                double sum2=(Zai+Zbi+Zci);
                double poww=(Math.pow(sum1,2)+Math.pow(sum2,2));

                double t1=((Zar*Zbr)-(Zai*Zbi));
                double t2=((Zar*Zbi)+(Zai*Zbr));
                double t3=((Zcr*Zbr)-(Zci*Zbi));
                double t4=((Zcr*Zbi)+(Zci*Zbr));
                double t5=((Zar*Zcr)-(Zai*Zci));
                double t6=((Zar*Zci)+(Zai*Zcr));

                double Z1r=((t1*sum1)+(t2*sum2))/(poww);
                double Z1i=((t2*sum1)-(t1*sum2))/(poww);
                double Z2r=((t3*sum1)+(t4*sum2))/(poww);
                double Z2i=((t4*sum1)-(t3*sum2))/(poww);
                double Z3r=((t5*sum1)+(t6*sum2))/(poww);
                double Z3i=((t6*sum1)-(t5*sum2))/(poww);

                String k1 = String.format("%.4f",Z1r);
                Z1r = Double.valueOf(k1);
                String k2 = String.format("%.4f",Z1i);
                Z1i = Double.valueOf(k2);
                String k3 = String.format("%.4f",Z2r);
                Z2r = Double.valueOf(k3);
                String k4 = String.format("%.4f",Z2i);
                Z2i = Double.valueOf(k4);
                String k5 = String.format("%.4f",Z3r);
                Z3r = Double.valueOf(k5);
                String k6 = String.format("%.4f",Z3i);
                Z3i = Double.valueOf(k6);






                output.setText("Za = ("+(Z1r)+")+j("+(Z1i)+")\nZb = ("+(Z2r)+")+j("+(Z2i)+")\nZc = ("+(Z3r)+")+j("+(Z3i)+")");
                output.setTextColor(Color.BLACK);
            }
        });
    }
}