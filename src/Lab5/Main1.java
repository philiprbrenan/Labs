package Lab5;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point1[] points = new Point1[4];

        for (int i = 0; i < points.length; i++) {
            points[i] = new Point1();
            System.out.print("Введите координаты для точки " + (i + 1) + " (x;y): ");
            while (true) {
                try {
                    double x1 = Double.parseDouble(scanner.next());
                    double y1 = Double.parseDouble(scanner.next());
                    points[i].setX1(x1);
                    points[i].setY1(y1);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод. Попробуйте еще раз.");
                }
            }
        }

        System.out.println("Список точек:");
        for (Point1 point : points) {
            System.out.println(point);
        }

        for (Point1 point : points) {
            System.out.println("Расстояние от " + point + " до начала координат: " + point.distanceToOrigin());
        }

        System.out.println("Проверка равенства:");
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                System.out.println(points[i] + " равно " + points[j] + ": " + points[i].equals(points[j]));
            }
        }

        scanner.close();
    }
}