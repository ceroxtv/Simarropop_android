package com.example.simarropop.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.simarropop.R;

public class LoginActivity extends AppCompatActivity implements  View.OnClickListener {
    private TextView txtNuevo;
    private Button btnEntrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtNuevo = findViewById(R.id.txtNuevoUsuario);
        btnEntrar = findViewById(R.id.btn_entrar);

        txtNuevo.setOnClickListener(this);
        btnEntrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_entrar:
                Intent a = new Intent(LoginActivity.this,AnimationActivity.class);
                startActivity(a);
                break;

            case R.id.txtNuevoUsuario:
                Intent i = new Intent(LoginActivity.this,SignActivity.class);
                startActivity(i);
                break;
        }
    }
}