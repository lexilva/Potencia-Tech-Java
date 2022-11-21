package edu.alex.desafios.checagemdepalindromo;// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;

public class Desafio1 {

  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        String resultado = ePalindromo( palavra ) ? "TRUE" : "FALSE";
        System.out.println(resultado);

    }

    public static boolean ePalindromo(String palavra) {
        String aux = "";
        aux = new StringBuffer(palavra).reverse().toString();
        if (palavra.equals(aux)) return true;

        return false;
    }


}