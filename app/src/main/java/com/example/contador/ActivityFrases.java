package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityFrases extends AppCompatActivity {

    public static String frase1 = "Frase motivadora 1";
    public static String frase2 = "Frase motivadora 2";
    public static String frase3 = "Frase motivadora 3";
    public static String frase4 = "Frase motivadora 4";
    public static String frase5 = "Frase motivadora 5";

    int numero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_frases );

        Button btnFrase = findViewById ( R.id.btnFraseAleatoria);
        Button btnFrasesDos = findViewById ( R.id.button4);
        TextView frase = findViewById ( R.id.tvFrase );

        btnFrase.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {

                numero = (int) (Math.random() * 5) + 1;

                switch(numero){
                    case 1:
                        frase.setText ( frase1 );
                        getWindow().getDecorView().setBackgroundColor( Color.WHITE);
                        return;
                    case 2:
                        frase.setText ( frase2 );
                        getWindow().getDecorView().setBackgroundColor(Color.RED);
                        return;
                    case 3:
                        frase.setText ( frase3 );
                        getWindow().getDecorView().setBackgroundColor(Color.BLUE);
                        return;
                    case 4:
                        frase.setText ( frase4 );
                        getWindow().getDecorView().setBackgroundColor(Color.CYAN);
                        return;
                    case 5:
                        frase.setText ( frase5 );
                        getWindow().getDecorView().setBackgroundColor(Color.MAGENTA);
                        return;
                    default:
                        return;
                }

            }
        } );

        btnFrasesDos.setOnClickListener ( v -> {
            Intent intent = new Intent ( this, FrasesDosActivity.class );
            startActivity(intent);
        } );

    }
}