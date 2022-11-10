package edu.alex.poo.colecoes.exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
*Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa
* sobre um crime. As perguntas são>
* 1. "Telefonou para a vítima?"
* 2. "Esteve no local do crime?"
* 3. "Mora perto da vítima?"
* 4. "Devia para a vítima?"
* 5. "Já trabalhou com a vítima?"
* Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "suspeita",
*  entre 3 e 4 como "Cúmplice" e 5 como "Assassina". Caso contrário,
* ela será classificado como "Inocente"
* */
public class Exe02 {
    private static void responderInterrogatorio(List<String> interrogatorio, boolean[] resultadoInterrogatorio) {
        Iterator<String> iterator = interrogatorio.iterator();
        Scanner scan = new Scanner(System.in);
        int indice = 0;
        String resposta = "";
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.print(next);
            resposta = scan.next();
            resposta = resposta.toLowerCase();
            if (resposta.equals("s")) {
                resultadoInterrogatorio[indice++]= true;
            }else if(resposta.equals("n")){
                resultadoInterrogatorio[indice++]= false;
            }
        }
    }
    private static void resultadoInvestigacao(boolean[] resultadoInterrogatorio) {
        int cont = 0;
        String veredicto = "";
        for (boolean i: resultadoInterrogatorio){
            if (i) cont++;
        }
        switch (cont){
            case 2:
                veredicto= "Suspeito";break;
            case 3:
            case 4:
                veredicto = "Cúmplice";break;
            case 5: veredicto = "Assassino!";break;
            default: veredicto = "Inocente";
        }
        System.out.println("Resultado do Interrogatório:  "+ veredicto);
    }
    public static void main(String[] args) {
        List<String> interrogatorio = new ArrayList<>();
        interrogatorio.add("Telefonou para a vítima?");
        interrogatorio.add("Esteve no local do crime?");
        interrogatorio.add("Mora perto da vítima?");
        interrogatorio.add("Devia para a vítima?");
        interrogatorio.add("Já trabalhou com a vítima?");
        boolean[]resultadoInterrogatorio = new boolean[interrogatorio.size()];
        responderInterrogatorio(interrogatorio,resultadoInterrogatorio);
        resultadoInvestigacao(resultadoInterrogatorio);
    }


}
