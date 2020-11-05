package task1;

public class Except7 {
    public static void m(int x) throws ArithmeticException {//из-за расширения метода throws ArithmeticException исключение будет перехвачено
        int h = 10 / x;
    }

    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("размер массива= " + l);
            m(l);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль");
        }
    }
}
