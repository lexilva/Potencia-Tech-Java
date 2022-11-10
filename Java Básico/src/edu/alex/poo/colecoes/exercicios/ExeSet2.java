package edu.alex.poo.colecoes.exercicios;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
* Crie uma classe LinguagemFavorita que possua os atributos
* nome, anoDeCriacao e ide. Em seguida, crie um conjunto com
* 3 linguagens e faça um programa que ordene esse conjunto
* por:
* A. Ordem de Inserção
* B. Ordem Natural(nome)
* C. Por IDE
* D. Ano de criacão e nome
* E. Nome, ano de criacao e IDE
* Ao final, exiba as linguagens no console, uma abaixo da outra*/
public class ExeSet2 {
    public static void main(String[] args) {
        Set<LinguagemFavorita> minhasLinguagens = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Java",1991,"Visual Studio Code"));
            add(new LinguagemFavorita("Phyton",1989,"Pycharm"));
            add(new LinguagemFavorita("JavaScript",1995,"Intellij"));
        }};
        System.out.println("A. Imprimir o conjunto por Ordem de inserção: ");
        //System.out.println(minhaLinguagens);
       for (LinguagemFavorita ling: minhasLinguagens)System.out.println(ling);
        System.out.println();
        System.out.println("B. Imprimir o conjunto por Ordem Natural(nome): ");
        Set<LinguagemFavorita> minhasLinguagens1 = new TreeSet<>(minhasLinguagens);
        for (LinguagemFavorita ling: minhasLinguagens1) System.out.println(ling);
        System.out.println();
        System.out.println("C. IDE");
        Set<LinguagemFavorita> minhaslinguagens2 = new TreeSet<LinguagemFavorita>(new ComparatorIde());
        minhaslinguagens2.addAll(minhasLinguagens);
        for (LinguagemFavorita ling: minhaslinguagens2)System.out.println(ling);
        System.out.println();
        System.out.println("D. Ano de criacão e nome");
        Set<LinguagemFavorita> minhasLinguagens3 = new TreeSet<LinguagemFavorita>(new  ComparatorAnoDeCriacaoNome());
        minhasLinguagens3.addAll(minhasLinguagens);
        for (LinguagemFavorita ling: minhasLinguagens3) System.out.println(ling);
        System.out.println();
        System.out.println("E. Nome, ano de criacao e IDE");
        Set<LinguagemFavorita> minhasLinguagens4 = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoDeCriacaoIde());
        minhasLinguagens4.addAll(minhasLinguagens);
        for (LinguagemFavorita ling: minhasLinguagens4) System.out.println(ling);
    }

}


