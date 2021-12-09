/*
Faça um programa que receba três números, calcule e mostre a multiplicação desses números.
 */
package me.pietro.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        double n1, n2, n3;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro valor");
        n1 = input.nextInt();
        System.out.println("Informe o segundo valor:");
        n2 = input.nextInt();
        System.out.println("Informe o terceiro valor:");
        n3 = input.nextInt();

        System.out.println("A multiplicação é igual a: "+(n1*n2*n3));
    }
}
