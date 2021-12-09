/*
Faça um programa que receba dois números, calcule e mostre a subtração desses números.
 */
package me.pietro.estrutura_sequencial;

import java.util.Scanner;

public class Exec01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n1, n2;
        System.out.println("Digite o primeiro número:");
        n1 = input.nextDouble();
        System.out.println("Digite o segundo número:");
        n2 = input.nextDouble();

        System.out.println("O resultado da subtração é de: "+(n2-n1));
    }
}
