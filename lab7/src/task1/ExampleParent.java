package task1;

public class ExampleParent {
    private String string;

    public ExampleParent(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    @Override
    public String toString() {
        return "ExampleParent{" +
                "string='" + string + '\'' +
                '}';
    }
}
