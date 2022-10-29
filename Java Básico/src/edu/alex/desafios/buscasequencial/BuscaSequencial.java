package edu.alex.desafios.buscasequencial;


import java.util.*;

public class BuscaSequencial {
    private static int achar(int[]elementos, int num) {
        for(int i = 0;i < elementos.length;i++){
            if(elementos[i] == num){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int count = leitor.nextInt();
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 
        int resultado = achar(elementos,count);
       if ( resultado == -1){   
            System.out.println("Numero "+ count +" nao encontrado!");
       }else{
            System.out.print("Achei "+count+" na posicao "+ resultado);
       }   
    }
        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.
}
