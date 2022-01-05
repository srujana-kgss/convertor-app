package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class  MainActivity2 extends AppCompatActivity {
    EditText r1,r2,r3;
    Button calculate;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        r1=findViewById(R.id.R1value);
        r2=findViewById(R.id.R2VALUE);
        r3=findViewById(R.id.R3VALUE);
        calculate=findViewById(R.id.calculate);
        output=findViewById(R.id.outputtext);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Res1=r1.getText().toString();
                String Res2=r2.getText().toString();
                String Res3=r3.getText().toString();
                if (Res1.trim().equals(""))
                {
                    output.setText("ENTER R1 VALUE 🤨");
                    output.setTextColor(Color.RED);
                    return;
                }
                if (Res2.trim().equals(""))
                {
                    output.setText("ENTER R2 VALUE 🤨");
                    output.setTextColor(Color.RED);
                    return;
                }
                if (Res3.trim().equals(""))
                {
                    output.setText("ENTER R3 VALUE 🤨");
                    output.setTextColor(Color.RED);
                    return;
                }

                double R1=Double.parseDouble(Res1);
                double R2=Double.parseDouble(Res2);
                double R3=Double.parseDouble(Res3);
                double Ra= (((R1*R2)+(R2*R3)+(R3*R1))/R2);
                double Rb=(((R1*R2)+(R2*R3)+(R3*R1))/R3);
                double Rc=(((R1*R2)+(R2*R3)+(R3*R1))/R1);
                output.setText("Ra = "+Ra+"\nRb = "+Rb+"\nRc = "+Rc);
                output.setTextColor(Color.BLACK);




            }
        });

    }
}