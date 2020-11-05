package task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SubTask3 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        byte[] arr = arr();
        method(arr);
    }

    public static void method(byte[] arr) {
        byte result = 0;

        for (int i = 0; i<arr.length; i++){
            result += arr[i];
        }
        System.out.println(result);
    }

    public static byte[] arr() {
        byte[] arr = new byte[10];
        try {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextByte();
            }
        } catch (InputMismatchException e) {
            System.out.println(e.toString());
        }
        return arr;
    }
}
