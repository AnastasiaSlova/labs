package task5;

public class Main {
    public static void main(String[] args) {
        ExampleParent exampleParent = new ExampleParent("Parent");
        System.out.println(exampleParent.toString());
        ExampleChild exampleChild = new ExampleChild("Parent param", 1);
        System.out.println(exampleChild.toString());
        ExampleChild2 exampleChild2 = new ExampleChild2("Parent param2", '2');
        System.out.println(exampleChild2.toString());
    }
}
