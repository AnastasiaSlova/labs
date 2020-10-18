import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input number");
        int length = in.nextInt();
        if (length<0){
            System.out.println("input number is not valid");
            return;
        }
        int[] arr = new int[length];
        int count = 0;
        for (int i = 0; ;i++){
            if (i%5==2){
                arr[count] = i;
                count++;
            } else if (count == length){
                break;
            }

        }
        for (int i: arr) {
            System.out.print(" "+ i);
        }
    }
}
