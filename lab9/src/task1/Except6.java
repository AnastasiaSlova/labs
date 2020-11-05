package task1;

public class Except6 {
    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("размер массива= " + l);
            int h = 10 / l;
            args[l + 1] = "10";//это строка будет пропущена
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль"); //выведит сообщение
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс не существует");
        }
    }
}
