package es.While;

import java.util.Scanner;

public class es3 {
    public static void main(String[] args) {
        wh();
    }

    public static void wh() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Inserisci una stringa (':q' per terminare il ciclo)");
            String s = sc.nextLine();
            if (s.equals(":q")) break;
            String[] caratteri = s.split("");
            System.out.println(String.join(",", caratteri));
        }
    }
}
