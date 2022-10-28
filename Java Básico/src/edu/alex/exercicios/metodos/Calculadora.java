package edu.alex.exercicios.metodos;
/**
 * <h1>Calculadora</h1>
 * A calculadora realiza opreções entre números double.
 * <p>
 * <b>Note:</b>  Leia atentamente a documentaçã desta desfrutar dos recursos oferecidos
 * @author Alex Sandro
 * @version 1.0
 * @since 06/10/22      
 * 
 */
public class Calculadora {
    /**
     * Este método é utilizadols para somar 2 números double.
     * @param numero1 este é o primeiro parametro deste método
     * @param numero2 este é o segundo parametro deste método
     */
    public static void  somar(double numero1, double numero2){
        double resultado = numero1 + numero2;
        System.out.println("A soma de "+ numero1 +" + "+ numero2 +" = "+ resultado);
    }
    /**
     * Este método é utilizado para subtrair 2 números double.
     * @param numero1 este é o primeiro parametro deste método
     * @param numero2 este é o segundo parametro deste método
     */
    public  static void subtrair(double numero1, double numero2){
        double resultado = numero1 - numero2;
        System.out.println("A subtração de "+numero1 + " + "+numero2+" = " + resultado);
    }
    public static void multiplicar(double numero1, double numero2){
        double resultado = numero1 * numero2;
        System.out.println("A multiplicação de "+numero1+" + "+numero2+" = "+resultado);
    }
    public static void dividir(double numero1, double numero2){
        double resultado = numero1/ numero2;
        System.out.println("A divisão de "+numero1+" / "+numero2+" = "+resultado);
    }
}
