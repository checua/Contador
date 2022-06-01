package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FrasesDosActivity extends AppCompatActivity {

    private frasesLibreria nuestrasFrases = new frasesLibreria ();
    private coloresLibreria randomcolor = new coloresLibreria ();

    private TextView fraseTextview;
    private Button verFraseButton;
    private ConstraintLayout miLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_frases_dos );

        fraseTextview = findViewById ( R.id.textView2 );
        verFraseButton =  findViewById ( R.id.button2 );
        miLayout = findViewById ( R.id.cLayout );

        verFraseButton.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                String frase = nuestrasFrases.obtenerFrases ();
                fraseTextview.setText ( frase );

                int color = randomcolor.obtenerColor ();
                miLayout.setBackgroundColor ( color );
                verFraseButton.setTextColor ( color );

            }
        } );

    }
}