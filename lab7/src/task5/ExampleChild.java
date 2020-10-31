package task5;

public class ExampleChild extends ExampleParent {
    private int intChildren;

    public ExampleChild(String parentString, int intChildren) {
        super(parentString);
        this.intChildren = intChildren;
    }

    @Override
    public String toString() {
        return "ExampleChild{" +
                "intChildren=" + intChildren +
                "} " + super.toString();
    }
}
