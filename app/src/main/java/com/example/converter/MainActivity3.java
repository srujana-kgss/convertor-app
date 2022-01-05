package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    EditText ra,rb,rc;
    Button calculate;
    TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ra=findViewById(R.id.Ravalue);
        rb=findViewById(R.id.Rbvalue);
        rc=findViewById(R.id.Rcvalue);
        calculate=findViewById(R.id.calculatefordeltatostar);
        output=findViewById(R.id.outputfordeltatostar);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Resa=ra.getText().toString();
                String Resb=rb.getText().toString();
                String Resc=rc.getText().toString();
                if (Resa.trim().equals(""))
                {
                    output.setText("ENTER Ra VALUE 🤨");
                    output.setTextColor(Color.RED);
                    return;
                }
                if (Resb.trim().equals(""))
                {
                    output.setText("ENTER Rb VALUE 🤨");
                    output.setTextColor(Color.RED);
                    return;
                }
                if (Resc.trim().equals(""))
                {
                    output.setText("ENTER Rc VALUE 🤨");
                    output.setTextColor(Color.RED);
                    return;
                }

                double Ra=Double.parseDouble(Resa);
                double Rb=Double.parseDouble(Resb);
                double Rc=Double.parseDouble(Resc);
                double R1= (Ra*Rb)/(Ra+Rb+Rc);
                double R2=(Rc*Rb)/(Ra+Rb+Rc);
                double R3=(Ra*Rc)/(Ra+Rb+Rc);
                output.setText("R1 = "+R1+"\nR2 = "+R2+"\nR3 = "+R3);
                output.setTextColor(Color.BLACK);
            }
        });
    }
}