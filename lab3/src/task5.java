import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        String str = "qwe";
        System.out.println(str.charAt(1));
        Scanner in = new Scanner(System.in);
        System.out.println("input number");
        int length = in.nextInt();
        int length2 = length;
        int result = 0;
        int result2 = 0;
        System.out.println("for case");
        for (int i = 0; ; i++) {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.print(i + " ");
                result = result + i;
                length--;
            }
            if (length == 0) {
                break;
            }
        }
        System.out.println();
        System.out.println(result);
        System.out.println("while case");
        int j = 0;
        while (length2 > 0) {
            if (j % 5 == 2 || j % 3 == 1) {
                System.out.print(j + " ");
                result2 = result2 + j;
                length2--;
            }
            j++;
        }
        System.out.println();
        System.out.println(result2);
    }
}
