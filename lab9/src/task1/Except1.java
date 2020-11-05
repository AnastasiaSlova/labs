package task1;

public class Except1 {
    public static int m() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } finally {
            System.out.println("1"); //код выполнится и после выполнения выбросит ошибку
        }
    }

    public static void main(String[] args) {
        System.out.println(m());
    }
}
