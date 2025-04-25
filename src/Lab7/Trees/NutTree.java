package Lab7.Trees;

import java.util.Scanner;

public class NutTree extends GardenTree {
    private String nutSize;

    public NutTree() {
        super();
        this.nutSize = "";
    }

    public String getNutSize() {
        return nutSize;
    }

    public void setNutSize(String nutSize) {
        this.nutSize = nutSize;
    }
    @Override
    public void set(Scanner scanner) {
        super.set(scanner);
        System.out.println("Введите размер ореха: ");
        String nutSize = scanner.nextLine();
        setNutSize(nutSize);
    }

    @Override
    public void harvest() {
        System.out.println("Урожай с ореха "+getSort()+" - "+getAge() * getYieldCoefficient());
    }

    @Override
    public String toString() {
        return "Орешник - "+super.toString() + ", Размер ореха: " + getNutSize();
    }
}