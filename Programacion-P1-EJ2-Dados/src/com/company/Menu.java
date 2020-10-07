package com.company;

import java.util.Scanner;

public class Menu {

    public void Menujuego() {
        Scanner scanner = new Scanner(System.in);
        JocDaus jocdaus = new JocDaus();
        int option;

        do {
            System.out.println("1. Dados");
            System.out.println("2. Parchis");
            System.out.println("3. Salir");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    jocdaus.jugar();
                    break;
                case 2:
                    System.out.println("As elegido Parhis!!!");
                    System.out.println("Jugando al parchis....");
                    System.out.println("Parchis finalizado....");
                    break;
                case 3:
                    //exit();
                    break;
                default:
                    System.out.println("ATENCIÓ!!!! ha de ser 1,2 o 3");
            }
        }while(option != 3);
    }
}
