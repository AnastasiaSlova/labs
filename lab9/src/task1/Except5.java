package task1;

public class Except5 {
    public static void m(String str, double chislo) {
        if (str == null) {
            throw new IllegalArgumentException("Строка введена неверно");
        }
        if (chislo > 0.001) {//до этой проверки не дойдет из-за исключения выше
            throw new IllegalArgumentException("Неверное число");
        }
    }

    public static void main(String[] args) {
        m(null, 0.000001);
    }
}
