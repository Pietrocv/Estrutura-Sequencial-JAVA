/*
Faça um programa que receba dois números, calcule e mostre a divisão do primeiro número pelo segundo. Sabe-se
que o segundo número não pode ser zero, portanto não é necessário se preocupar com validações.
 */
package me.pietro.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        double n1, n2, div;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        n1 = input.nextDouble();
        System.out.println("Digite o segundo valor:");
        n2 = input.nextDouble();

        if(n2==0){
            System.out.println("É impossível dividir por zero, informe um novo valor para N2:");
            n2 = input.nextDouble();
            System.out.println("O valor da divisão é igual a: " +n1/n2);
        }else {
            System.out.println("O valor da divisão é igual a: " + n1 / n2);
        }
    }
}
