package task3;

public class Main {
    public static void main(String[] args) {

        ExampleSon exampleSon = new ExampleSon(3, '4', "56");
        System.out.println(exampleSon.toString());
        exampleSon.setParam(222);
        System.out.println(exampleSon.toString());
        exampleSon.setParam(333, 'W');
        System.out.println(exampleSon.toString());
        exampleSon.setParam(444, 'S', "QWE");
        System.out.println(exampleSon.toString());
    }
}
