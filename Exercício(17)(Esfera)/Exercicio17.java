/*
Faça um programa que receba o raio e calcule;
a)O comprimento de uma esfera C=2PIR
b)A área de uma esfera, sabe-se que A=PIRR
c)O volume de uma esfera, sabe-se que V =3/4piRRR.
 */
package me.pietro.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double raio;

        System.out.println("Digite o valor do Raio:");
        raio = input.nextDouble();

        System.out.println("O valor do comprimento é igual a: "+2*3.14*raio);
        System.out.println("O valor da área é igual a: "+3.14*Math.pow(raio,2));
        System.out.println("O valor do volume é igual a: "+(4*(3.14*(Math.pow(raio,3))))/3);
    }
}

