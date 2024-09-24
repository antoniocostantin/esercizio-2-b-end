package es;

import java.util.Scanner;

public class es1 {
    public static void main(String[] args) {

        boolean y = stringaPariDispari();

        System.out.println(y);
        boolean z = annoBisestile();

        System.out.println(z);

}

    public static boolean stringaPariDispari ( ){
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci una stringa qualsiasi :");
        String x = sc.nextLine();

        if (x.length()% 2 == 0){
            return true;
        } else return false;
    }
    public static boolean annoBisestile ( ){
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci un anno qualsiasi :");
        int x = sc.nextInt();

        if (x % 4 == 0 && x % 100 != 0 || x % 400 == 0){
            return true;
        } else return false;
    }

}
