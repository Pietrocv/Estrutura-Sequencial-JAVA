/*
Faça um programa que receba o número de lados de um polígono convexo, calcule e mostre
o número de diagonais desse polígono, onde N é o número de lados do polígono.
Sabe-se que N.D=n(N-3)/2.
 */
package me.pietro.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lado;

        System.out.println("Digite o número de lados do polígono:");
        lado = input.nextInt();

        System.out.println("O número de diagonais é de: "+((lado*(lado-3))/2)/lado);
    }
}
