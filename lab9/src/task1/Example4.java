package task1;

import com.sun.javaws.exceptions.ErrorCodeResponseException;

public class Example4 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {// т.к. исключение выше RuntimeException, то исключение не перехватиться
            System.out.println("1");
        } catch (Exception e) {
            System.out.println("2");
        } catch (Error e) {// блок Error не относится к Exception
            System.out.println("3");
        }
        System.out.println("4");
    }
}
