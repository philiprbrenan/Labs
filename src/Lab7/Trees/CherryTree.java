package Lab7.Trees;

import java.util.Scanner;

public class CherryTree extends GardenTree {
    private boolean isSweet;

    public CherryTree() {
        super();
        this.isSweet = false;
    }

    public boolean getIsSweet() {
        return isSweet;
    }

    public void setSweet(boolean sweet) {
        isSweet = sweet;
    }
    @Override
    public void set(Scanner scanner){
        super.set(scanner);
        System.out.println("Ягода сладкая? (true or false)");
        boolean isSweet = scanner.nextBoolean();
        setSweet(isSweet);

    }

    @Override
    public void harvest() {
        System.out.println("Урожай с черешни "+getSort()+" - "+getAge() * getYieldCoefficient());
    }

    @Override
    public String toString() {
        return "Черешня - "+super.toString() + ", Сладкая: " + getIsSweet();
    }
}