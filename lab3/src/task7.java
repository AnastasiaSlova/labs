import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input number");
        int length = in.nextInt();
        char[] arr = new char[length];
        for (int i = 0; i < length; i++) {
            switch (i % 10) {
                case 0:
                    arr[i] = 'a';
                    break;
                case 1:
                    arr[i] = 'c';
                    break;
                case 2:
                    arr[i] = 'e';
                    break;
                case 3:
                    arr[i] = 'g';
                    break;
                case 4:
                    arr[i] = 'i';
                    break;
                case 5:
                    arr[i] = 'k';
                    break;
                case 6:
                    arr[i] = 'm';
                    break;
                case 7:
                    arr[i] = 'o';
                    break;
                case 8:
                    arr[i] = 'q';
                    break;
                case 9:
                    arr[i] = 's';
                    break;
            }
        }
        for (char c : arr) {
            System.out.print(c + " ");
        }

        System.out.println();
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
