package com.example.calculadora2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Calculadora2 extends AppCompatActivity {

    float numero1=0.0f;
    float numero2=0.0f;
    String numeracion="";

    TextView pantalla;
    Button mas1, mas2, mas3, mas4, mas5, mas6, mas7, mas8, mas9, mas0, sumar, restar, dividir, multiplicar, retroceso, igual;
    Button C, coma;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mas1=findViewById(R.id.mas1);
        mas2=findViewById(R.id.mas2);
        mas3=findViewById(R.id.mas3);
        mas4=findViewById(R.id.mas4);
        mas5=findViewById(R.id.mas5);
        mas6=findViewById(R.id.mas6);
        mas7=findViewById(R.id.mas7);
        mas8=findViewById(R.id.mas8);
        mas9=findViewById(R.id.mas9);
        mas0=findViewById(R.id.mas0);
        sumar=findViewById(R.id.suma);
        restar=findViewById(R.id.resta);
        dividir=findViewById(R.id.dividir);
        multiplicar=findViewById(R.id.multiplicar);
        retroceso=findViewById(R.id.retroceso);
        igual=findViewById(R.id.igual);
        C=findViewById(R.id.C);
        coma=findViewById(R.id.coma);
        pantalla=findViewById(R.id.pantalla);


        mas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(pantalla.getText().toString());
                if(numero1==0) {
                    pantalla.setText("1");
                } else{
                    pantalla.setText(pantalla.getText()+"1");
                }
            }
        });
        mas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(pantalla.getText().toString());
                if(numero1==0) {
                    pantalla.setText("2");
                } else{
                    pantalla.setText(pantalla.getText()+"2");
                }
            }
        });
        mas3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(pantalla.getText().toString());
                if(numero1==0) {
                    pantalla.setText("3");
                } else{
                    pantalla.setText(pantalla.getText()+"3");
                }
            }
        });
        mas4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(pantalla.getText().toString());
                if(numero1==0) {
                    pantalla.setText("4");
                } else{
                    pantalla.setText(pantalla.getText()+"4");
                }
            }
        });
        mas5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(pantalla.getText().toString());
                if(numero1==0) {
                    pantalla.setText("5");
                } else{
                    pantalla.setText(pantalla.getText()+"5");
                }
            }
        });
        mas6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(pantalla.getText().toString());
                if(numero1==0) {
                    pantalla.setText("6");
                } else{
                    pantalla.setText(pantalla.getText()+"6");
                }
            }
        });
        mas7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(pantalla.getText().toString());
                if(numero1==0) {
                    pantalla.setText("7");
                } else{
                    pantalla.setText(pantalla.getText()+"7");
                }
            }
        });
        mas8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(pantalla.getText().toString());
                if(numero1==0) {
                    pantalla.setText("8");
                } else{
                    pantalla.setText(pantalla.getText()+"8");
                }
            }
        });
        mas9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(pantalla.getText().toString());
                if(numero1==0) {
                    pantalla.setText("9");
                } else{
                    pantalla.setText(pantalla.getText()+"9");
                }
            }
        });

        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pantalla.setText("0");
                numero1=0.0f;
                numero2=0.0f;
                numeracion="";
            }
        });

        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat((pantalla.getText().toString()));
                numeracion="/";
                pantalla.setText("0");

            }
        });
        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat((pantalla.getText().toString()));
                numeracion="+";
                pantalla.setText("0");

            }
        });
        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat((pantalla.getText().toString()));
                numeracion="-";
                pantalla.setText("0");

            }
        });

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero2=Float.parseFloat(pantalla.getText().toString());
                if(numeracion.equals("/")) {
                    if (numero2 == 0.0f) {
                        pantalla.setText(0);
                    } else {
                        float result = numero1 / numero2;
                        pantalla.setText(result + "");
                    }
                } else if(numeracion.equals("+")){
                    float result = numero1 + numero2;
                    pantalla.setText(result + "");
                }
                else if(numeracion.equals("-")){
                    float result = numero1 - numero2;
                    pantalla.setText(result + "");
                }
                else if(numeracion.equals("*")){
                    float result = numero1 * numero2;
                    pantalla.setText(result + "");
                }
            }

        });


    }






}
