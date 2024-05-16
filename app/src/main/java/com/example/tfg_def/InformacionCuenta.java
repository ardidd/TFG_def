package com.example.tfg_def;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class InformacionCuenta extends AppCompatActivity {
  EditText nombre,apellidos,numero;
  ImageButton volver;
  Button guardar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion_cuenta);

        inicializarVariables();

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InformacionCuenta.this,
                        Perfil.class);
                startActivity(intent);
            }
        });
        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombreDef = nombre.getText().toString();
                String apellidosDef = apellidos.getText().toString();
                String telefonoDef = numero.getText().toString();

                if(!nombreDef.isEmpty() && !apellidosDef.isEmpty() && !telefonoDef.isEmpty()){

            }else {
                    Toast.makeText(InformacionCuenta.this, "Faltan campos por rellenar", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void inicializarVariables() {
        nombre = findViewById(R.id.txtNombreCuenta);
        apellidos = findViewById(R.id.txtApellidosCuenta);
        numero = findViewById(R.id.txtNumeroCuenta);
        volver = findViewById(R.id.btnVolverInfo);
        guardar = findViewById(R.id.btnGuardarCuenta);
    }
}