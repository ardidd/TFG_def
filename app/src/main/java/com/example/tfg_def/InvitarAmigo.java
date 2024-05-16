package com.example.tfg_def;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class InvitarAmigo extends AppCompatActivity {
    Button enviar;
    String correo;
    EditText texto;
    ImageButton volver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invitar_amigo);
        inicializarVariables();
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                correo = String.valueOf(texto.getText());
                if(correo.isEmpty()){
                    Toast.makeText(InvitarAmigo.this, "Falta rellenar el campo correo", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(InvitarAmigo.this, "Se ha enviado una invitación a"+correo, Toast.LENGTH_SHORT).show();
                }

            }
        });
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InvitarAmigo.this,
                        Perfil.class);
                startActivity(intent);
            }
        });

    }

    private void inicializarVariables() {
        enviar = findViewById(R.id.btnEnviarInvitacion);
        texto = findViewById(R.id.txtCorreoAmigo);
        volver = findViewById(R.id.btnVolverInvitar);

    }
}