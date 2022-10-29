package edu.alex.desafios.numerosiguais;

import java.util.Scanner;

public class Desafio {        
        public static void main(String[] args) {
             Scanner scan = new Scanner(System.in);
            int A, B;
            A = scan.nextInt();
            B = scan.nextInt();
            if (A == B) {
                System.out.println("Sao iguais!");
            }else{
                System.out.println("Nao sao iguais!");
            }
        }
    }
