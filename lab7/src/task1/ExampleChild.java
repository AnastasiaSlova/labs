package task1;

public class ExampleChild extends ExampleParent {

    private String stringChild;

    public ExampleChild(String string) {
        super(string);
    }

    public ExampleChild(String string, String stringChild) {
        super(string);
        this.stringChild = stringChild;
    }

    @Override
    public String toString() {
        return "ExampleChild{" +
                "stringChild='" + stringChild + '\'' +
                "} " + super.toString();
    }
}
