package com.example.tfg_def;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    Button planesSubscripcion, miPerfil, planesEntrenamiento, dietaRecorte, actividades, acceso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        inicializarVariables();

        planesSubscripcion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this,
                        PlanesSubscripcion.class);
                startActivity(intent);
            }
        });
        miPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this,
                        Perfil.class);
                startActivity(intent);
            }
        });
        planesEntrenamiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this,
                        PlanesEntrenamiento.class);
                startActivity(intent);
            }
        });
        dietaRecorte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this,
                        DietaRecorte.class);
                startActivity(intent);
            }
        });
        actividades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        acceso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    private void inicializarVariables() {
        planesSubscripcion = findViewById(R.id.btnPlanA);
        miPerfil = findViewById(R.id.btnPlanB);
        planesEntrenamiento = findViewById(R.id.btnPlanC);
        dietaRecorte = findViewById(R.id.btnDietaRecorte);
        actividades = findViewById(R.id.btnActividades);
        acceso = findViewById(R.id.btnAcceso);
    }
}