package es;

import java.util.Scanner;

public class es4 {
    public static void main(String[] args){
        System.out.println("inserisci un numero");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fo(n);
    }
    public static void fo (int x){
        for(int i = x; i > 0; i--){
            System.out.println(i);
        }
    }
}
