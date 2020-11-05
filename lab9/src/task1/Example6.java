package task1;

public class Example6 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (ArithmeticException e) { //исключение не будет перехвачено
            System.out.println("1");
        } catch (Exception e) {
            System.out.println("2");
        }
//        catch (RuntimeException e) {  этот блок не скомпилируется из-за того, что исключение перехватиться в блоке выше
//            System.out.println("3");
//        }
        System.out.println("4");
    }
}
