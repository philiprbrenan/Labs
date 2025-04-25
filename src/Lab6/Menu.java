package Lab6;

import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in);
    private Fraction fract1;
    private Fraction fract2;

    public void displayMenu() {
        System.out.println("Выберите пункт меню: \n" +
                "1. Создать дроби.\n" +
                "2. Редактировать дроби.\n" +
                "3. Сложить дроби.\n" +
                "4. Вычесть дроби.\n" +
                "5. Умножить дроби.\n" +
                "6. Разделить дроби.\n" +
                "0. Выход.\n");
    }

    public void start() {
        while (true) {
            displayMenu();
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Первая дробь: ");
                    fract1 = Fraction.createFraction(sc);
                    System.out.println("Вторая дробь: ");
                    fract2 = Fraction.createFraction(sc);
                    break;
                case 2:
                    System.out.println("Какую дробь нужно отредактировать?\n" +
                            "1. Редактировать первую дробь.\n" +
                            "2. Редактировать вторую дробь.\n" +
                            "3. Редактировать обе дроби.");
                    int choice2 = sc.nextInt();
                    switch (choice2) {
                        case 1:
                            if (fract1 != null) {
                                fract1.editFraction(sc);
                            } else {
                                System.out.println("Первая дробь не существует.");
                            }
                            break;
                        case 2:
                            if (fract2 != null) {
                                fract2.editFraction(sc);
                            } else {
                                System.out.println("Вторая дробь не существует.");
                            }
                            break;
                        case 3:
                            if (fract1 != null) {
                                fract1.editFraction(sc);
                            } else {
                                System.out.println("Первая дробь не существует.");
                            }
                            if (fract2 != null) {
                                fract2.editFraction(sc);
                            } else {
                                System.out.println("Вторая дробь не существует.");
                            }
                            break;
                        default:
                            System.out.println("Неверный ввод. Попробуйте снова.");
                    }
                    break;
                case 3:
                    if (fract1 != null && fract2 != null) {
                        Fraction result = fract1.add(fract2);
                        System.out.print("Результат сложения: ");
                        result.printFraction();
                    } else {
                        System.out.println("Необходимо создать обе дроби.");
                    }
                    break;
                case 4:
                    if (fract1 != null && fract2 != null) {
                        Fraction result = fract1.subtract(fract2);
                        System.out.print("Результат вычитания: ");
                        result.printFraction();
                    } else {
                        System.out.println("Необходимо создать обе дроби.");
                    }
                    break;
                case 5:
                    if (fract1 != null && fract2 != null) {
                        Fraction result = fract1.multiply(fract2);
                        System.out.print("Результат умножения: ");
                        result.printFraction();
                    } else {
                        System.out.println("Необходимо создать обе дроби.");
                    }
                    break;
                case 6:
                    if (fract1 != null && fract2 != null) {
                        Fraction result = fract1.divide(fract2, sc);
                        System.out.print("Результат деления: ");
                        result.printFraction();
                    } else {
                        System.out.println("Необходимо создать обе дроби.");
                    }
                    break;
                case 0:
                    System.out.println("Выход из программы.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный ввод. Попробуйте снова.");
            }
        }
    }
}