/*
Faça um programa que receba o peso de uma pessoa, calcule e mostre:
a) O peso de uma pessoa que engorde 15% sobre o peso digitado:
b) O novo peso caso ela queira emagrecer 20% sobre o peso digitado:
 */
package me.pietro.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double peso;
        int opcao;

        System.out.println("Informe o seu peso: ");
        peso = input.nextDouble();

        System.out.println("Declare a operação solicitada: \n");
        System.out.println("[1] Emagrecer 20%\n");
        System.out.println("[2] Engordar 15%\n");
        opcao = input.nextInt();

        switch (opcao){
            case 1:
                peso -= peso*0.20;
                System.out.println("Seu novo peso após o emagrecimento é igual a: "+peso);
                break;
            case 2:
                peso += peso*0.15;
                System.out.println("Seu novo peso após engordar é igual a: "+peso);
                break;

        }
    }
}
