package edu.alex.poo.colecoes.exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


//Faça um program que receba a temperatura média dos 6 primeiros meses
// do anoe armazene-as em uma lista.
// Após isto, calcule a média semestral das temperaturas e mostre todas
//as temperaturas acima desta médias e em que mês elas ocorreram
//(mostrando o mês por extenso: 1- Janeiro, 2- Fevereiro, etc)
public class Exe01 {

    private static void mostrarTemperaturaAcimaMedia(String[] mesesDoAno, List<Double> temperaturas, double temperaturaMedia) {
        int indice;
        for (double i: temperaturas){
            if (i >= temperaturaMedia){
                indice = temperaturas.indexOf(i);
                System.out.print(temperaturas.indexOf(i) + 1);
                System.out.print(" - " + mesesDoAno[indice]);
                System.out.println(": " +i);
            }
        }
    }
    private static double calcularMediaSemestral(int primeiroSemestre, List<Double> temperaturas) {
        Iterator<Double> iterator = temperaturas.iterator();
        double soma =0d;
        double mediaSemestral = 0d;
        while (iterator.hasNext()){
            double next= iterator.next();
            soma += next;
        }
        mediaSemestral = (soma/primeiroSemestre);
        return  mediaSemestral;
    }
    public static void main(String[] args) {
        String[] mesesDoAno = {"Janeiro", "Fevereiro","Março","Abril", "Maio",
                "Junho","Julho","Agosto","Setembro","Outrubro","Novembro","Dezembro"};
        int primeiroSemestre = (mesesDoAno.length/2);
        Scanner ler = new Scanner(System.in);
        double temperaturaDoMes, temperaturaMedia ;
        List<Double> temperaturas = new ArrayList<>();
        for (int i=0; i < primeiroSemestre; i++){
            System.out.print("Digite a temperatura d "+ mesesDoAno[i]+" : ");
            temperaturaDoMes = ler.nextDouble();
            temperaturas.add(temperaturaDoMes);
            System.out.println(temperaturaDoMes);
        }
        System.out.println();
        System.out.println(temperaturas);
        System.out.println();
        temperaturaMedia = calcularMediaSemestral(primeiroSemestre,temperaturas);
        System.out.println("Temperatura Média: "+ temperaturaMedia);
        System.out.println("*****  -----  *****-  ----  *****");
        mostrarTemperaturaAcimaMedia(mesesDoAno,temperaturas, temperaturaMedia);
    }



}
