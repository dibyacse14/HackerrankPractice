package com.hackerrank.strings;

import java.util.Scanner;

public class StringLexoGraphy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(str1.length()+str2.length());
        System.out.println(str1.compareToIgnoreCase(str2)>0 ? "Yes" : "No");
        String s1 = str1.substring(0,1).toUpperCase()  + str1.substring(1) +" "+str2.substring(0,1).toUpperCase() + str2.substring(1);
        System.out.println(s1);

        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String result = S.substring(start,end-1);
        System.out.println(result);
    }
}
