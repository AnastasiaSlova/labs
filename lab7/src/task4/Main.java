package task4;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ExampleSon exampleSon = new ExampleSon('1', "23", 4);
        System.out.println(exampleSon.toString());
        ExampleSon exampleSonCopy = new ExampleSon(exampleSon);
        System.out.println(exampleSonCopy.toString());
    }
}
