/*
Faça um programa que receba o número de horas trabalhadas, o valor do salário mínimo e o
número de horas extras trabalhadas. Calcule e mostre o salário a receber seguindo as regras a seguir:

--A hora trabalhada vale ⅛ do salário mínimo; salario/8
--A hora extra vale ¼ do salário mínimo;  salario/4
--O salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada;
--A quantia a receber pelas horas extras equivale ao número de horas extras trabalhadas
  multiplicado pelo valor da hora extra;
--O salário a receber equivale ao salário bruto mais a quantia a receber pelas horas extras

 */
package me.pietro.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double hrT, hrE, salMin;

        System.out.println("Digite a quantidade de horas trabalhadas:");
        hrT = input.nextDouble();
        System.out.println("Digite o valor do salário mínimo:");
        salMin = input.nextDouble();
        System.out.println("Digite o número de horas extras trabalhadas:");
        hrE = input.nextDouble();
        System.out.println("O salário do funcionário: "+(((salMin/8)*hrT) + ((salMin/4)*hrE)));
    }
}
