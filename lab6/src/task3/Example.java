package task3;

public class Example {
    public static <i> void proc(int... arg) {
        int min = arg[0];
        int max = arg[0];
        int middle = 0;
        for (int i = 0; i < arg.length; i++) {
            if (arg[i] > max) {
                max = arg[i];
            }
            if (arg[i] < min) {
                min = arg[i];
            }
            middle += arg[i];
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("all sum = " + middle);
        System.out.println("meddle = " + (double)middle/arg.length);
    }
}
