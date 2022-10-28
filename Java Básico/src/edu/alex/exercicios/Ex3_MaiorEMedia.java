package edu.alex.exercicios;

import java.util.Scanner;
/*
 * Faça um programa que leia 5 números
 * e informe o maior número
 * e a média desses números
 */
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int maior = 0;
        int menor = 1000;
        int soma = 0;
        int count = 0;
        do{  
            System.out.print("Número: ");
            numero = scan.nextInt();
            soma += numero;
            if(numero > maior) maior = numero;
            if(numero < menor) menor = numero;
            count++;
        }while(count < 5);
        System.out.println("Maior: "+ maior);
        System.out.println("Média: "+soma/count);
    }
}
