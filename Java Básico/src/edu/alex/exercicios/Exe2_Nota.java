package edu.alex.exercicios;
/*
    Faça um programa que peça uma nota, entre zero e Dez.
    Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
  */

import java.util.Scanner;

public class Exe2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;
        System.out.println("Nota: ");
        nota = scan.nextInt();
        while(nota < 0 || nota > 10){
            System.out.println("Nota Inválida! Digite Novamente: ");
            nota = scan.nextInt();
        }
        System.out.println("nota digitada: "+nota);
    }
}
