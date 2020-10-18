import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input first number");
        int first = in.nextInt();
        System.out.println("input second number");
        int second = in.nextInt();
        System.out.println("for case");
        int[] arr = new int[second-first+1];
        for (int i = 0; i <= second-first; i++) {
            arr[i] = first+i;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("while case");
        while (first<=second){
            System.out.print(first+" ");
            first++;
        }
    }
}
