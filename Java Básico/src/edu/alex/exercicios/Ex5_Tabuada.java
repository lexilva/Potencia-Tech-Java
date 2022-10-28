package edu.alex.exercicios;

import java.util.Scanner;

/*
 * Desenvolva um gerador de tabuada,
 * capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10
 * O usuário deve informar de qual número ele deseja ver a tabuada.
 * A sída deve ser conforme o exemplo abaixo:
 */
public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Tabuada: ");
        int tabuada = scan.nextInt();

        for(int i = 1;i<=10;i++){
            System.out.println( tabuada+" x " +i +"   =  " +i*tabuada);
        }
    }
}
