package com.company;

import java.util.Random;

public class Daus {
    private int valor;

    public  void tirar() {
        Random random = new Random();
        valor = random.nextInt(6+1) ;;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}

