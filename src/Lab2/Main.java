package Lab2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите число (введите 0 для прерывания): ");
        int x;
        int num_int=0;
        double sum=0.0;
        while (true){
            x=sc.nextInt();
            sum+=x;
            if (x==0){
                break;
            }
            num_int++;
        }
        System.out.println("Количество членов последовательности: "+num_int);
        System.out.println("Среднее значение: "+sum/num_int);
    }
}