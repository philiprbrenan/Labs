package Lab7;

import Lab7.Trees.AppleTree;
import Lab7.Trees.CherryTree;
import Lab7.Trees.GardenTree;
import Lab7.Trees.NutTree;

import java.util.Scanner;

import static Lab7.Trees.GardenTree.treeCount;

public class Program {
    private static GardenTree[] trees = new GardenTree[5];
    private static int count = 0;

    public static void main(String[] args) {
        addTree(new AppleTree());
        addTree(new CherryTree());
        addTree(new NutTree());
        addTree(new AppleTree());
        addTree(new CherryTree());

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nМеню:");
            System.out.println("9. Exit");
            System.out.println("1. Показать все деревья");
            System.out.println("2. Собрать урожай");
            System.out.println("3. Сравнить деревья");
            System.out.println("4. Кол-во созданных объектов");
            System.out.println("5. Добавить дерево");
            System.out.println("6. Удалить дерево");
            System.out.println("7. Изменить дерево");
            System.out.print("Выбор: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showTrees();
                    break;
                case 2:
                    for (int i = 0; i < count; i++) {
                        if (trees[i] != null) {
                            trees[i].harvest();
                        }
                    }
                    break;
                case 3:
                    compareTrees();
                    break;
                case 4:
                    System.out.println("Всего объектов: " + GardenTree.getTreeCount());
                    break;
                case 5:
                    addNewTree(scanner);
                    break;
                case 6:
                    removeTree(scanner);
                    break;
                case 7:
                    updateTree(scanner);
                    break;
            }
        } while (choice != 0);
    }

    private static void addTree(GardenTree tree) {
        if (count == trees.length) {
            expandArray();
        }
        trees[count++] = tree;
    }

    private static void expandArray() {
        GardenTree[] newArray = new GardenTree[trees.length * 2];
        System.arraycopy(trees, 0, newArray, 0, trees.length);
        trees = newArray;
    }

    private static void showTrees() {
        for (int i = 0; i < count; i++) {
            System.out.println(trees[i]);
        }
    }

    private static void compareTrees() {
        if (count < 2) {
            System.out.println("Недостаточно объектов для сравнения.");
            return;
        }
        System.out.println("Сравниваются деревья 0 и 1:");
        for (int i = 0; i < count - 1; i++) {
            System.out.println(trees[i].equals(trees[i + 1]) ? "Они равны" : "Они разные");
        }
    }

    private static void addNewTree(Scanner scanner) {
        System.out.print("Введите тип дерева (1. Яблоня, 2. Вишня, 3. Орех): ");
        int type = scanner.nextInt();
        GardenTree tree = switch (type) {
            case 1 -> new AppleTree();
            case 2 -> new CherryTree();
            case 3 -> new NutTree();
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
        tree.set(scanner);
        addTree(tree);
        System.out.println("Дерево добавлено.");
    }

    private static void removeTree(Scanner scanner) {
        System.out.print("Введите индекс для удаления (0-" + (count - 1) + "): ");
        int index = scanner.nextInt();
        if (index >= 0 && index < count) {
            for (int i = index; i < count - 1; i++) {
                trees[i] = trees[i + 1];
            }
            trees[--count] = null; // Уменьшаем количество и очищаем последний элемент
            treeCount--;
            System.out.println("Дерево удалено.");
        } else {
            System.out.println("Некорректный индекс.");
        }
    }

    private static void updateTree(Scanner scanner) {
        System.out.print("Введите индекс для изменения (0-" + (count - 1) + "): ");
        int index = scanner.nextInt();
        if (index >= 0 && index < count) {
            GardenTree tree = trees[index];
            tree.set(scanner);
            System.out.println("Дерево изменено.");
        } else {
            System.out.println("Некорректный индекс.");
        }
    }
}
