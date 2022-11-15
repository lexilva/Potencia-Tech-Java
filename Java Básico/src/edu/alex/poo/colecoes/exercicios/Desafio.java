package edu.alex.poo.colecoes.exercicios;

import java.util.*;

/*
* Faça um programa que simule um lançamento de dados.
* Lance odado 100 vezes e armazene.
* Depois, mostre quantas vezes cada valor foi inserido
* */
public class Desafio {
    public static void main(String[] args) {
        int quantLancamentos = 100;
        List<Integer>resultados = new ArrayList<>();
        Random lancamento = new Random();
        for (int i= 0; i < quantLancamentos; i++){
            int valor = lancamento.nextInt(6)+1;
            resultados.add(valor);
        }
        Map<Integer,Integer> sorteios = new HashMap<>();
        for (int numeroSorteado : resultados){
            if (sorteios.containsKey( numeroSorteado )) sorteios.put( numeroSorteado,sorteios.get( numeroSorteado )+1 );
            else sorteios.put( numeroSorteado,1 );
        }
        System.out.println(sorteios);
    }


}
