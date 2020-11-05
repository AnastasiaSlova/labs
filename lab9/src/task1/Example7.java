package task1;

public class Example7 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {// исключение будет перехвачено
            System.out.println("1");
            throw new ArithmeticException();
        } catch (ArithmeticException e) { //иисключение не будет перехвачено из-за отсутствия волженности и прирвет поток
            System.out.println("2");
        }
        System.out.println("3");
    }
}
