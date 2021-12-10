/*
Faça um programa  que receba o valor do sálario mínimo e o valor do salário de um funcionário, calcule
e mostre a quantidade de sálario mínimos que ganha esse funcionário
 */
package me.pietro.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double diagonalMaior, diagonalMenor;

        System.out.println("Declare a diagonal maior: ");
        diagonalMaior = input.nextDouble();
        System.out.println("Declare a diagonal menor: ");
        diagonalMenor = input.nextDouble();

        System.out.println("A área do losangulo é igual a: "+(diagonalMaior*diagonalMenor)/2);
    }
}
