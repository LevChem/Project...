package com.letovo;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] a = new int [n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i%2==0){
                    a[i][j] = n*i+j+1;
                }
                else{
                    a[i][j] = (i+1)*n - j;
                }
            }
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }
    }
}