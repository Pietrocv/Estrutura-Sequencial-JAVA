/*
Faça um programa que receba a quantidade de dinheiro em reais que uma pessoa que viajar possui.
Essa pessoa vai passar por vários países e precisa converter seu dinheiro em dólares, marco alemão
e libra esterlina. Sabe-se que a cotação do dólar é de 1.80, do marco alemão é de 2,00 e da libra é de 1,57.
O programa deve fazer as conversões e mostrá-las.

 */
package me.pietro.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double real;
        int opcao;

        System.out.println("Informe a quantia em reais a serem convertidas: ");
        real = input.nextDouble();

        System.out.println("Declare a conversão desejada:: \n");
        System.out.println("[1] Libra\n");
        System.out.println("[2] Marco Alemão\n");
        System.out.println("[3] Dólar\n");
        opcao = input.nextInt();

        switch (opcao){
            case 1:
                System.out.println(real+" reais em libras é igual a: "+real*1.57);
                break;
            case 2:
                System.out.println(real+" reais em marco alemão é igual a: "+real*2);
                break;
            case 3:
                System.out.println(real+" reais em dólares é igual a: "+real*1.80);
                break;
        }
    }
}
