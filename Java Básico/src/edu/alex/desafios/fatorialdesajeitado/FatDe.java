package edu.alex.desafios.fatorialdesajeitado;

public class FatDe {
    public static void main(String[] args) {
        //Scanner s = new Scanner( System.in );
        // System.out.println( fatorialDesajeitado( s.nextInt() ) );
        for (int i = 0; i < 30; i++) {
            System.out.println( fatorialDesajeitado( i ) );
        }
    }

    public static int fatorialDesajeitado(int N) {
        // by Tiago Lazarin
        int resultado = 0, cur = N, j = 0;
        char[] operador = new char[]{'*', '/', '+', '-'};
        for (int i = N - 1; i >= 1; --i) {
            if (operador[j] == '*') {
                cur *= i;
            } else if (operador[j] == '/') {
                cur /= i;
            } else if (operador[j] == '+') {
                resultado += i;
            } else {
                resultado += (i == N - 4) ? cur : -cur;
                cur = i;
            }
            j = (j + 1) % 4;
        }
        return resultado + ((N <= 4) ? cur : -cur);
    }
}
