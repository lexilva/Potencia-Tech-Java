package edu.alex.exercicios;

import java.util.Scanner;

/*
 * Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de numeros pares
 * e a quantidade de númeors ímpares
 */
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantidadeNumeros;
        int quantidadePares = 0, quantidadeImpares = 0;
        System.out.print("Quantidade de números: ");
        quantidadeNumeros = scan.nextInt();
        int count = 0;
        int numero;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            if(numero % 2 == 0)quantidadePares++;
            else quantidadeImpares++;
            count++;
        }while(count < quantidadeNumeros);
        System.out.println("Quantidade Par: "+ quantidadePares);
        System.out.println("Quantidade Impar: "+ quantidadeImpares);
    }
}
