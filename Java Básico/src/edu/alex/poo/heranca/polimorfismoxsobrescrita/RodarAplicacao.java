package edu.alex.poo.heranca.polimorfismoxsobrescrita;

public class RodarAplicacao {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faixineiro = new Faixineiro();

        //Gerente gerente = new Funcionario();
        // Classcast exception
        Vendedor vendedor2 = (Vendedor) new Funcionario();
    }
}
