package task1;

public class Except3 {
    public static int m() {
        try {
            System.out.println("0");
            return 15;//return не выполнится из-за блога finally
        } finally {
            System.out.println("1");
            return 20;
        }
    }

    public static void main(String[] args) {
        System.out.println(m());
    }
}
