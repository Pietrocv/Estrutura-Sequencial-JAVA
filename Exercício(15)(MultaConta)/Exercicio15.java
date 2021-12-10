/*
João recebeu seu sálario e precisa pagar duas contas que estão atrasadas.
Como as contas estão atrasadas,João terá de pagar multa de 2% sobre cada conta.
Faça um programa que calcule e mostre quanto restará do saálario do João
 */
package me.pietro.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario, conta1, conta2;

        System.out.println("Digite o valor de seu sálario: ");
        salario=input.nextDouble();
        System.out.println("Digite o valor da primeira conta: ");
        conta1=input.nextDouble();
        System.out.println("Digite o valor da segunda conta: ");
        conta2=input.nextDouble();

        System.out.println("O valor final do seu sálario após o desconto das contas é de: "+
                ((salario-(conta1*0.02 + conta1))-(conta2*0.02 + conta2)));

    }
}
