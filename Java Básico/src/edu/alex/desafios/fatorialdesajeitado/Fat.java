package edu.alex.desafios.fatorialdesajeitado;

import java.util.Scanner;

public class Fat {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        int resultado = fatorialDesajeitado( scan.nextInt() );
        System.out.println( resultado );
    }

    public static int fatorialDesajeitado(int n) {

        int res = 0;
        int cnt = 1;
        int tmp = n;
        n--;
        while (n > 0) {
            if (cnt < 2) {
                tmp = tmp * n / (n - 1) + (n - 2);
                n -= 3;
                cnt++;
            } else {
                tmp -= n * (n - 1) / (n - 2) + (n - 3);
                n -= 3;
                cnt = 1;
            }
        }
        return tmp;
    }

}
