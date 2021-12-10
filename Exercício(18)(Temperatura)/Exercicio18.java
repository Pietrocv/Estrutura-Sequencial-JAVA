/*
Faça um programa que receba uma temperatura em Celsius, calcule
e mostre essa temperatura em Fahrenheit.
F = 32 + (1.8*C)
 */
package me.pietro.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double C;

        System.out.println("Digite a temperatura em Celsius: ");
        C = input.nextDouble();

        System.out.println("A temperatura em Fahrenheit: "+(32 + (1.8*C)));
    }
}

