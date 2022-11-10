package edu.alex.poo.colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        //Dada uma lista com 7 notas de um aluno [7,8.5,9.3,5,7,8,3.6] faça:
        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());
        System.out.println("Exiba a posição da nota 5.0: "+ notas.indexOf(5d));
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);
        //System.out.println("Confira se a nota 5.0 está na lista: "+ notas.contains(5.d));
        //System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        for (Double nota : notas) System.out.println(nota);
        System.out.println("Exiba a terceira nota adicionada: " +notas.get(2));
        System.out.println(notas.toString());
        System.out.println("Exiba a menor nota: "+ Collections.min(notas));
        System.out.println("Exiva a maior nota: "+ Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        double soma = 0d;
        while (iterator.hasNext()){
            double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: "+ soma);
        System.out.println("Exiba a média das notas: "+ (soma/notas.size()));
        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);
        System.out.println("Remova a nota na posição 0: ");
        notas.remove(0);
        System.out.println(notas);
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            double next = iterator1.next();
            if(next <7) iterator1.remove();
        }
        System.out.println(notas);
        System.out.println("Apague toda a lista");
        //notas.clear();
        System.out.println("Confira se a Lista está vazia: "+ notas.isEmpty());
        System.out.println(notas);

    }

}
