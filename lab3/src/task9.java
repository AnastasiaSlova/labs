import java.util.Random;
import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("input size");
        int Size = id.nextInt();
        int[] nums = new int[Size];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(100);
        }
        print(nums);
        System.out.println();
        printMin(nums);
    }

    private static void print(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    private static void printMin(int[] a) {
        Integer[] b = new Integer[a.length];
        int cursor = 0;
        int min = a[0] + 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                b[cursor] = i;
                cursor = 0;
            } else if (a[i] == min) {
                cursor++;
                b[cursor] = i;
            }
        }
        System.out.println("element " +min + " index ");
        for (Integer i: b){
            if (i == null){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
