package com.example.tfg_def;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Actividades extends AppCompatActivity {

    ImageButton volver;
    Button apuntarse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_clases);
        inicializarVariables();

        apuntarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Actividades.this,
                        ApuntateActividades.class);
                startActivity(intent);
            }
        });

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Actividades.this,
                        Home.class);
                startActivity(intent);
            }
        });



        }

    private void inicializarVariables() {
        volver = findViewById(R.id.IMGBtnVolverClases);
        apuntarse = findViewById(R.id.btnApuntarClase);
    }
}
