/*
Faça um programa que calcule e mostre a área de um quadrado. A = lado * lado.
 */
package me.pietro.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double lado, formula;

        System.out.println("Declare o lado do quadrado: ");
        lado = input.nextDouble();

        System.out.println("A área do quadradado é igual a: "+Math.pow(lado, 2));
    }
}
