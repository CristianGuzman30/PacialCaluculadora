package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Calculadora calculadora= new Calculadora();
    EditText et1, et2;
    TextView tv1, tv2, tvR;
    Button btnPotencia, btnFibonacci, btnMultiplicar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = this.<EditText>findViewById(R.id.ingresarUno);
        et2 = this.<EditText>findViewById(R.id.ingresarDos);
        tv1 = this.<TextView>findViewById(R.id.numeroUno);
        tv2 = this.<TextView>findViewById(R.id.numeroDos);
        tvR = this.<TextView>findViewById(R.id.resultado);


        btnPotencia = findViewById(R.id.botonPotencia);
        btnPotencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculadora.Potencia();



            }
        });

        btnFibonacci = findViewById(R.id.botonFactorial);
        btnPotencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               calculadora.Fibonacci(n1);


            }
        });

        btnMultiplicar = findViewById(R.id.botonMultiplicar);
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculadora.Multiplicar();


            }
        });
    }
}


class Calculadora extends MainActivity{

    void Potencia(){
        float n1, n2, res;
        n1 = Float.parseFloat(tv1.getText().toString());
        n2 = Float.parseFloat(tv2.getText().toString());
        res = n1 + n2;
        if(n1==1)
            tvR.setText("1");

        else if(n1 == 0)
            tvR.setText("1");

        else if(n2 == 0)
            tvR.setText("0");

        else if(n2 == 1)
            tvR.setText("1");

        else if(n1<0)
            res= Potencia(n1, n2 + 1) /n1;

        else
        {
            res = n1 * Potencia(n1, n2 - 1);
            tvR.setText("El resultado es: " + res);

        }



    }

    int Fibonacci (float n1)
            float res;
            n1 = Float.parseFloat(tv1.getText());
    {
        if ((n1 == 0) || (n1 == 1))
            tvR.setText("El resultado es: 1");
        else
            res= Fibonacci(n-1) + Fibonacci(n-2);
        tvR.setText("El resultado es: " +res);
    }


    void Multiplicar(){

        float n1, n2, resm;
        n1 = Float.parseFloat(tv1.getText().toString());
        n2 = Float.parseFloat(tv2.getText().toString());
        resm = n1 * n2;
        tvR.setText("El resultado es: " + resm);

    }
}

