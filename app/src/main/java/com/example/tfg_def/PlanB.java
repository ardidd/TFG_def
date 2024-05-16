
package com.example.tfg_def;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PlanB extends AppCompatActivity {
    ImageButton volver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_b);
        inicializarVariables();

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlanB.this,
                        PlanesEntrenamiento.class);
                startActivity(intent);
            }
        });
    }
    private void inicializarVariables() {
        volver = findViewById(R.id.btnVolverB);
    }
}