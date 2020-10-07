package com.company;

import java.util.Scanner;

public class JocDaus {

    Daus dau1 = new Daus();
    Daus dau2 = new Daus();
    Daus dau3 = new Daus();
    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        int contadorPartidas = 0;
        int contadorDerotas = 0;
        int contadorVictorias = 0;

        int op = 0;
        do {
            System.out.println("Tria");
            System.out.println("1.Tirar" + " " + "2.Salir");
            op = scanner.nextInt();
            switch (op) {

                case 1:
                    contadorPartidas++;
                    dau1.tirar();
                    dau2.tirar();
                    dau3.tirar();

                    System.out.println("Daus:" + " " + dau1.getValor() );
                    System.out.println("Daus:" + " " + dau2.getValor() );
                    System.out.println("Daus:" + " " + dau3.getValor() );
                    if(dau1.getValor() == dau2.getValor() && dau1.getValor() == dau3.getValor()){
                        contadorVictorias++;
                    }else{
                        contadorDerotas++;
                    }
                    break;
                case 2:
                    System.out.println("-------------------------------------------");
                    System.out.println("Partidas Jugadas: " + contadorPartidas);
                    System.out.println("Partidas Perdidas:" + contadorDerotas);
                    System.out.println("Partidas Ganadas:" + contadorVictorias);
                    System.out.println("-------------------------------------------");
                    break;
                default:
                    System.out.println("ATENCIÓ!!!! ha de ser 1 o 2 ");
            }
        }while (op != 2) ;
    }
}

