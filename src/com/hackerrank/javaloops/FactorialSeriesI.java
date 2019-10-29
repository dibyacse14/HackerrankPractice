package com.hackerrank.javaloops;

import java.util.ArrayList;
import java.util.Scanner;

public class FactorialSeriesI {
    private static int noOfSeriesQ;
    private static int startNoA;
    private static int MultiplierB,lengthN;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        noOfSeriesQ = Integer.parseInt(line1);
        ArrayList<String> lines = new ArrayList<>();
        if(noOfSeriesQ > 0){
            for(int i=0 ;i<noOfSeriesQ;i++) {
                lines.add(sc.nextLine());
            }
        }
        if(lines.size()>0){
            String[] elements = {};
            for (String s:lines) {
                elements = s.split(" ");
                if(elements.length == 3) {
                    startNoA = Integer.parseInt(elements[0]);
                    MultiplierB = Integer.parseInt(elements[1]);
                    lengthN = Integer.parseInt(elements[2]);
                    generateSeries(startNoA, MultiplierB, lengthN);
                }
                elements = new String[]{};
            }
        }
    }

    private static void generateSeries(int startNoA, int multiplierB, int lengthN) {
        int sValue = 0;
        int consta = 2;
        int expoValue = 1;
        for(int i = 0 ; i< lengthN ;i ++){
            sValue = 0;
            sValue = startNoA+multiplierB;

            for(int j = i ; j > 0 ;j--){

                sValue += (getExponentialValue(consta,j) * multiplierB);

            }

            System.out.print(sValue+" ");

        }
        System.out.println("");
    }

    private static int getExponentialValue(int n , int m){
        int result = 1;
        for(int i = 0 ; i < m ;i++){
            result *= n;
        }
        return result;
    }
}
