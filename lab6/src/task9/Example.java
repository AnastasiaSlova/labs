package task9;

public class Example {

    public static int[] method(int[] ints) {
        for (int i = 0; i<ints.length/2; i++){
            int buffer = ints[i];
            ints[i] = ints[ints.length-i-1];
            ints[ints.length-i-1] = buffer;
        }
        return ints;
    }
}
