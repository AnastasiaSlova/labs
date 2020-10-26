package task7;

public class task7 {
    public static void main(String[] args) {
        int[] arr = Example.method(new char[]{'a', 'b', 'c', 'd', 'e'});

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
