package com.hackerrank.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SmallestAndLargestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String  substrings;
        int k = sc.nextInt();
        ArrayList listOfSubstring = new ArrayList();
        for(int i = 0 ; i < s.length();i++){
            if(i+k <= s.length())
            listOfSubstring.add(s.substring(i,i+k));
        }
//        System.out.println(listOfSubstring);
        Collections.sort(listOfSubstring);
        System.out.println(listOfSubstring.get(0));
        System.out.println(listOfSubstring.get(listOfSubstring.size()-1));
    }
}
