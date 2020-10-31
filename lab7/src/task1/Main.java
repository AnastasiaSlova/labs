package task1;

public class Main {
    public static void main(String[] args) {

        ExampleParent exampleParent = new ExampleParent("Parent");
        System.out.println(exampleParent.toString());

        ExampleChild exampleChild = new ExampleChild("ParentField", "Child");
        System.out.println(exampleChild.toString());

        ExampleChild exampleChild1 = new ExampleChild("ParentField");
        System.out.println(exampleChild1.toString());
    }
}
