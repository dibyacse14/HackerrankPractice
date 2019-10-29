package com.hackerrank.javaloops;

import java.util.Scanner;

public class TestStaticBlock {
    static int b,h;
    static boolean flag = true;
    static{
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        h = sc.nextInt();


        if(b <= 0 || h <= 0){
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    public static void main(String[] args) {
        if(flag){
            int area=b*h;
            System.out.print(area);
        }
    }
}
