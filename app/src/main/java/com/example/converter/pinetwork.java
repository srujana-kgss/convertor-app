package com.example.converter;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class pinetwork extends AppCompatActivity {
    EditText ZAr,ZAi,ZBr,ZBi,ZCr,ZCi;
    Button calculate;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pinetwork);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ZAr=findViewById(R.id.ZAr);
        ZBr=findViewById(R.id.ZBr);
        ZCr=findViewById(R.id.ZCr);
        ZAi=findViewById(R.id.ZAi);
        ZBi=findViewById(R.id.ZBi);
        ZCi=findViewById(R.id.ZCi);
        calculate=findViewById(R.id.calculateforpi);
        output=findViewById(R.id.outputforpi);



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
                    output.setText("ENTER ZC VALUE 🤨");
                    output.setTextColor(Color.RED);
                    return;
                }

                double a=Double.parseDouble(zar);
                double b=Double.parseDouble(zai);
                double c=Double.parseDouble(zbr);
                double d=Double.parseDouble(zbi);
                double e=Double.parseDouble(zcr);
                double f=Double.parseDouble(zci);

                double o1=((a*c)-(b*d)+(e*a)-(f*b));
                double o2=((b*c)+(a*d)+(f*a)+(e*b));
                double o3=(a+c+e);
                double o4=(b+d+f);
                double oo1=((e*c)-(f*d)+(e*a)-(f*b));
                double oo2=((f*c)+(e*d)+(a*f)+(e*b));

                double pow=(Math.pow(o3,2)+Math.pow(o4,2));
                double k1=((o1*o3)+(o2*o4))/(pow);
                double k2=((o2*o3)-(o1*o4))/(pow);
                double k3=((oo1*o3)+(oo2*o4))/(pow);
                double k4=((oo2*o3)-(oo1*o4))/(pow);

                double cc1=((a*c)-(b*d));
                double cc2=((b*c)+(a*d));
                double cc5=((e*c)-(f*d));
                double cc6=((f*c)+(e*d));
                double cc3=(a+c);
                double cc4=(b+d);
                double cc7=(c+e);
                double cc8=(d+f);

               double pow1=(Math.pow(cc3,2)+Math.pow(cc4,2));
                double pow2=(Math.pow(cc7,2)+Math.pow(cc8,2));

                double c1=(((cc1*cc3)+(cc2*cc4))/(pow1));
                double c2=(((cc2*cc3)-(cc1*cc4))/(pow1));
                double c3=(((cc5*cc7)+(cc6*cc8))/(pow2));
                double c4=(((cc6*cc7)-(cc5*cc8))/(pow2));

                double b1=((k1*c1)-(k2*c2));
                double b2=((k1*c2)+(k2*c1));
                double b3=((k3*c3)-(k4*c4));
                double b4=((k3*c4)+(k4*c3));

                double i1=Math.sqrt(((Math.sqrt((Math.pow(b1,2))+(Math.pow(b2,2))))+b1)/2);
                double i2=Math.sqrt(((Math.sqrt((Math.pow(b1,2))+(Math.pow(b2,2))))-b1)/2);
                double i3=Math.sqrt(((Math.sqrt((Math.pow(b3,2))+(Math.pow(b4,2))))+b3)/2);
                double i4=Math.sqrt(((Math.sqrt((Math.pow(b3,2))+(Math.pow(b4,2))))-b3)/2);

                double f1=((a*c)-(b*d)-(e*c)+(f*d));
                double f2=((b*c)+(a*d)-(c*f)-(d*e));
                double f3=(a+c+e);
                double f4=(b+d+f);
                double f5=(((a*c)-(b*d))*e)-(((b*c)+(a*d))*f);
                double f6=(((b*c)+(a*d))*e)+(((a*c)-(b*d))*f);

                double poww1=((Math.pow(f1,2))-(Math.pow(f2,2)));

                double u1=((4*((f3*f5)-(f4*f6)))+(poww1));
                double u2=((4*((f3*f6)+(f4*f5)))+(2*f1*f2));
               double u3=2*f3;
               double u4=2*f4;

               double poww2=((Math.pow(u1,2))+(Math.pow(u2,2)));
               double sqrt1=Math.sqrt(poww2);
               double xx1=Math.sqrt((sqrt1+u1)/2);
                double xx2=Math.sqrt((sqrt1-u1)/2);
                double xx3=(f1+xx1);
                double xx4=(f2+xx2);

                double poww3=((Math.pow(u3,2))+(Math.pow(u4,2)));

               double tt1=((xx3*u3)+(xx4*u4))/(poww3);
               double tt2=((xx4*u3)-(xx3*u4))/(poww3);

                double ff1=-(((a*c)-(b*d)-(e*c)+(f*d)));
                double ff2=-(((b*c)+(a*d)-(c*f)-(d*e)));
                double uu1=(ff1+xx1);
                double uu2=(ff2+xx2);

                double tt3=((uu1*u3)+(uu2*u4))/(poww3);
                double tt4=((uu2*u3)-(uu1*u4))/(poww3);





                //  double ZOC1=(Za*(Zb+Zc))/(Za+Zb+Zc);
              //  double ZOC2=(Zc*(Zb+Za))/(Za+Zb+Zc);
                //double ZSC1=(Za*Zb)/(Za+Zb);
                //double ZSC2=(Zc*Zb)/(Zb+Zc);
                //double p=(ZOC1*ZSC1);
                //double q=(ZOC2*ZSC2);
                //double Zi1=Math.sqrt(p);
                //double Zi2=Math.sqrt(q);
               // double a=(Za+Zb+Zc);
                //double b=((Za*Zb)-(Zb*Zc));
                //double bsquare=Math.pow(b,2);
                //double c=(Za*Zb*Zc);
                //double Zt1=((b)+Math.sqrt(bsquare+(4*a*c)))/(2*a);
                //double Zt2=((-b)+Math.sqrt(bsquare+(4*a*c)))/(2*a);


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

                String ck1 = String.format("%.4f",c1);
                c1 = Double.valueOf(ck1);
                String ck2 = String.format("%.4f",c2);
                c2 = Double.valueOf(ck2);
                String ck3 = String.format("%.4f",c3);
                c3 = Double.valueOf(ck3);
                String ck4 = String.format("%.4f",c4);
                c4 = Double.valueOf(ck4);


                String fk1 = String.format("%.4f",tt1);
                tt1 = Double.valueOf(fk1);
                String fk2 = String.format("%.4f",tt2);
                tt2 = Double.valueOf(fk2);
                String fk3 = String.format("%.4f",tt3);
                tt3 = Double.valueOf(fk3);
                String fk4 = String.format("%.4f",tt4);
                tt4 = Double.valueOf(fk4);

                output.setText("OPEN CIRCUIT IMPEDENCES"+"\nZOC1 = ("+(k1)+")+j("+(k2)+")\nZOC2 = ("+(k3)+")+j("+(k4)+")\n\nSHORT CIRCUIT IMPEDENCES"+"\nZSC1 = ("+(c1)+")+j("+(c2)+")\nZSC2 = ("+(c3)+")+j("+(c4)+")\n\nIMAGE IMPEDENCES"+"\nZi1 = ("+(i1)+")+j("+(i2)+")\nZi2 = ("+(i3)+")+j("+(i4)+")\n\nITERATIVE IMPEDENCES"+"\nZt1 = ("+tt1+")+j("+tt2+")\nZt2 = ("+tt3+")+j("+tt4+")");

                output.setTextColor(Color.BLACK);
            }
        });

    }
}