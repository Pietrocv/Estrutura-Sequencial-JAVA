/*
25 - Faça um programa que receba uma hora (uma variável para hora
e outra para minutos), calcule e mostre:
a)A hora digitada convertida em minutos;
b)O total dos minutos, ou seja, os minutos digitados mais a conversão anterior;
c)O total dos minutos convertidos em segundos.
 */
package me.pietro.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double horas, minutos;

        System.out.println("Digite as horas: ");
        horas = input.nextDouble();
        System.out.println("Digite os minutos: ");
        minutos = input.nextDouble();

        System.out.println("Tudo convertido em minutos fica: "+((horas*60)+minutos));
        System.out.println("Tudo convertido em segundos fica: "+((horas*60)+minutos)*60);
    }
}
