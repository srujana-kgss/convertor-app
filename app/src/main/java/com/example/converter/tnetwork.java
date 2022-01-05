package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class tnetwork extends AppCompatActivity {
    EditText ZAr,ZAi,ZBr,ZBi,ZCr,ZCi;
    Button calculate;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tnetwork);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ZAr=findViewById(R.id.ZArfort);
        ZAi=findViewById(R.id.ZAifort);
        ZBr=findViewById(R.id.ZBrfort);
        ZBi=findViewById(R.id.ZBifort);
        ZCr=findViewById(R.id.ZCrfort);
        ZCi=findViewById(R.id.ZCifort);
        calculate=findViewById(R.id.calculatefort);
        output=findViewById(R.id.outputfort);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String zar=ZAr.getText().toString();
                String zai=ZAi.getText().toString();
                String zbr=ZBr.getText().toString();
                String zbi=ZBi.getText().toString();
                String zcr=ZCr.getText().toString();
                String zci=ZCi.getText().toString();
                if (zar.trim().equals(""))
                {
                    output.setText("ENTER ZA VALUE 🤨");
                    output.setTextColor(Color.RED);
                    return;
                }
                if (zai.trim().equals(""))
                {
                    output.setText("ENTER ZA VALUE 🤨");
                    output.setTextColor(Color.RED);
                    return;
                }
                if (zbr.trim().equals(""))
                {
                    output.setText("ENTER ZB VALUE 🤨");
                    output.setTextColor(Color.RED);
                    return;
                }
                if (zbi.trim().equals(""))
                {
                    output.setText("ENTER ZB VALUE 🤨");
                    output.setTextColor(Color.RED);
                    return;
                }
                if (zcr.trim().equals(""))
                {
                    output.setText("ENTER ZC VALUE 🤨");
                    output.setTextColor(Color.RED);
                    return;
                }
                if (zci.trim().equals(""))
                {
                    output.setText("ENTER ZC VALUE");
                    output.setTextColor(Color.RED);
                    return;
                }

                double a=Double.parseDouble(zar);
                double b=Double.parseDouble(zai);
                double c=Double.parseDouble(zbr);
                double d=Double.parseDouble(zbi);
                double e=Double.parseDouble(zcr);
                double f=Double.parseDouble(zci);

                double k1=(a+e);
                double k2=(b+f);
                double k3=(c+e);
                double k4=(d+f);

                double s1=(a*c)+(c*e)+(e*a)-(b*d)-(d*f)-(f*b);
                double s2=(b*c)+(a*d)+(e*d)+(c*f)+(a*f)+(e*b);

                double c1=((s1*k3)+(s2*k4))/((Math.pow(k3,2))+(Math.pow(k4,2)));
                double c2=((s2*k3)-(s1*k4))/((Math.pow(k3,2))+(Math.pow(k4,2)));
                double c3=((s1*k1)+(s2*k2))/((Math.pow(k1,2))+(Math.pow(k2,2)));
                double c4=((s2*k1)-(s1*k2))/((Math.pow(k1,2))+(Math.pow(k2,2)));

                double b1=((k1*c1)-(k2*c2));
                double b2=((k1*c2)+(k2*c1));
                double b3=((k3*c3)-(k4*c4));
                double b4=((k3*c4)+(k4*c3));

                double i1=Math.sqrt(((Math.sqrt((Math.pow(b1,2))+(Math.pow(b2,2))))+b1)/2);
                double i2=Math.sqrt(((Math.sqrt((Math.pow(b1,2))+(Math.pow(b2,2))))-b1)/2);
                double i3=Math.sqrt(((Math.sqrt((Math.pow(b3,2))+(Math.pow(b4,2))))+b3)/2);
                double i4=Math.sqrt(((Math.sqrt((Math.pow(b3,2))+(Math.pow(b4,2))))-b3)/2);


                double t1=(a-c);
                double t2=(b-d);
                double t3=(c-a);
                double t4=(d-b);

                double T1=(Math.pow(t1,2)-Math.pow(t2,2));
                double T2=2*t1*t2;
                double T3=Math.pow(t3,2)-Math.pow(t4,2);
                double T4=2*t3*t4;

                double kk1=(T1+(4*s1));
                double kk2=(T2+(4*s2));
                double kkk1=Math.pow(kk1,2);
                double kkk2=Math.pow(kk2,2);
                double kk3=(T3+(4*s1));
                double kk4=(T4+(4*s2));
                double kkk3=Math.pow(kk3,2);
                double kkk4=Math.pow(kk4,2);

                double p1=Math.sqrt(((Math.sqrt(kkk1+kkk2))+kk1)/2);
                double p2=Math.sqrt(((Math.sqrt(kkk1+kkk2))-kk1)/2);
                double p3=Math.sqrt(((Math.sqrt(kkk3+kkk4))+kk3)/2);
                double p4=Math.sqrt(((Math.sqrt(kkk3+kkk4))-kk3)/2);

                double tt1=(t1+p1)/2;
                double tt2=(t2+p2)/2;
                double tt3=(t3+p3)/2;
                double tt4=(t4+p4)/2;


                String ss1 = String.format("%.4f",k1);
                k1 = Double.valueOf(ss1);
                String ss2 = String.format("%.4f",k2);
                k2 = Double.valueOf(ss2);
                String ss3 = String.format("%.4f",k3);
                k3 = Double.valueOf(ss3);
                String ss4 = String.format("%.4f",k4);
                k4 = Double.valueOf(ss4);


                String ii1 = String.format("%.4f",i1);
                i1 = Double.valueOf(ii1);
                String ii2 = String.format("%.4f",i2);
                i2 = Double.valueOf(ii2);
                String ii3 = String.format("%.4f",i3);
                i3 = Double.valueOf(ii3);
                String ii4 = String.format("%.4f",i4);
                i4 = Double.valueOf(ii4);

                String cc1 = String.format("%.4f",c1);
                c1 = Double.valueOf(cc1);
                String cc2 = String.format("%.4f",c2);
                c2 = Double.valueOf(cc2);
                String cc3 = String.format("%.4f",c3);
                c3 = Double.valueOf(cc3);
                String cc4 = String.format("%.4f",c4);
                c4 = Double.valueOf(cc4);


                String f1 = String.format("%.4f",tt1);
                tt1 = Double.valueOf(f1);
                String f2 = String.format("%.4f",tt2);
                tt2 = Double.valueOf(f2);
                String f3 = String.format("%.4f",tt3);
                tt3 = Double.valueOf(f3);
                String f4 = String.format("%.4f",tt4);
                tt4 = Double.valueOf(f4);


                output.setText("OPEN CIRCUIT IMPEDENCES"+"\nZOC1 = ("+(k1)+")+j("+(k2)+")\nZOC2 = ("+(k3)+")+j("+(k4)+")\n\nSHORT CIRCUIT IMPEDENCES"+"\nZSC1 = ("+(c1)+")+j("+(c2)+")\nZSC2 = ("+(c3)+")+j("+(c4)+")\n\nIMAGE IMPEDENCES"+"\nZi1 = ("+(i1)+")+j("+(i2)+")\nZi2 = ("+(i3)+")+j("+(i4)+")\n\nITERATIVE IMPEDENCES"+"\nZt1 = ("+tt1+")+j("+tt2+")\nZt2 = ("+tt3+")+j("+tt4+")");
                output.setTextColor(Color.BLACK);
            }
        });
    }
}