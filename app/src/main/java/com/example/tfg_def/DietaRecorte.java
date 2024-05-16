package com.example.tfg_def;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class DietaRecorte extends AppCompatActivity {

    Button masInformacionAlta, masInformacionBaja;
    ImageButton volver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dieta_recorte);
        inicializarVariables();
        masInformacionAlta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DietaRecorte.this,
                        AltaEnCalorias.class);
                startActivity(intent);
            }
        });
        masInformacionBaja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DietaRecorte.this,
                        BajaEnCalorias.class);
                startActivity(intent);
            }
        });
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DietaRecorte.this,
                        Home.class);
                startActivity(intent);
            }
        });
    }


    private void inicializarVariables() {
        masInformacionAlta = findViewById(R.id.btnMasInformacionAlta);
        masInformacionBaja = findViewById(R.id.btnMasInformacionBaja);
        volver = findViewById(R.id.btnVolverDieta);
    }
}