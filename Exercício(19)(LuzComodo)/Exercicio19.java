/*
Sabe-se que para iluminar de maneira correta os cômodos de uma casa, para
cada m2 deve-se usar 18 W de potência. Faça um programa que receba as duas
dimensões de um cômodo (em metros). Calcule e mostre a sua área (em m2) e a
potência de iluminação que deverá ser utilizada.
 */
package me.pietro.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double area1, area2;

        System.out.println("Digite a primeira medida do cômodo: ");
        area1= input.nextDouble();
        System.out.println("Digite a segunda medida do cômodo: ");
        area2= input.nextDouble();

        System.out.println("Será necessário "+((area1*area2)*18)+"W para iluminar o cômodo!");
    }
}