import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input number");
        int length = in.nextInt();
        int[] arrayFor = new int[length];
        System.out.println("for case");
        for (int i = 0; i < length; i++) {
            if (i <= 1) {
                arrayFor[i] = 1;
            } else {
                arrayFor[i] = arrayFor[i - 1] + arrayFor[i - 2];
            }
        }
        for (int i : arrayFor) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println("while case");
        int i = 0;
        int j = 1;
        int count = 0;
        while (count<length){
            if (count<= 0){
                System.out.print(1);
                count++;
            } else{
                int sum = j+i;
                System.out.print(sum);
                i=j;
                j=sum;
                count++;
            }
        }
    }
}
