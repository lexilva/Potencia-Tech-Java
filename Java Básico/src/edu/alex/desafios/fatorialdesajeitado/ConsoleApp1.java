package edu.alex.desafios.fatorialdesajeitado;


import java.util.Scanner;

public class ConsoleApp1 {
    public static void main(String[] args) {
        Scanner n = new Scanner( System.in );
        fatorialDesajeitado( n.nextInt() );
    }

    public static void fatorialDesajeitado(int n) {

        int res = 0;
        int cnt = 1;
        int tmp = n;
        n--;
        while (n > 0) {
            //TODO: Calcule o valor do fatorial de "n", atrinbuindo o retorno a "r".
            if (cnt == 1) {
                tmp *= n;
                cnt++;
            } else if (cnt == 2) {
                tmp /= n;
                cnt++;
            } else if ((cnt == 3)) {
                tmp += n;
                cnt = 0;
            } else if ((cnt == 0) && (n > 3)) {
                tmp = tmp - n * (n - 1) / (n - 2);
                cnt = 3;
                n -= 2;
            } else if (n >= 2) {
                tmp = tmp - n * (n - 1);
                n = 0;
            } else {
                tmp = tmp - n;
                n = 0;
            }
            n--;
        }
        res = tmp;
        System.out.println( res );
    }
}