package Lab7.Trees;

import java.util.Scanner;

public abstract class GardenTree {
    public static int treeCount = 0;

    private String sort;
    private int age;
    private double yieldCoefficient;

    public GardenTree() {
        treeCount++;
    }

    public static int getTreeCount() {
        return treeCount;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getYieldCoefficient() {
        return yieldCoefficient;
    }

    public void setYieldCoefficient(double yieldCoefficient) {
        this.yieldCoefficient = yieldCoefficient;
    }

    public abstract void harvest();

    public void set(Scanner scanner) {
        scanner.nextLine(); // Очистка буфера после nextDouble()
        System.out.print("Введите сорт: ");
        String sort = scanner.nextLine();
        setSort(sort);
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        setAge(age);
        System.out.print("Введите коэффициент урожайности: ");
        double yieldCoefficient = scanner.nextDouble();
        setYieldCoefficient(yieldCoefficient);
        scanner.nextLine(); // Очистка буфера после nextDouble()
    }

    @Override
    public String toString() {
        return "Сорт: " + getSort() + ", Возраст: " + getAge() + ", Урожайность: " + getYieldCoefficient();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof GardenTree other)) return false;
        return this.sort.equals(other.sort) && this.age == other.age && this.yieldCoefficient == other.yieldCoefficient;
    }
}