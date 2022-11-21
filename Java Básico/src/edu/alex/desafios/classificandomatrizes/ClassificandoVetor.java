package edu.alex.desafios.classificandomatrizes;

import java.util.Scanner;

public class ClassificandoVetor {
    public static void main(String[] args) {
        version2();
    }

    public static void version2() {

        Scanner input = new Scanner( System.in );
        int i;
        int N = input.nextInt();
        int[] nums = new int[N];
        for (i = 0; i < N; i++) {
            nums[i] = input.nextInt();
        }
        //TODO: mova todos os inteiros pares para o inicio do array, seguido por todos os números ímpares
        int j = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums[i] = nums[i] ^ nums[j] ^ (nums[j] = nums[i]);
                j++;
            }
        }
        for (var entry : nums) {
            System.out.println( entry );
        }
    }

    public static void version1() {
        Scanner scan = new Scanner( System.in );
        int n = scan.nextInt();
        int[] nums = new int[n];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                j++;
            }
        }

        for (int x = 0; x < nums.length; x++) {
            System.out.println( nums[x] );
        }
    }
}
