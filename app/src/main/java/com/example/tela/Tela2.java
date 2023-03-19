package com.example.tela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        TextView destino = (TextView) findViewById(R.id.destino);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        Intent intent = getIntent();

        String infoRecebida = intent.getStringExtra("info");
        destino.setText(infoRecebida);

        double resultado = Double.parseDouble(infoRecebida);

        if(resultado < 17) {
            imageView2.setImageResource(R.drawable.mtabaixo);
        } else if(resultado < 18.50) {
            imageView2.setImageResource(R.drawable.abaixo);
        } else if(resultado < 25) {
            imageView2.setImageResource(R.drawable.normal);
        } else if(resultado < 30) {
            imageView2.setImageResource(R.drawable.acima);
        } else if(resultado < 35) {
            imageView2.setImageResource(R.drawable.obesidade1);
        } else if (resultado < 40){
            imageView2.setImageResource(R.drawable.obesidade2);
        } else{
            imageView2.setImageResource(R.drawable.obesidade3);
        }

        Button backButton = findViewById(R.id.Voltar);
        backButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                onBackPressed();
                finish();
            }
        });
    }
}