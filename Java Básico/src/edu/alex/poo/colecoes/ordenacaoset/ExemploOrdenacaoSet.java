package edu.alex.poo.colecoes.ordenacaoset;

import java.util.*;

/*
* Dadas as seguintes informações sobre séries, crie um
* conunto e ordene este conjunto exibindo>
* {nome - genero - tempo de episódio};
*
*Serie 1 = nome> got, genero: fantasia, tempoEpidodio: 30
* Serie 2 = nome: dark, genero: drama, tempoEpisodio: 60
* Serie 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25*/
public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got","fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comedia", 25));
        }};
        for (Serie serie: minhasSeries){
            System.out.println(serie.getNome()+ " - "+ serie.getGenero()+" - "+
                    serie.getTempoEpisodio());
        }
        System.out.println();
        System.out.println("--\tOrdem Inserção\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("got","fantasia", 60));
            add(new Serie("dark","drama",60));
            add(new Serie("That '70s show", "comédia", 25));
        }};
        for (Serie serie: minhasSeries1)
            System.out.println(serie.getNome() + " - "+ serie.getGenero()+ " - "+ serie.getTempoEpisodio());
        System.out.println();
        System.out.println("--\tOrdem natural (TempoEpisodio)\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie: minhasSeries2) System.out.println(serie.getNome()+" - "+
                serie.getGenero()+" - "+serie.getTempoEpisodio());
        System.out.println();
        System.out.println("--\tOrdem Nome/Gênero/TempoEpisódio\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpidodio());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie: minhasSeries3) System.out.println(serie.getNome()+" - "+
                serie.getGenero()+" - "+ serie.getTempoEpisodio());
    }
}
class ComparatorNomeGeneroTempoEpidodio implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;

        return  Integer.compare(s1.getTempoEpisodio(),s2.getTempoEpisodio());

    }
}