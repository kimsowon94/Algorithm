package Programmers;

import java.util.Scanner;

public class StarTaking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StarTaking solution = new StarTaking();
        solution.starTakingSolution(a,b);
    }

    public void starTakingSolution (int n, int m) {

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
