package com.example.tfg_def;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Perfil extends AppCompatActivity {

    Button invitar, informacion;
    ImageButton volver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
        inicializarVariables();
        invitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Perfil.this,
                        InvitarAmigo.class);
                startActivity(intent);
            }
        });
        informacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Perfil.this,
                        InformacionCuenta.class);
                startActivity(intent);
            }
        });
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Perfil.this,
                        Home.class);
                startActivity(intent);
            }
        });
    }

    private void inicializarVariables() {
        invitar = findViewById(R.id.btnInvitar);
        informacion = findViewById(R.id.btnInfo);
        volver = findViewById(R.id.btnVolverPerfil);


    }
}