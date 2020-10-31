package task5;

public class ExampleChild2 extends ExampleParent {
    private char charChildren;

    public ExampleChild2(String parentString, char charChildren) {
        super(parentString);
        this.charChildren = charChildren;
    }

    @Override
    public String toString() {
        return "ExampleChild2{" +
                "charChildren=" + charChildren +
                "} " + super.toString();
    }
}
