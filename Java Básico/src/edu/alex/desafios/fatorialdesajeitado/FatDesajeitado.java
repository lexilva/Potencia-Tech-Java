package edu.alex.desafios.fatorialdesajeitado;

import java.util.Scanner;

public class FatDesajeitado {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        int n = scan.nextInt();
        int res = 0;
        int cnt = 1;
        int tmp = n;
        n--;
        while (n > 0) {
            if (cnt == 1) {
                tmp *= n;
                n--;
            } else if (cnt == 2) {
                if (n != 0) {
                    tmp /= n;
                    n--;
                }
            } else if (cnt == 3) {
                tmp += n;
                n--;
            } else {
                if (n - 2 > 0) {
                    tmp = tmp - n * (n - 1) / (n - 2);
                    res = tmp;
                    cnt = 2;
                    n -= 3;
                } else {
                    tmp = (n == 1) ? tmp - n : tmp - n * (n - 1);
                    res = tmp;
                    n = 0;
                }
            }
            cnt = (cnt + 1) % 4;
        }
        System.out.println( res );
    }

}


