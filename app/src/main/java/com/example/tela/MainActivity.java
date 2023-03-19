package com.example.tela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener( v->{
            EditText altura = (EditText) findViewById(R.id.altura);
            String altura1 = altura.getText().toString();
            EditText peso = (EditText) findViewById(R.id.peso);
            String peso1 = peso.getText().toString();
            double imc = Double.parseDouble(peso1) / (Double.parseDouble(altura1)*Double.parseDouble(altura1));
            String IMC = String.valueOf(imc);

            Intent intent = new Intent(this, Tela2.class);
            intent.putExtra("info", IMC);
            startActivity(intent);

        });
    }
}