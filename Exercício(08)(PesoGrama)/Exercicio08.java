/*
Faça um programa que receba o peso em quilos e mostre em gramas.
 */
package me.pietro.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double peso;

        System.out.println("Informe seu peso em (KG): ");
        peso = input.nextDouble();

        System.out.println("O peso em gramas é igual a: " + peso * 1000 + "(g)");
    }
}
