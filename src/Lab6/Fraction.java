package Lab6;

import java.util.Scanner;

public class Fraction {
    private Number num;
    private Number denom;

    public enum InputStatus {
        VALID,
        INVALID,
        EMPTY
    }

    private Fraction(Number num, Number denom) {
        this.num = num;
        this.denom = denom;
    }

    public static Fraction createFraction(Scanner scanner) {
        Number num = inputNumerator(scanner);
        Number denom = inputDenominator(scanner);
        return new Fraction(num, denom);
    }

    private static Number inputNumerator(Scanner scanner) {
        System.out.print("Введите числитель: ");
        while (true) {
            InputStatus status = validateInput(scanner);
            if (status == InputStatus.VALID) {
                return new Number(scanner.nextInt());
            } else {
                System.out.println("Ошибка: введите целое число!");
            }
        }
    }

    private static Number inputDenominator(Scanner scanner) {
        System.out.print("Введите знаменатель (не 0): ");
        while (true) {
            InputStatus status = validateInput(scanner);
            if (status == InputStatus.VALID) {
                int denom = scanner.nextInt();
                if (denom != 0) {
                    return new Number(denom);
                } else {
                    System.out.println("Ошибка: знаменатель не может быть равен нулю!\n"
                            + "Введите знаменатель заново: ");
                }
            } else {
                System.out.println("Ошибка: введите целое число!");
            }
        }
    }

    private static InputStatus validateInput(Scanner scanner) {
        if (!scanner.hasNext()) {
            return InputStatus.EMPTY;
        }
        if (scanner.hasNextInt()) {
            return InputStatus.VALID;
        } else {
            scanner.next();
            return InputStatus.INVALID;
        }
    }

    public void editFraction(Scanner scanner) {
        System.out.println("Редактируем дробь:");
        this.num = inputNumerator(scanner);
        this.denom = inputDenominator(scanner);
    }

    public void printFraction() {
        if (num != null && denom != null) {
            int gcd = gcd(num.getValue(), denom.getValue());
            int reduceNum = num.getValue() / gcd;
            int reduceDenom = denom.getValue() / gcd;
            if (reduceDenom == 1) {
                System.out.println("Полученное значение: " + reduceNum + "/" + reduceDenom + " = " + reduceNum);
            } else {
                System.out.println("Полученная дробь: " + reduceNum + "/" + reduceDenom);
            }
        }
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    public Fraction add(Fraction other) {
        int newNum = num.getValue() * other.denom.getValue() + other.num.getValue() * denom.getValue();
        int newDenom = denom.getValue() * other.denom.getValue();
        return new Fraction(new Number(newNum), new Number(newDenom));
    }

    public Fraction subtract(Fraction other) {
        int newNum = num.getValue() * other.denom.getValue() - other.num.getValue() * denom.getValue();
        int newDenom = denom.getValue() * other.denom.getValue();
        return new Fraction(new Number(newNum), new Number(newDenom));
    }

    public Fraction multiply(Fraction other) {
        int newNum = num.getValue() * other.num.getValue();
        int newDenom = denom.getValue() * other.denom.getValue();
        return new Fraction(new Number(newNum), new Number(newDenom));
    }

    public Fraction divide(Fraction other, Scanner scanner) {
        if (other.num.getValue() == 0) {
            System.out.println("При введённых значениях невозможно выполнить операцию (недопустимо деление на 0).\n" +
                    "Введите новую дробь для деления:");
            Fraction newFraction = createFraction(scanner);
            return divide(newFraction, scanner);
        }
        int newNum = num.getValue() * other.denom.getValue();
        int newDenom = denom.getValue() * other.num.getValue();
        return new Fraction(new Number(newNum), new Number(newDenom));
    }
}