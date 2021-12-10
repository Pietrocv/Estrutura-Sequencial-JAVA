/*
Faça um programa que receba o ano de nascimento de uma pessoa e o ano atual e mostre:
a)A idade dessa pessoa em anos:
b)A idade dessa pessoa em meses:
c)A idade dessa pessoa em dias:
d)A idade dessa pessoa em semanas:
 */
package me.pietro.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int anoNascimento, anoAtual;

        System.out.println("Digite o ano de nascimento: ");
        anoNascimento = input.nextInt();
        System.out.println("Digite o ano atual: ");
        anoAtual = input.nextInt();

        System.out.println("A idade dessa em peesoa em anos: "+(anoAtual-anoNascimento));
        System.out.println("A idade dessa pessoa em meses: "+(anoAtual-anoNascimento)*12);
        System.out.println("A idade dessa pessoa em dias: "+(anoAtual-anoNascimento)*365);
        System.out.println("A idade dessa pessoa em semanas: "+((anoAtual-anoNascimento)*12)*4);

    }
}
