package task8;

public class Example {
    public static double method(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return (double)result/arr.length;
    }
}
