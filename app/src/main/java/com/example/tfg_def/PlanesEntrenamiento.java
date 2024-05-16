package com.example.tfg_def;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PlanesEntrenamiento extends AppCompatActivity {
    Button planA, planB, planC, contratar;
    ImageButton volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planes_entrenamiento);
        inicializarVista();

        planA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlanesEntrenamiento.this,
                        PlanA.class);
                startActivity(intent);
            }
        });
        planB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlanesEntrenamiento.this,
                        PlanB.class);
                startActivity(intent);
            }
        });

        planC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlanesEntrenamiento.this,
                        PlanC.class);
                startActivity(intent);
            }
        });
       volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PlanesEntrenamiento.this,
                        Home.class);
                startActivity(intent);
            }
        });

    }

    private void inicializarVista() {
        planA = findViewById(R.id.btnPlanA);
        planB = findViewById(R.id.btnPlanB);
        planC = findViewById(R.id.btnPlanC);
        contratar = findViewById(R.id.btnContratarEntrendor);
        volver = findViewById(R.id.btnVolverEntrenamiento);
    }
}