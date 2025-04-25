package Lab1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        if (x == 0) {
            ++x;
        }
        System.out.println("Полученное число:" + x);
        sc.close();
    }
}
