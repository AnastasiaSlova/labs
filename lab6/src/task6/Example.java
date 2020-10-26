package task6;

public class Example {

    public static int[] method(int[] arr, int arg) {
        if (arr.length > arg) {
            int[] newArr = new int[arg];
            for (int i = 0; i < arg; i++) {
                newArr[i] = arr[i];
            }
            return newArr;
        } else {
            return arr;
        }
    }
}
