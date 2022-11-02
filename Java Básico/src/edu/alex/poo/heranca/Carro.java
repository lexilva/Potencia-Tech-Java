package edu.alex.poo.heranca;

public class Carro extends Veiculo{
    //atributos
    String cor;
    String modelo;
    int capacidadeTanque;
//construtores
    Carro(){

    }
    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }
//Get and setters
    void setCor(String cor){
        this.cor = cor;
    }
    String getCor(){
        return cor;
    }
    void setModelo(String modelo){
        this.modelo = modelo;
    }
    String getModelo(){
        return modelo;
    }
    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }
    int getCapacidadeTanque(){
        return capacidadeTanque;
    }
    //Métodos de negócio
    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque*valorCombustivel;
    }

}
