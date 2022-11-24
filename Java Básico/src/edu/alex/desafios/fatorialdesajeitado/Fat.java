package edu.alex.desafios.fatorialdesajeitado;

import java.util.Scanner;

public class Fat {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        int n = scan.nextInt();
        int res = 0;
        int cnt = 1;
        int tmp = n;
        n--;
        while (n > 0) {
            switch (cnt) {
                case 1: {
                    tmp *= n;
                    //cnt++;
                    n--;
                    break;
                }
                case 2: {
                    if (n != 0) {
                        tmp /= n;
                        //cnt++;
                        n--;
                        break;
                    }
                }
                case 3: {
                    tmp += n;
                    // cnt = 0;
                    n--;
                    break;
                }
                case 0: {
                    if (n - 2 > 0) {
                        res = tmp;
                        tmp = tmp - n * (n - 1) / (n - 2);
                        res = tmp;
                        cnt = 2;
                        n -= 3;
                        break;
                    } else {
                        tmp = (n == 1) ? tmp - n : tmp - n * (n - 1);
                        res = tmp;
                        //    tmp -= n;
                        n = 0;
                    }
                    /*else {
                        tmp = tmp - n * (n - 1);
                        n = 0;
                        res = tmp;
                        break;
                    }*/
                }
            }
            cnt = (cnt + 1) % 4;
        }
        System.out.println( res );
    }

}

