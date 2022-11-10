package edu.alex.poo.colecoes.exercicios;

import java.util.*;

/*
* Crie um cojunto contendo as cores do arco-íris e:
* A. Exiba toads as cores uma abaixo da outra
* B. A quantidade de cores que o arco-íris tem
* C. Exiba as cores em ordem alfabética
* D. Exiba as cores na ordem inversa da que foi informada
* E. Exiba todas as cores que começa com a letra "v"
* F. Remova todas as cores que não começam com a letra "v"
* G. Limpe o conjunto
* H. confira se o conjnto está vazio*/
public class ExeSet1 {
    public static void main(String[] args) {
        Set<String> arcoIris = new HashSet<>(Arrays.asList("vermelho","laranja","amarelo","verde",
                "azul","anil","violeta"));
        System.out.println("A. Exiba todas as cores uma abaixo da outra: ");
        for (String cor: arcoIris) System.out.println(cor);
        System.out.println();
        System.out.println("B. A quantidade de cores que o arco-íris tem: "+ arcoIris.size()+" cores");
        System.out.println();
        System.out.println("C. Exiba as cores em ordem alfabética: ");
        Set<String>arcoIris1 = new TreeSet<>(arcoIris);
        System.out.println(arcoIris1);
        System.out.println();
        System.out.println("D. Exiba as cores na ordem inversa da que foi informada: ");
        List<String>arcoIris2 = new ArrayList<>(arcoIris);
        Collections.reverse(arcoIris2);
        System.out.println(arcoIris2);
        System.out.println();
        System.out.println("E. Exiba toda as cores que começam com a letra v: ");
        for (String cor: arcoIris2){
            if (cor.startsWith("v")) System.out.println(cor);
        }
        System.out.println();
        System.out.println("F. Remova todas as cores que não começam com a letra v> ");
        Iterator<String> iterator = arcoIris2.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if (!next.startsWith("v")) {
                iterator.remove();
                arcoIris2.remove(next);
            }
        }
        System.out.println(arcoIris2);
        System.out.println();
        System.out.println("G. Limpe o conjunto: ");
        arcoIris2.clear();
        System.out.println(arcoIris2);
        System.out.println("H. Confira se o conjunto está vazio: ");
                if (arcoIris2.isEmpty()) System.out.println("Conunto vazio");
    }

}
