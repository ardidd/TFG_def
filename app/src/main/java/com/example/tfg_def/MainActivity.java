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


public class MainActivity extends AppCompatActivity {
    EditText correoElectronico, contrasenya;
    Button inicio, registro;
    private FirebaseAuth auth;
    private FirebaseUser user;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarVariables();
        auth = FirebaseAuth.getInstance();

        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        CrearCuenta.class);
                startActivity(intent);
            }
        });
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = correoElectronico.getText().toString();
                String password = contrasenya.getText().toString();
                if(!email.isEmpty() && !password.isEmpty()){
                    doLogin(email, password); } else {
                    Toast.makeText(MainActivity.this, "Faltan campos por rellenar", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void doLogin(String email, String password) {
        auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            user = auth.getCurrentUser();
                            updateUI(user);
                        }
                    }
                })
                .addOnFailureListener(MainActivity.this, new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(MainActivity.this, "ERROR AL INICIAR SESIÓN", Toast.LENGTH_SHORT).show();
                    }
                });
    }
    private void updateUI(FirebaseUser user) {
        if(user != null){
            startActivity(new Intent(MainActivity.this, Home.class));
            finish(); }
    }

    private void inicializarVariables() {
        correoElectronico = findViewById(R.id.txtCorreoElectronico);
        contrasenya = findViewById(R.id.txtContrasenya);
        inicio = findViewById(R.id.btnIniciarSesion);
        registro = findViewById(R.id.btnRegistrate);
    }
}