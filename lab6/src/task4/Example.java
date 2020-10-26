package task4;

public class Example {
    public static int nonRecMethod(int arg) {
        int r = 1;
        while (arg >= 1) {
            r *= arg;
            arg -= 2;
        }
        return r;
    }

    public static int recMethod(int arg) {
        int r = arg % 2 == 0 ? 2 : 1;
        if (arg <= r) {
            return r;
        }
        return arg * recMethod(arg-=2);
    }
}
