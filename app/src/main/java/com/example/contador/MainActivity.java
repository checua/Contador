package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int conta = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        Button btnContador = findViewById ( R.id.button);
        TextView contador = findViewById ( R.id.textView );

        Button btnFrases = findViewById ( R.id.btnFrases);

        btnContador.setOnClickListener ( v -> {

            conta++;

            contador.setText (conta + "");
        } );

        btnFrases.setOnClickListener ( v -> {
            Intent intent = new Intent ( this, ActivityFrases.class );
            startActivity(intent);
        } );


    }





}