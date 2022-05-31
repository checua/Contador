package com.example.contador;

import java.util.Random;

public class frasesLibreria {
    String frases[] = {
            "Frase 1", "Frase 2", "Frase 3", "Frase 4"
    };

    public String obtenerFrases(){
        Random randomContador = new Random (  );
        int randomNumber = randomContador.nextInt (frases.length);
        return frases[randomNumber];
    }


}
