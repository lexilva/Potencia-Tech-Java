package edu.alex.tiposdeoperadores;

import java.sql.Date;

public class TiposDeOperadores {
    public static void main(String[] args) {
        
    double soma = 10.5 + 15.7;
    int subtração = 113 - 25;
    int multiplicação = 20 * 7;
    int divisão = 15/3;
    int modulo = 18 % 3;
    double resultado = (10 * 7) + (20/4);
    String nomeCompleto = "Linguagem" + " Java";
    System.out.println(nomeCompleto);    
    String concatenacao = "?";
    
    concatenacao = 1 + 1 + 1 + "1";
    System.out.println(concatenacao);
    
    concatenacao = 1+"1"+1+1;
    System.out.println(concatenacao);
    
    concatenacao = 1 +"1" + 1 +"1";
    System.out.println(concatenacao);
    
    concatenacao ="1"+ 1+1+1;
    System.out.println(concatenacao);
    
    concatenacao = "1" + (1+1+1);
    System.out.println(concatenacao);
    
    }
    
}
