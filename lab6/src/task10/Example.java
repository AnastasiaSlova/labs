package task10;

public class Example {
    public static <i> int[] proc(int... arg) {
        int min = arg[0];
        int max = arg[0];
        for (int i = 0; i < arg.length; i++) {
            if (arg[i] > max) {
                max = arg[i];
            }
            if (arg[i] < min) {
                min = arg[i];
            }
        }
        return new int[]{max, min};
    }
}
