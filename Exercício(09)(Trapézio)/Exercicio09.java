/*
Faça um programa que calcule e mostre a área do trapézio.
 */
package me.pietro.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double baseMaior, baseMenor, altura;

        System.out.println("Declare a base maior: ");
        baseMaior = input.nextDouble();
        System.out.println("Declare a base menor: ");
        baseMenor = input.nextDouble();
        System.out.println("Declare a altura: ");
        altura = input.nextDouble();

        System.out.println("A área do trapézio é igual a: "+((baseMaior + baseMenor)*altura)/2);
    }
}
