package edu.alex.desafios.validacaoparenteses;

import java.util.Scanner;

public class ValidaParenteses {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }
    public static boolean ehValido(String s) {
        //TODO: implemente a lógica de caracteres válidos e retorne se a string é valida ou não.
        String[] resultadoValido  = new String[]{"()", "[]"};
        for (String palavra:resultadoValido){
           if (palavra.equals( s )) return true;
        }
        return false;
    }
}

