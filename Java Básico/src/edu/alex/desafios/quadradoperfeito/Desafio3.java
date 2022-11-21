package edu.alex.desafios.quadradoperfeito;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        int[] d = new int[n + 1];
        int indice = 0;
        for (int i= 0;i < n;i++){
            if (Math.pow( (i+1),2 )<= n){
                d[i] = (int) Math.pow( (i+1),2 );
            }else{
                indice = i-1;
                i = d.length-1;
            }
        }
        List<Integer>possiveisResultados = new ArrayList<>();
        System.out.println(geradorDeQuadradoPerfeito( n, d ,indice,possiveisResultados));
        //TODO: Com base no valor total, retorne o menor número de quadrados perfeitos.
    }
    private static int geradorDeQuadradoPerfeito(int n, int[] d,int aux, List<Integer> possiveisResultados) {
        int i =0;
        while (i <= aux){
            if (n % d[i]== 0 ) {
                possiveisResultados.add( n/d[i]);
            }else{
                for (int k =0; k < n;k++){
                    for (int x = 0; x <aux;x++){
                        if ((d[k]+ d[x]) % n == 0){
                            possiveisResultados.add( 2 );
                            return Collections.min( possiveisResultados );}
                    }
                }
            }
            i++;
        }
        return Collections.min( possiveisResultados );
    }
}
