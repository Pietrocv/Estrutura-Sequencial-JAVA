/*
Faça um programa que receba o valor dos catetos de um triângulo, calcule e mostre o valor da hipotenusa.
 */
package me.pietro.estrutura_sequencial;

import java.lang.Math;
import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double cateto1, cateto2;

        System.out.println("Digite o valor do primeiro cateto: ");
        cateto1 = input.nextInt();
        System.out.println("Digite o valor do segundo cateto: ");
        cateto2 = input.nextInt();

        System.out.println("O valor da hipotenusa é igual a: "+(Math.sqrt((cateto1*cateto1)+(cateto2*cateto2))));
    }
}
