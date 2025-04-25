package Lab7.Trees;

import java.util.Scanner;

public class AppleTree extends GardenTree {
    private String appleColor;

    public AppleTree() {
        super();
//        this.appleColor = "red";
    }

    public String getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }

    @Override
    public void set(Scanner scanner) {
        super.set(scanner);
        System.out.println("Введите цвет яблок: ");
        String color = scanner.nextLine();
        setAppleColor(color);
    }

    @Override
    public void harvest() {
        System.out.println("Урожай с яблони "+getSort()+" - "+getAge() * getYieldCoefficient());
    }

    @Override
    public String toString() {
        return "Яблоня - "+super.toString() + ", Цвет яблок: " + getAppleColor();
    }
}