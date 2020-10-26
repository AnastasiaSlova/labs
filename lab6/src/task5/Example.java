package task5;

public class Example {
    public static int nonRecMethod(int arg) {
        int result = 0;
       for (int i = 1; i<= arg; i++){
           result += Math.pow(i, 2);

       }
       return result;
    }

    public static int recMethod(int arg) {
        if (arg == 1){
            return 1;
        }
        return (int) (Math.pow(arg, 2) + recMethod(arg-1));
    }
}
