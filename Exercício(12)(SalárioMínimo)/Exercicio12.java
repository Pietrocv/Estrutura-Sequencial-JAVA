/*
Faça um programa  que receba o valor do salário mínimo e o valor do salário
de um funcionário, calcule e mostre a quantidade de salário mínimos que ganha esse funcionário.
 */
package me.pietro.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salarioMinimo, salarioFuncionario;

        System.out.println("Declare o valor do Sálario Mínimo: ");
        salarioMinimo = input.nextDouble();
        System.out.println("Declare o valor do Sálario do Funcionário: ");
        salarioFuncionario = input.nextDouble();

        System.out.println("O funcionário recebe "+salarioFuncionario/salarioMinimo+" salários mínimos");
    }
}
