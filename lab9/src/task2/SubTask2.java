package task2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class SubTask2 {
    static Scanner in = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int[][] arr = newArr();
        print(arr);
        method(arr);

    }

    public static void method(int[][] arr) {
        System.out.println("input number");
        int colIndex = 0;
        try {
            colIndex = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e.toString());
            return;
        }

        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i][colIndex]);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }

    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] newArr() {
        int[][] arr = new int[10][10];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(100);
            }
        }
        return arr;
    }
}
