package task6;

public class task6 {
    public static void main(String[] args) {
        int[] arr = Example.method(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 3);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
