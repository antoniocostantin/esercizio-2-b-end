package es.Switch;

import java.util.Scanner;

public class es2 {
    public static void main(String[] args) {


    }

    public static String sw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci un numero qualsiasi :");
        int num1 = sc.nextInt();
        return switch (num1) {
            case 0 -> "zero";
            case 1 -> "uno";
            case 2 -> "due";
            case 3 -> "tre";
            default -> "il numero non è compreso tra 0 e 3";
            // code block
        };
    }
}
