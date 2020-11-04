package task2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input number");
        int num = in.nextInt();
        System.out.println(reqMethod(num));
    }

    public static String reqMethod(int num){
        return num > 0 ? reqMethod(num / 2) + (num % 2) : "";
    }
}
