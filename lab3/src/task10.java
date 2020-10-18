import java.util.Random;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("input size");
        int Size = id.nextInt();
        int[] nums = new int[Size];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200);
        }
        print(nums);
        System.out.println();
        bubbleSorter(nums);
        print(nums);


    }
    private static void toSwap(int[] a, int first, int second) {
        int dummy = a[first];
        a[first] = a[second];
        a[second] = dummy;
    }
    public static void bubbleSorter(int[] a) {
        for (int out = a.length - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (a[in] < a[in + 1])
                    toSwap(a, in, in + 1);
            }
        }
    }
    private static void print(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
