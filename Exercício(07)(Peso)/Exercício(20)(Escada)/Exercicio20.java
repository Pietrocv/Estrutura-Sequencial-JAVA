/*
Faça um programa que receba a medida do ângulo formado por uma escada apoiada
no chão e a distância que a escada está da parede.
Calcule e mostre a medida para que se chegue na ponta da escada.

 */
package me.pietro.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double distancia, altura, hip;
        int opcao;

        System.out.println("Digite a distância que a escada está da parede:");
        distancia = input.nextInt();

        System.out.println("Escolha o ângulo do triangulo: \n");
        System.out.println("[30] Graus\n");
        System.out.println("[45] Graus\n");
        System.out.println("[60] Graus\n");
        opcao = input.nextInt();

        switch (opcao){
            case 1:
                altura = Math.sqrt(3)/3 * distancia;
                hip = (Math.sqrt(Math.pow(distancia, 2))+(Math.pow(altura, 2)));
                System.out.println("A escada tem: "+hip+"m");
                break;
            case 2:
                altura = 1 * distancia;
                hip = (Math.sqrt(Math.pow(distancia, 2))+(Math.pow(altura, 2)));
                System.out.println("A escada tem: "+hip+"m");
                break;
            case 3:
                altura = Math.sqrt(3) * distancia;
                hip = (Math.sqrt(Math.pow(distancia, 2))+(Math.pow(altura, 2)));
                System.out.println("A escada tem: "+hip+"m");
                break;
        }
    }
}
