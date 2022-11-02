package edu.alex.poo.interfaces;

public class Calculadora implements OperacaoMatematica{

    @Override
    public void soma(double operando1, double operando2) {
        System.out.println("Soma: "+operando1+operando2);
    }

    @Override
    public void subtraçao(double operando1, double operando2) {
        System.out.println("Subtração: "+operando1-operando2);
    }

    @Override
    public void multipicacao(double operando1, double operando2) {
        System.out.println("Multiplicação: "+operando1*operando2);
    }

    @Override
    public void divisao(double operando1, double operando2) {

        System.out.println("Divisão: "+operando1/operando2);
    }

}
