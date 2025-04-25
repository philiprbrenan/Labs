package Lab1;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите х: ");
        double x = sc.nextDouble();

        //Набор №1
        double a = 4.5;
        double b = 8.4;
        double z = 0.0;
        //расчёт z
        if (Math.cos(b * x) == 0) {
            System.out.println("Ошибка: tan(b*x) не определён!");
        } else {
            z = Math.pow(Math.tan(b * x), 2);
        }
        //рассчёты у
        if (x < a) {
            System.out.println("Полученное значение для набора параметров  №1: y = " + (a * Math.pow(Math.cos(x), 2) + b * Math.sin(b * z)));
        } else if (a <= x && x < 4.5 * b) {
            System.out.println("Полученное значение для набора параметров  №1: y = " + a * Math.tan(a * x + z) + Math.pow(Math.sin(b * x), 2));
        } else if ((a * x - b) <= 0) {
            System.out.println("Ошибка: значение y не может быть определено!");
        } else {
            System.out.println("Полученное значение для набора параметров  №1: y = " + (Math.log(a * x - b) + Math.pow(x, 2)));
        }

        //Набор №2
        a = 8.2;
        b = 15.2;
        //расчёт z
        if (Math.cos(b * x) == 0) {
            System.out.println("Ошибка: tan(b*x) не определён!");
        } else {
            z = Math.pow(Math.tan(b * x), 2);
        }
        //расчёты у
        if (x < a) {
            System.out.println("Полученное значение для набора параметров  №2: y = " + (a * Math.pow(Math.cos(x), 2) + b * Math.sin(b * z)));
        } else if (a <= x && x < 4.5 * b) {
            System.out.println("Полученное значение для набора параметров  №2: y = " + a * Math.tan(a * x + z) + Math.pow(Math.sin(b * x), 2));
        } else if ((a * x - b) == 0) {
            System.out.println("Ошибка: значение y не может быть определено!");
        } else {
            System.out.println("Полученное значение для набора параметров  №2: y = " + (Math.log(a * x - b) + Math.pow(x, 2)));
        }
        //Набор №3
        a = 1.7;
        b = 0.5;
        //расчёт z
        if (Math.cos(b * x) == 0) {
            System.out.println("Ошибка: tan(b*x) не определён!");
        } else {
            z = Math.tan(b * Math.pow(x, 2));
        }
        //расчёты у
        if (x < a) {
            System.out.println("Полученное значение для набора параметров  №3: y = " + (a * Math.pow(Math.cos(x), 2) + b * Math.sin(b * z)));
        } else if (a <= x && x < 4.5 * b) {
            System.out.println("Полученное значение для набора параметров  №3: y = " + a * Math.tan(a * x + z) + Math.pow(Math.sin(b * x), 2));
        } else if ((a * x - b) == 0) {
            System.out.println("Ошибка: значение y не может быть определено!");
        } else {
            System.out.println("Полученное значение для набора параметров  №3: y = " + (Math.log(a * x - b) + Math.pow(x, 2)));
        }
    }
}

