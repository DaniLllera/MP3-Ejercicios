package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = 0;
        int dado1 = 0;
        int dado2 = 0;

        int contador2=0;
        int contador3=0;
        int contador4=0;
        int contador5=0;
        int contador6=0;
        int contador7=0;
        int contador8=0;
        int contador9=0;
        int contador10=0;
        int contador11=0;
        int contador12=0;

        System.out.println("Quantes vegades vols llançar els dau?");

        n=scanner.nextInt();
        for (int i = 0; i < n; i++) {
            dado1= random.nextInt(6+1) ;
            dado2 = random.nextInt(6+1) ;

            if (dado1 + dado2 == 2) {
                contador2++;
            }
            if (dado1 + dado2 == 3) {
                contador3++;
            }
            if (dado1 + dado2 == 4) {
                contador4++;
            }
            if (dado1 + dado2 == 5) {
                contador5++;
            }
            if (dado1 + dado2 == 6) {
                contador6++;
            }
            if (dado1 + dado2 == 7) {
                contador7++;
            }
            if (dado1 + dado2 == 8) {
                contador8++;
            }
            if (dado1 + dado2 == 9) {
                contador9++;
            }
            if (dado1 + dado2 == 10) {
                contador10++;
            }
            if (dado1 + dado2 == 11) {
                contador11++;
            }
            if (dado1 + dado2 == 12) {
                contador12++;
            }

        }
        System.out.println("Llançament.......");
        System.out.println("Resultat");
        System.out.println("2 -->" + " " + " " +contador2 + " vegades");
        System.out.println("3 -->" + " " + " " +contador3 + " vegades");
        System.out.println("4 -->" + " " + " " +contador4 + " vegades");
        System.out.println("5 -->" + " " + " " +contador5 + " vegades");
        System.out.println("6 -->" + " " + " " +contador6 + " vegades");
        System.out.println("7 -->" + " " + " " +contador7 + " vegades");
        System.out.println("8 -->" + " " + " " +contador8 + " vegades");
        System.out.println("9 -->" + " " + " " +contador9 + " vegades");
        System.out.println("10 -->" + " " +contador10 + " vegades");
        System.out.println("11 -->" + " " +contador11 + " vegades");
        System.out.println("12 -->" + " " +contador12 + " vegades");



    }
}
