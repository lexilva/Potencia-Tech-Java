package edu.alex.exercicios;

import java.util.Scanner;

/*
 * Faça um programa que calcule o fatorial de um número
 * inteiro fornecido pelo usuário.
 */
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Fatorial: ");
        int fatorial = scan.nextInt();
        int multiplicação = 1;
        for(int i = fatorial;i >= 1; i--){
            multiplicação *= i;
        }
        System.out.println(fatorial+"! : " + multiplicação);
    }
}
