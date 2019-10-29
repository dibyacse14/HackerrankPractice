package com.hackerrank.javaloops;

import java.util.Scanner;

public class NumberSeries2 {
    private static long n ,m , result=1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 no to find factorial n ^ m : ");
        n = sc.nextInt();
        m = sc.nextInt();
        for(int i = 0; i< m ; i++ ){
            result  *=  n;
//            System.out.print(" "+result);
        }
        System.out.println(" Result = : "+(result-1));

    }
}
