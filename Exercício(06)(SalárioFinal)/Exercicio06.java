/*
Um funcionário recebe um salário fixo e 4% de comissão sobre as vendas. Faça um programa que receba
o salário fixo de um funcionário e o valor de suas vendas, calcule e mostre a comissão e o salário
final do funcionário.
 */
package me.pietro.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            double salario;
            int vendas;

            System.out.println("Declare o salário fixo: ");
            salario = input.nextDouble();
            System.out.println("Declare o valor em vendas do mês: ");
            vendas = input.nextInt();
            salario += vendas*0.04;
            System.out.println("O sálario mais a comissão de ("+vendas*0.04+") é igual a: "+salario);

    }
}
