package com.gokhankaplan.yildizdongu;

import java.util.Scanner;

public class YildizDongu {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many stars row do you want: ");
        n = scan.nextInt();

        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= (n - a); b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= (2 * a) - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int a = n - 1; a > 0; a--) {
            for (int b = 1; b <= (n - a); b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= (2 * a) - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
