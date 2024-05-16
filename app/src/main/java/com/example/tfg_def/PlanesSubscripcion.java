
package com.example.tfg_def;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class PlanesSubscripcion extends AppCompatActivity {
    Button btnGeneral, btnPremium;
    ImageButton btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planes_subscripcion);
        inicializarVariables();
        btnGeneral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PlanesSubscripcion.this, "¡¡¡Se ha subscrito al plan estándar!!!", Toast.LENGTH_SHORT).show();
                
            }
        });
        btnPremium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PlanesSubscripcion.this, "¡¡¡Se ha subscrito al plan premium!!!", Toast.LENGTH_SHORT).show();
            }
        });
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PlanesSubscripcion.this,
                        Home.class);
                startActivity(intent);
            }
        });
    }

    private void inicializarVariables() {
        btnGeneral = findViewById(R.id.btnSubsGeneral);
        btnPremium = findViewById(R.id.btnSubsPremium);
        btnVolver =  findViewById(R.id.btnVolverPlanes);
    }
}