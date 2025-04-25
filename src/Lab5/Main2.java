package Lab5;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Numbers[] numbers = new Numbers[4];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Требуется ввести 4 целых числа для объекта " + (i + 1) + ": ");
            numbers[i] = new Numbers();
            int a = getValidValue(scanner, "Введите первое число: ");
            int b = getValidValue(scanner, "Введите второе число: ");
            int c = getValidValue(scanner, "Введите третье число: ");
            int d = getValidValue(scanner, "Введите четвёртое число: ");
            numbers[i].setA(a);
            numbers[i].setB(b);
            numbers[i].setC(c);
            numbers[i].setD(d);
        }

        printNumbers(numbers);

        scanner.close();
    }

    public static void printNumbers(Numbers[] numbers) {
        System.out.println("Список объектов Numbers: ");
        for (Numbers number : numbers) {
            System.out.println(number);
            System.out.println("Значения:");
            System.out.println("a = " + number.getA());
            System.out.println("b = " + number.getB());
            System.out.println("c = " + number.getC());
            System.out.println("d = " + number.getD());
            System.out.println("Среднее арифметическое чисел: " + number.average());
            System.out.println("Максимальное число: " + number.max());
            System.out.println();
        }

        System.out.println("Проверка равенства: ");
        for (Numbers number : numbers) {
            for (Numbers value : numbers) {
                System.out.println("Наборы чисел " + number + " и " + value + " совпадают: " + number.equals(value));
            }
        }
    }

    public static int getValidValue(Scanner scanner, String prompt) {
        int num;
        while (true) {
            System.out.println(prompt);
            try {
                num = scanner.nextInt();
                return num;
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Попробуйте ещё раз.");
            }
        }
    }
}
