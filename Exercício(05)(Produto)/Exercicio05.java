/*
Faça um programa que receba o preço de um produto, calcule e mostre o novo preço
sabendo-se que este sofreu um desconto de 10%
 */
package me.pietro.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double produto;

        System.out.println("Declare o preço do produto: ");
        produto =  input.nextDouble();
        System.out.println("O preço do produto com o desconto de 10% é de: "+(produto - (produto*0.10)));
    }
}
