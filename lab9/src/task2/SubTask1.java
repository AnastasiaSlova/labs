package task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SubTask1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = newArr();
        method(arr);
    }

    public static void method(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                result += arr[i];
            }
        }
        if (result <= 0) {
            throw new NullPointerException("положительные элементы отсутствуют");
        } else {
            System.out.println(result / arr.length);
        }
    }

    public static int[] newArr() {
        int[] arr = new int[10];
        System.out.println("input number");

        try {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println(e.toString());
        }
        return arr;
    }
}
