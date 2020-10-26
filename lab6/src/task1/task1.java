package task1;

public class task1 {
    public static void main(String[] args) {
        Example example = new Example();
        example.setField('c');
        System.out.println(example.toString());
        example.setField("qwq");
        System.out.println(example.toString());
        example.setField(new char[]{'q'});
        System.out.println(example.toString());
        example.setField(new char[]{'q', 'w', 't'});
        System.out.println(example.toString());
    }
}
