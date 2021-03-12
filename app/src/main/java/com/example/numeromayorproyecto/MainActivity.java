package com.example.numeromayorproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText valor1, valor2;
    TextView proceso;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor1=findViewById(R.id.valro1);
        valor2=findViewById(R.id.valor2);
        proceso=findViewById(R.id.proceso);
    }
    public void lego(View view){
        int val1=Integer.parseInt(valor1.getText().toString());
        int val2= Integer.parseInt(valor2.getText().toString());
        if(val1<val2) {
            proceso.setText(val2+">"+val1);
        }
        if(val2<val1){
            proceso.setText(val1+">"+val2);
        }
        if(val1==val2 && val2==val1){
            proceso.setText("Los numeros son iguales");
        }

    }
}