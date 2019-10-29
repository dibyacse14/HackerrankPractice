package com.hackerrank.javaloops;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadConsole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean endOfFile = true;
        ArrayList<String> readables = new ArrayList<>();
        while (sc.hasNext() && endOfFile){
            String str = sc.nextLine();
            readables.add(str);
            if(str.endsWith("end-of-file.")) {
                endOfFile =false;
                break;
            }
        }
        if(readables.size()> 0){
            for(int i = 0 ; i < readables.size() ; i++)
                System.out.println((i+1)+" "+readables.get(i));
        }
    }
}
