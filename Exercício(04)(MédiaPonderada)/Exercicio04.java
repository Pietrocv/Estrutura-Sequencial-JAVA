/*
Faça um programa que receba duas notas, calcule e mostre a média ponderada dessas notas, considerando peso 2 para
a primeira e peso 3 para a segunda.
 */
package me.pietro.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        double n1, n2, mediaPonderada;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        n1 = input.nextDouble();
        System.out.println("Digite a segunda nota:");
        n2 = input.nextDouble();

        mediaPonderada = (n1*2+n2*3)/5;

        System.out.println("A média ponderada é igual a: " +mediaPonderada);
    }
}
