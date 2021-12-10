/*
Faça um programa que calcule e mostre a tabuada de um número digitado pelo usuário.
 */
package me.pietro.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i=0, n;

        System.out.println("Declare o número que deseja saber a tabuada:");
        n = input.nextInt();
        while(i < 11){
            System.out.println(+ n + " x " + i + " = " + n*i);
            i++;
        }
    }
}
