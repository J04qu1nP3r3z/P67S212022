package com.example.p67s212022;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SumaActivity extends AppCompatActivity {

    EditText txtNum1, txtNum2;
    Button btnCalcula, btnRegresa;
    TextView lblResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);
        txtNum1 = findViewById(R.id.txtNum1);
        txtNum2 = findViewById(R.id.txtNum2);
        lblResultado = findViewById(R.id.lblResultado);

        btnCalcula = findViewById(R.id.btnCalcular);
        btnRegresa=findViewById(R.id.btnRegresa);

        btnCalcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.valueOf(txtNum1.getText().toString());
                int num2 = Integer.valueOf(txtNum2.getText().toString());

                int Resultado  = num1+num2;
                lblResultado.setText(String.valueOf(Resultado));
            }
        });
        btnRegresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}