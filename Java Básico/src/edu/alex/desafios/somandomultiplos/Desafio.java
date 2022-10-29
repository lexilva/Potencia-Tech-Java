package edu.alex.desafios.somandomultiplos;

import java.util.Scanner;

public class Desafio {
        public static void main(String[] args) {
            int A, N;
            Scanner input = new Scanner(System.in);
            A = input.nextInt();
            N = input.nextInt();
            //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".
            double contador = N/A;
            int resultado = 0;
            for(int i = 1;i <=contador;i++){
                resultado += i *A;
            }
            System.out.println(resultado);
        }
}

