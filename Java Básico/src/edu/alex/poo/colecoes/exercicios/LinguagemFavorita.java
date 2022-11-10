package edu.alex.poo.colecoes.exercicios;

import java.util.Comparator;
import java.util.Objects;

public class LinguagemFavorita implements Comparable<LinguagemFavorita>{
        private String nome;
        private Integer anoDeCriacao;
        private String ide;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeCriacao(Integer anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "{" +
                "nome:'" + nome + '\'' +
                ", anoDeCriacao:'" + anoDeCriacao + '\'' +
                ", ide:'" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return  this.getNome().compareToIgnoreCase(linguagemFavorita.getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return nome.equals(that.nome) && anoDeCriacao.equals(that.anoDeCriacao) && ide.equals(that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }
}

class ComparatorIde implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita ling1,LinguagemFavorita ling2){
       return ling1.getIde().compareTo(ling2.getIde());
    }

}

class ComparatorAnoDeCriacaoNome implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita ling1, LinguagemFavorita ling2){
       int anoDeCriacao = Integer.compare(ling1.getAnoDeCriacao(), ling2.getAnoDeCriacao());
       if (anoDeCriacao != 0) return anoDeCriacao;
       return ling1.compareTo(ling2);
    }

}
class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita>{
    public int compare(LinguagemFavorita ling1, LinguagemFavorita ling2){
        int nome = ling1.getNome().compareToIgnoreCase(ling2.getNome());
        int anoDeCriacao = Integer.compare(ling1.getAnoDeCriacao(),ling2.getAnoDeCriacao());
        if (nome != 0) return nome;
        if (anoDeCriacao != 0) return anoDeCriacao;
        return  ling1.getIde().compareTo(ling2.getIde());
    }
}