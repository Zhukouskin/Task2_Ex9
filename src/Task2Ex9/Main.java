package Task2Ex9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите число : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 1;
        for (int i = 1 ; i <= n ; i++ )
        f = f * i;
        System.out.print("Факториал числа равен " + f + ".");
    }
}
