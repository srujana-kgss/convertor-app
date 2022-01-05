package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class networkparam extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5,e6,e7,e8;

    Button calculate;
    TextView output;
    Spinner spins;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_networkparam);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        e1=findViewById(R.id.first);
        e2=findViewById(R.id.second);
        e3=findViewById(R.id.third);
        e4=findViewById(R.id.four);
        e5=findViewById(R.id.five);
        e6=findViewById(R.id.six);
        e7=findViewById(R.id.seven);
        e8=findViewById(R.id.eight);
        calculate=findViewById(R.id.calculate);
        output=findViewById(R.id.output);
        spins=findViewById(R.id.spin);

        String[] values = {"Z parameters","Y Parameters","H Parameters","ABCD Parameters"};
        ArrayAdapter ad =new ArrayAdapter<String>(this,R.layout.selected,values);
        spins.setAdapter(ad);




        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String z1=e1.getText().toString();
                String z2=e2.getText().toString();
                String z3=e3.getText().toString();
                String z4=e4.getText().toString();
                String z5=e5.getText().toString();
                String z6=e6.getText().toString();
                String z7=e7.getText().toString();
                String z8=e8.getText().toString();
                if (z1.trim().equals(""))
                {
                    output.setText("ENTER VALUE 🤨");
                    output.setTextColor(Color.RED);
                    return;
                }
                if (z2.trim().equals(""))
                {
                    output.setText("ENTER VALUE 🤨");
                    output.setTextColor(Color.RED);
                    return;
                }

                if (z3.trim().equals(""))
                {
                    output.setText("ENTER VALUE 🤨");
                    output.setTextColor(Color.RED);
                    return;
                }
                if (z4.trim().equals(""))
                {
                    output.setText("ENTER VALUE 🤨");
                    output.setTextColor(Color.RED);
                    return;
                }
                if (z5.trim().equals(""))
                {
                    output.setText("ENTER VALUE 🤨");
                    output.setTextColor(Color.RED);
                    return;
                }
                if (z6.trim().equals(""))
                {
                    output.setText("ENTER VALUE 🤨");
                    output.setTextColor(Color.RED);
                    return;
                }
                if (z7.trim().equals(""))
                {
                    output.setText("ENTER VALUE 🤨");
                    output.setTextColor(Color.RED);
                    return;
                }
                if (z8.trim().equals(""))
                {
                    output.setText("ENTER VALUE 🤨");
                    output.setTextColor(Color.RED);
                    return;
                }


                double r11=Double.parseDouble(z1);
                double i11=Double.parseDouble(z2);
                double r12=Double.parseDouble(z3);
                double i12=Double.parseDouble(z4);
                double r21=Double.parseDouble(z5);
                double i21=Double.parseDouble(z6);
                double r22=Double.parseDouble(z7);
                double i22=Double.parseDouble(z8);


                if(spins.getSelectedItem().toString()=="Z parameters")


                { double den1=((r11*r22)-(i11*i22)-(r12*r21)+(i12*i21));
                    double den2=((r11*i22)+(i11*r22)-(r12*i21)-(i12*r21));
                    double y11r=((r22*den1)+(i22*den2))/((Math.pow(den1,2))+(Math.pow(den2,2)));
                    double y11i=((i22*den1)-(r22*den2))/((Math.pow(den1,2))+(Math.pow(den2,2)));
                    double y12r=-(((r12*den1)+(i12*den2))/((Math.pow(den1,2))+(Math.pow(den2,2))));
                    double y12i=-(((i12*den1)-(r12*den2))/((Math.pow(den1,2))+(Math.pow(den2,2))));
                    double y21r=-(((r21*den1)+(i21*den2))/((Math.pow(den1,2))+(Math.pow(den2,2))));
                    double y21i=-(((i21*den1)-(r21*den2))/((Math.pow(den1,2))+(Math.pow(den2,2))));
                    double y22r=((r11*den1)+(i11*den2))/((Math.pow(den1,2))+(Math.pow(den2,2)));
                    double y22i=((i11*den1)-(r11*den2))/((Math.pow(den1,2))+(Math.pow(den2,2)));


                    double h11r=((den1*r22)+(den2*i22))/((Math.pow(r22,2))+(Math.pow(i22,2)));
                    double h11i=((den2*r22)-(den1*i22))/((Math.pow(r22,2))+(Math.pow(i22,2)));
                    double h12r=((r12*r22)+(i12*i22))/((Math.pow(r22,2))+(Math.pow(i22,2)));
                    double h12i=((i12*r22)-(r12*i22))/((Math.pow(r22,2))+(Math.pow(i22,2)));
                    double h21r=-(((r21*r22)+(i21*i22))/((Math.pow(r22,2))+(Math.pow(i22,2))));
                    double h21i=-(((i21*r22)-(r21*i22))/((Math.pow(r22,2))+(Math.pow(i22,2))));
                    double h22r=(r22)/((Math.pow(r22,2))+(Math.pow(i22,2)));
                    double h22i=(-i22)/((Math.pow(r22,2))+(Math.pow(i22,2)));

                    double Ar=((r11*r21)+(i11*i21))/((Math.pow(r21,2))+(Math.pow(i21,2)));
                    double Ai=((i11*r21)-(r11*i21))/((Math.pow(r21,2))+(Math.pow(i21,2)));
                    double Br=((den1*r21)+(den2*i21))/((Math.pow(r21,2))+(Math.pow(i21,2)));
                    double Bi=((den2*r21)-(den1*i21))/((Math.pow(r21,2))+(Math.pow(i21,2)));
                    double Cr=(r21)/((Math.pow(r21,2))+(Math.pow(i21,2)));
                    double Ci=(-i21)/((Math.pow(r21,2))+(Math.pow(i21,2)));
                    double Dr=((r22*r21)+(i22*i21))/((Math.pow(r21,2))+(Math.pow(i21,2)));
                    double Di=((i22*r21)-(r22*i21))/((Math.pow(r21,2))+(Math.pow(i21,2)));

                    String ss1 = String.format("%.4f",y11r);
                    y11r = Double.valueOf(ss1);
                    String ss2 = String.format("%.4f",y11i);
                    y11i = Double.valueOf(ss2);
                    String ss3 = String.format("%.4f",y12r);
                    y12r = Double.valueOf(ss3);
                    String ss4 = String.format("%.4f",y12i);
                    y12i = Double.valueOf(ss4);
                    String s1 = String.format("%.4f",y21r);
                    y21r = Double.valueOf(s1);
                    String s2 = String.format("%.4f",y21i);
                    y21i = Double.valueOf(s2);
                    String s3 = String.format("%.4f",y22r);
                    y22r = Double.valueOf(s3);
                    String s4 = String.format("%.4f",y22i);
                    y22i = Double.valueOf(s4);
                    String sss1 = String.format("%.4f",h11r);
                    h11r = Double.valueOf(sss1);
                    String sss2 = String.format("%.4f",h11i);
                    h11i = Double.valueOf(sss2);
                    String sss3 = String.format("%.4f",h12r);
                    h12r = Double.valueOf(sss3);
                    String sss4 = String.format("%.4f",h12i);
                    h12i = Double.valueOf(sss4);
                    String ssss1 = String.format("%.4f",h21r);
                    h21r = Double.valueOf(ssss1);
                    String ssss2 = String.format("%.4f",h21i);
                    h21i = Double.valueOf(ssss2);
                    String ssss3 = String.format("%.4f",h22r);
                    h22r = Double.valueOf(ssss3);
                    String ssss4 = String.format("%.4f",h22i);
                    h22i = Double.valueOf(ssss4);
                    String s11 = String.format("%.4f",Ar);
                    Ar = Double.valueOf(s11);
                    String s22 = String.format("%.4f",Ai);
                    Ai = Double.valueOf(s22);
                    String s33 = String.format("%.4f",Br);
                    Br = Double.valueOf(s33);
                    String s44 = String.format("%.4f",Bi);
                    Bi = Double.valueOf(s44);
                    String s5 = String.format("%.4f",Cr);
                    Cr = Double.valueOf(s5);
                    String s6 = String.format("%.4f",Ci);
                    Ci= Double.valueOf(s6);
                    String s7 = String.format("%.4f",Dr);
                    Dr = Double.valueOf(s7);
                    String s8 = String.format("%.4f",Di);
                    Di = Double.valueOf(s8);


                    output.setText("y11 = ("+y11r+")+j("+y11i+")\ny12 = ("+y12r+")+j("+y12i+")\ny21 = ("+y21r+")+j("+y21i+")\ny22 = ("+y22r+")+j("+y22i
                    +")\n\nh11 = ("+h11r+")+j("+h11i+")\nh12 = ("+h12r+")+j("+h12i+")\nh21 = ("+h21r+")+j("+h21i+")\nh22 = ("+h22r+")+j("+h22i
                            +")\n\nA = ("+Ar+")+j("+Ai+")\nB = ("+Br+")+j("+Bi+")\nC = ("+Cr+")+j("+Ci+")\nD = ("+Dr+")+j("+Di+")");
                    output.setTextColor(Color.BLACK);

                }

                if(spins.getSelectedItem().toString()=="Y Parameters")


                {



                    double den1=((r11*r22)-(i11*i22)-(r12*r21)+(i12*i21));
                    double den2=((r11*i22)+(i11*r22)-(r12*i21)-(i12*r21));
                    double z11r=((r22*den1)+(i22*den2))/((Math.pow(den1,2))+(Math.pow(den2,2)));
                    double z11i=((i22*den1)-(r22*den2))/((Math.pow(den1,2))+(Math.pow(den2,2)));
                    double z12r=-(((r12*den1)+(i12*den2))/((Math.pow(den1,2))+(Math.pow(den2,2))));
                    double z12i=-(((i12*den1)-(r12*den2))/((Math.pow(den1,2))+(Math.pow(den2,2))));
                    double z21r=-(((r21*den1)+(i21*den2))/((Math.pow(den1,2))+(Math.pow(den2,2))));
                    double z21i=-(((i21*den1)-(r21*den2))/((Math.pow(den1,2))+(Math.pow(den2,2))));
                    double z22r=((r11*den1)+(i11*den2))/((Math.pow(den1,2))+(Math.pow(den2,2)));
                    double z22i=((i11*den1)-(r11*den2))/((Math.pow(den1,2))+(Math.pow(den2,2)));







                    double h11r=(r11)/((Math.pow(r11,2))+(Math.pow(i11,2)));
                    double h11i=(-i11)/((Math.pow(r11,2))+(Math.pow(i11,2)));
                    double h12r=-(((r12*r11)+(i12*i11))/((Math.pow(r11,2))+(Math.pow(i11,2))));
                    double h12i=-(((i12*r11)-(r12*i11))/((Math.pow(r11,2))+(Math.pow(i11,2))));
                    double h21r=((r21*r11)+(i21*i11))/((Math.pow(r11,2))+(Math.pow(i11,2)));
                    double h21i=((i21*r11)-(r21*i11))/((Math.pow(r11,2))+(Math.pow(i11,2)));
                    double h22r=((den1*r11)+(den2*i11))/((Math.pow(r11,2))+(Math.pow(i11,2)));
                    double h22i=((den2*r11)-(den1*i11))/((Math.pow(r11,2))+(Math.pow(i11,2)));


                    double Ar=(-((r22*r21)+(i22*i21))/((Math.pow(r21,2))+(Math.pow(i21,2))));
                    double Ai=(-((i22*r21)-(r22*i21))/((Math.pow(r21,2))+(Math.pow(i21,2))));
                    double Br=(-r21)/((Math.pow(r21,2))+(Math.pow(i21,2)));
                    double Bi=(i21)/((Math.pow(r21,2))+(Math.pow(i21,2)));
                    double Cr=(-((den1*r21)+(den2*i21))/((Math.pow(r21,2))+(Math.pow(i21,2))));
                    double Ci=(-((den2*r21)-(den1*i21))/((Math.pow(r21,2))+(Math.pow(i21,2))));
                    double Dr=(-((r11*r21)+(i11*i21))/((Math.pow(r21,2))+(Math.pow(i21,2))));
                    double Di=(-((i11*r21)-(r11*i21))/((Math.pow(r21,2))+(Math.pow(i21,2))));

                    String ss1 = String.format("%.4f",z11r);
                    z11r = Double.valueOf(ss1);
                    String ss2 = String.format("%.4f",z11i);
                    z11i = Double.valueOf(ss2);
                    String ss3 = String.format("%.4f",z12r);
                    z12r = Double.valueOf(ss3);
                    String ss4 = String.format("%.4f",z12i);
                    z12i = Double.valueOf(ss4);
                    String s1 = String.format("%.4f",z21r);
                    z21r = Double.valueOf(s1);
                    String s2 = String.format("%.4f",z21i);
                    z21i = Double.valueOf(s2);
                    String s3 = String.format("%.4f",z22r);
                    z22r = Double.valueOf(s3);
                    String s4 = String.format("%.4f",z22i);
                    z22i = Double.valueOf(s4);
                    String sss1 = String.format("%.4f",h11r);
                    h11r = Double.valueOf(sss1);
                    String sss2 = String.format("%.4f",h11i);
                    h11i = Double.valueOf(sss2);
                    String sss3 = String.format("%.4f",h12r);
                    h12r = Double.valueOf(sss3);
                    String sss4 = String.format("%.4f",h12i);
                    h12i = Double.valueOf(sss4);
                    String ssss1 = String.format("%.4f",h21r);
                    h21r = Double.valueOf(ssss1);
                    String ssss2 = String.format("%.4f",h21i);
                    h21i = Double.valueOf(ssss2);
                    String ssss3 = String.format("%.4f",h22r);
                    h22r = Double.valueOf(ssss3);
                    String ssss4 = String.format("%.4f",h22i);
                    h22i = Double.valueOf(ssss4);
                    String s11 = String.format("%.4f",Ar);
                    Ar = Double.valueOf(s11);
                    String s22 = String.format("%.4f",Ai);
                    Ai = Double.valueOf(s22);
                    String s33 = String.format("%.4f",Br);
                    Br = Double.valueOf(s33);
                    String s44 = String.format("%.4f",Bi);
                    Bi = Double.valueOf(s44);
                    String s5 = String.format("%.4f",Cr);
                    Cr = Double.valueOf(s5);
                    String s6 = String.format("%.4f",Ci);
                    Ci= Double.valueOf(s6);
                    String s7 = String.format("%.4f",Dr);
                    Dr = Double.valueOf(s7);
                    String s8 = String.format("%.4f",Di);
                    Di = Double.valueOf(s8);

                    output.setText("z11 = ("+z11r+")+j("+z11i+")\nz12 = ("+z12r+")+j("+z12i+")\nz21 = ("+z21r+")+j("+z21i+")\nz22 = ("+z22r+")+j("+z22i
                            +")\n\nh11 = ("+h11r+")+j("+h11i+")\nh12 = ("+h12r+")+j("+h12i+")\nh21 = ("+h21r+")+j("+h21i+")\nh22 = ("+h22r+")+j("+h22i
                            +")\n\nA = ("+Ar+")+j("+Ai+")\nB = ("+Br+")+j("+Bi+")\nC = ("+Cr+")+j("+Ci+")\nD = ("+Dr+")+j("+Di+")");

                    output.setTextColor(Color.BLACK);
                }

                if(spins.getSelectedItem().toString()=="H Parameters")
                {
                    double n1=((r11*r22)-(i11*i22)-(r12*r21)+(i12*i21));
                    double n2=((r11*i22)+(i11*r22)-(r12*i21)-(i12*r21));


                    double z11r=((n1*r22)+(n2*i22))/((Math.pow(r22,2))+(Math.pow(i22,2)));
                    double z11i=((n2*r22)-(n1*i22))/((Math.pow(r22,2))+(Math.pow(i22,2)));

                    double z12r=((r12*r22)+(i12*i22))/((Math.pow(r22,2))+(Math.pow(i22,2)));
                    double z12i=((i12*r22)-(r12*i22))/((Math.pow(r22,2))+(Math.pow(i22,2)));
                    double z21r=-(((r21*r22)+(i21*i22))/((Math.pow(r22,2))+(Math.pow(i22,2))));
                    double z21i=-(((i21*r22)-(r21*i22))/((Math.pow(r22,2))+(Math.pow(i22,2))));
                    double z22r=(r22)/((Math.pow(r22,2))+(Math.pow(i22,2)));
                    double z22i=(-i22)/((Math.pow(r22,2))+(Math.pow(i22,2)));



                    double y11r=(r11)/((Math.pow(r11,2))+(Math.pow(i11,2)));
                    double y11i=(-i11)/((Math.pow(r11,2))+(Math.pow(i11,2)));

                    double y12r=-(((r12*r11)+(i12*i11))/((Math.pow(r11,2))+(Math.pow(i11,2))));
                    double y12i=-(((i12*r11)-(r12*i11))/((Math.pow(r11,2))+(Math.pow(i11,2))));
                    double y21r=((r21*r11)+(i21*i11))/((Math.pow(r11,2))+(Math.pow(i11,2)));
                    double y21i=((i21*r11)-(r21*i11))/((Math.pow(r11,2))+(Math.pow(i11,2)));
                    double y22r=((n1*r11)+(n2*i11))/((Math.pow(r11,2))+(Math.pow(i11,2)));
                    double y22i=((n2*r11)-(n1*i11))/((Math.pow(r11,2))+(Math.pow(i11,2)));



                    double Ar=(((-n1)*r21)+((-n2)*i21))/((Math.pow(r21,2))+(Math.pow(i21,2)));
                    double Ai=(((-n2)*r21)-((-n1)*i21))/((Math.pow(r21,2))+(Math.pow(i21,2)));
                    double Br=-(((r11*r21)+(i11*i21))/((Math.pow(r21,2))+(Math.pow(i21,2))));
                    double Bi=-(((i11*r21)-(r11*i21))/((Math.pow(r21,2))+(Math.pow(i21,2))));
                    double Cr=-(((r22*r21)+(i22*i21))/((Math.pow(r21,2))+(Math.pow(i21,2))));
                    double Ci=-(((i22*r21)-(r22*i21))/((Math.pow(r21,2))+(Math.pow(i21,2))));
                    double Dr=(-r21)/((Math.pow(r21,2))+(Math.pow(i21,2)));
                    double Di=(i21)/((Math.pow(r21,2))+(Math.pow(i21,2)));


                    String ss1 = String.format("%.4f",z11r);
                    z11r = Double.valueOf(ss1);
                    String ss2 = String.format("%.4f",z11i);
                    z11i = Double.valueOf(ss2);
                    String ss3 = String.format("%.4f",z12r);
                    z12r = Double.valueOf(ss3);
                    String ss4 = String.format("%.4f",z12i);
                    z12i = Double.valueOf(ss4);
                    String s1 = String.format("%.4f",z21r);
                    z21r = Double.valueOf(s1);
                    String s2 = String.format("%.4f",z21i);
                    z21i = Double.valueOf(s2);
                    String s3 = String.format("%.4f",z22r);
                    z22r = Double.valueOf(s3);
                    String s4 = String.format("%.4f",z22i);
                    z22i = Double.valueOf(s4);
                    String sss1 = String.format("%.4f",y11r);
                    y11r = Double.valueOf(sss1);
                    String sss2 = String.format("%.4f",y11i);
                    y11i = Double.valueOf(sss2);
                    String sss3 = String.format("%.4f",y12r);
                    y12r = Double.valueOf(sss3);
                    String sss4 = String.format("%.4f",y12i);
                    y12i = Double.valueOf(sss4);
                    String sk1 = String.format("%.4f",y21r);
                    y21r = Double.valueOf(sk1);
                    String sk2 = String.format("%.4f",y21i);
                    y21i = Double.valueOf(sk2);
                    String sk3 = String.format("%.4f",y22r);
                    y22r = Double.valueOf(sk3);
                    String sk4 = String.format("%.4f",y22i);
                    y22i = Double.valueOf(sk4);
                    String s11 = String.format("%.4f",Ar);
                    Ar = Double.valueOf(s11);
                    String s22 = String.format("%.4f",Ai);
                    Ai = Double.valueOf(s22);
                    String s33 = String.format("%.4f",Br);
                    Br = Double.valueOf(s33);
                    String s44 = String.format("%.4f",Bi);
                    Bi = Double.valueOf(s44);
                    String s5 = String.format("%.4f",Cr);
                    Cr = Double.valueOf(s5);
                    String s6 = String.format("%.4f",Ci);
                    Ci= Double.valueOf(s6);
                    String s7 = String.format("%.4f",Dr);
                    Dr = Double.valueOf(s7);
                    String s8 = String.format("%.4f",Di);
                    Di = Double.valueOf(s8);



                    output.setText("z11 = ("+z11r+")+j("+z11i+")\nz12 = ("+z12r+")+j("+z12i+")\nz21 = ("+z21r+")+j("+z21i+")\nz22 = ("+z22r+")+j("+z22i
                            +")\n\ny11 = ("+y11r+")+j("+y11i+")\ny12 = ("+y12r+")+j("+y12i+")\ny21 = ("+y21r+")+j("+y21i+")\ny22 = ("+y22r+")+j("+y22i
                            +")\n\nA = ("+Ar+")+j("+Ai+")\nB = ("+Br+")+j("+Bi+")\nC = ("+Cr+")+j("+Ci+")\nD = ("+Dr+")+j("+Di+")");
                    output.setTextColor(Color.BLACK);
                }

                if(spins.getSelectedItem().toString()=="ABCD Parameters")
                {
                    double z11r=((r11*r21)+(i11*i21))/((Math.pow(r21,2))+(Math.pow(i21,2)));
                    double z11i=((i11*r21)-(r11*i21))/((Math.pow(r21,2))+(Math.pow(i21,2)));

                    double nr=((r11*r22)-(i11*i22)-(r12*r21)+(i12*i21));
                    double ni=((r11*i22)+(i11*r22)-(r12*i21)-(i12*r21));

                    double z12r=((nr*r21)+(ni*i21))/((Math.pow(r21,2))+(Math.pow(i21,2)));
                    double z12i=((ni*r21)-(nr*i21))/((Math.pow(r21,2))+(Math.pow(i21,2)));
                    double z21r=(r21)/((Math.pow(r21,2))+(Math.pow(i21,2)));
                    double z21i=(-i21)/((Math.pow(r21,2))+(Math.pow(i21,2)));
                    double z22r=((r22*r21)+(i22*i21))/((Math.pow(r21,2))+(Math.pow(i21,2)));
                    double z22i=((i22*r21)-(r22*i21))/((Math.pow(r21,2))+(Math.pow(i21,2)));



                    double y11r=((r22*r12)+(i22*i12))/((Math.pow(r12,2))+(Math.pow(i12,2)));
                    double y11i=((i22*r12)-(r22*i12))/((Math.pow(r12,2))+(Math.pow(i12,2)));
                    double y12r=(((-nr)*r12)+((-ni)*i12))/((Math.pow(r12,2))+(Math.pow(i12,2)));
                    double y12i=(((-ni)*r12)-((-nr)*i12))/((Math.pow(r12,2))+(Math.pow(i12,2)));
                    double y21r=(-r12)/((Math.pow(r12,2))+(Math.pow(i12,2)));
                    double y21i=(i12)/((Math.pow(r12,2))+(Math.pow(i12,2)));
                    double y22r=((r11*r12)+(i11*i12))/((Math.pow(r12,2))+(Math.pow(i12,2)));
                    double y22i=((i11*r12)-(r11*i12))/((Math.pow(r12,2))+(Math.pow(i12,2)));


                    double h11r=((r12*r22)+(i12*i22))/((Math.pow(r22,2))+(Math.pow(i22,2)));
                    double h11i=((i12*r22)-(r12*i22))/((Math.pow(r22,2))+(Math.pow(i22,2)));
                    double h12r=(((nr)*r22)+((ni)*i22))/((Math.pow(r22,2))+(Math.pow(i22,2)));
                    double h12i=(((ni)*r22)-((nr)*i22))/((Math.pow(r22,2))+(Math.pow(i22,2)));
                    double h21r=(-r22)/((Math.pow(r22,2))+(Math.pow(i22,2)));
                    double h21i=(i22)/((Math.pow(r22,2))+(Math.pow(i22,2)));
                    double h22r=((r21*r22)+(i21*i22))/((Math.pow(r22,2))+(Math.pow(i22,2)));
                    double h22i=((i21*r22)-(r21*i22))/((Math.pow(r22,2))+(Math.pow(i22,2)));



                    String ss1 = String.format("%.4f",z11r);
                    z11r = Double.valueOf(ss1);
                    String ss2 = String.format("%.4f",z11i);
                    z11i = Double.valueOf(ss2);
                    String ss3 = String.format("%.4f",z12r);
                    z12r = Double.valueOf(ss3);
                    String ss4 = String.format("%.4f",z12i);
                    z12i = Double.valueOf(ss4);
                    String s1 = String.format("%.4f",z21r);
                    z21r = Double.valueOf(s1);
                    String s2 = String.format("%.4f",z21i);
                    z21i = Double.valueOf(s2);
                    String s3 = String.format("%.4f",z22r);
                    z22r = Double.valueOf(s3);
                    String s4 = String.format("%.4f",z22i);
                    z22i = Double.valueOf(s4);
                    String sss1 = String.format("%.4f",y11r);
                    y11r = Double.valueOf(sss1);
                    String sss2 = String.format("%.4f",y11i);
                    y11i = Double.valueOf(sss2);
                    String sss3 = String.format("%.4f",y12r);
                    y12r = Double.valueOf(sss3);
                    String sss4 = String.format("%.4f",y12i);
                    y12i = Double.valueOf(sss4);
                    String sk1 = String.format("%.4f",y21r);
                    y21r = Double.valueOf(sk1);
                    String sk2 = String.format("%.4f",y21i);
                    y21i = Double.valueOf(sk2);
                    String sk3 = String.format("%.4f",y22r);
                    y22r = Double.valueOf(sk3);
                    String sk4 = String.format("%.4f",y22i);
                    y22i = Double.valueOf(sk4);
                    String s11 = String.format("%.4f",h11r);
                    h11r = Double.valueOf(s11);
                    String s22 = String.format("%.4f",h11i);
                    h11i = Double.valueOf(s22);
                    String s33 = String.format("%.4f",h12r);
                    h12r = Double.valueOf(s33);
                    String s44 = String.format("%.4f",h12i);
                    h12i = Double.valueOf(s44);
                    String s5 = String.format("%.4f",h21r);
                    h21r = Double.valueOf(s5);
                    String s6 = String.format("%.4f",h21i);
                    h21i= Double.valueOf(s6);
                    String s7 = String.format("%.4f",h22r);
                    h22r = Double.valueOf(s7);
                    String s8 = String.format("%.4f",h22i);
                    h22i = Double.valueOf(s8);

                    output.setText("z11 = ("+z11r+")+j("+z11i+")\nz12 = ("+z12r+")+j("+z12i+")\nz21 = ("+z21r+")+j("+z21i+")\nz22 = ("+z22r+")+j("+z22i
                            +")\n\ny11 = ("+y11r+")+j("+y11i+")\ny12 = ("+y12r+")+j("+y12i+")\ny21 = ("+y21r+")+j("+y21i+")\ny22 = ("+y22r+")+j("+y22i
                            +")\n\nh11 = ("+h11r+")+j("+h11i+")\nh12 = ("+h12r+")+j("+h12i+")\nh21 = ("+h21r+")+j("+h21i+")\nh22 = ("+h22r+")+j("+h22i+")");
                    output.setTextColor(Color.BLACK);
                }

            }
        });




    }
}