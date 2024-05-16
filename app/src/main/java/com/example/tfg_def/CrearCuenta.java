package com.example.tfg_def;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class CrearCuenta extends AppCompatActivity {

    EditText correoElectronico, contrasenya;
    Button registro;
    private FirebaseAuth auth;
    private FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);
        inicializarVariables();
        auth = FirebaseAuth.getInstance();
        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = correoElectronico.getText().toString();
                String password = contrasenya.getText().toString();
                if(!email.isEmpty() && !password.isEmpty()){
                    doRegister(email, password); }
                else{
                    Toast.makeText(CrearCuenta.this, "Faltan campos por rellenar", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
    private void doRegister(String email, String password) {

        auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(CrearCuenta.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            user = auth.getCurrentUser();
                            updateUI(user);
                        }
                    }
                })
                .addOnFailureListener(CrearCuenta.this, new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(CrearCuenta.this, "ERROR AL REGISTRAR", Toast.LENGTH_SHORT).show();
                    }
                });
    }
    private void updateUI(FirebaseUser user) {
        if(user != null){
            startActivity(new Intent(CrearCuenta.this, MainActivity.class));
            finish();
        }
    }

    private void inicializarVariables() {
        correoElectronico = findViewById(R.id.txtCorreoElectronicoCrear);
        contrasenya = findViewById(R.id.txtContrasenyaCrear);
        registro = findViewById(R.id.btnCrearCuenta);
    }
}