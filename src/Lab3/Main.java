package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int first_num_even = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                if(first_num_even == -1) {
                    first_num_even = array[i];
                }
                if (first_num_even != -1) {
                    array[i] = array[i] + first_num_even;
                }
            }
        }
        System.out.println("Полученный массив: " + Arrays.toString(array));
    }
}
