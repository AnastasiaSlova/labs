package task2;

public class Main {
    public static void main(String[] args) {
        ExampleParent exampleParent = new ExampleParent("Parent");
        System.out.println(exampleParent.toString());
        ExampleChild exampleChild = new ExampleChild(exampleParent.getParam(), exampleParent.getParamLengths());
        System.out.println(exampleChild.toString());
        exampleChild.setParam();
        System.out.println(exampleChild.toString());
        exampleChild.setParam(33);
        System.out.println(exampleChild.toString());
        exampleChild.setParam("Parent param");
        System.out.println(exampleChild.toString());
    }
}
