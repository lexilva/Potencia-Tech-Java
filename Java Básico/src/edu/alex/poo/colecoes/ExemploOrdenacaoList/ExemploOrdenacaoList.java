package edu.alex.poo.colecoes.ExemploOrdenacaoList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Dados as seguintes informações sobre gatos, crie uma lista e
ordene esta lista exibindo:
(nome - idade - cor);

Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome Simba, idade:6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo
 */
public class ExemploOrdenacaoList {
    public static void main(String[] args) {
    List<Gato> meusGatos = new ArrayList<>(){
        {
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};
        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);

        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Natural (Nome)\t ---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
        System.out.println("--\tOrdem por (idade):\t ---");
        //Collections.sort(meusGatos,new ComparatoIdade());
        meusGatos.sort(new ComparatoIdade());
        System.out.println(meusGatos);
    }
}


class  Gato implements  Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;


    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}
class  ComparatoIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(),g2.getIdade());
    }
}
class  CompartoCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}