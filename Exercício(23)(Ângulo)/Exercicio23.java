/*
Faça um programa que receba a medida de dois ângulos de um triângulo, calcule e mostre
a medida do terceiro ângulo. Sabe-se que a soma dos ângulos de um triângulo é 180.
 */
package me.pietro.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angu1, angu2;

        System.out.println("Digite o valor do 1 ângulo:");
        angu1 = input.nextInt();
        System.out.println("Digite o valor do 2 ângulo:");
        angu2 = input.nextInt();

        System.out.println("O valor do 3 ângulo é de: "+(180-(angu1+angu2))+" Graus");
    }
}
