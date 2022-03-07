package src;

import java.util.Scanner;

public class Fibo  implements Command{
    public String name() { return "fibo"; }
    public boolean run(Scanner scan) {

        System.out.println("Donner un nombre entier positif: ");
        int num = scan.nextInt();
        int n1 = 1, n2 = 1, n3 = 0;
        if (num == 0 || num == 1) {
            System.out.println("Fibo: " + n1);
        } else {
            for (int i = 2; i < num; i++) {
                n3 = n2 + n1;
                n1 = n2;
                n2 = n3;
            }
            System.out.println("Fibo: " + n2);
        }
        return false;
    }
}