package com.example.contador;

import android.graphics.Color;

import java.util.Random;

public class coloresLibreria {
    String colores[] = {
            "#FFBB86FC", "#FF03DAC5", "#FF018786", "#FFFFEB3B"
    };

    public int obtenerColor(){
        Random randomContador = new Random (  );
        int randomNumber = randomContador.nextInt (colores.length);
        int color = Color.parseColor ( colores[randomNumber]);
        return color;
    }
}