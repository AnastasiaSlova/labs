package task5;

public class ExampleParent {
    private String parentString;

    public ExampleParent(String parentString) {
        this.parentString = parentString;
    }

    @Override
    public String toString() {
        return "ExampleParent{" +
                "parentString='" + parentString + '\'' +
                '}';
    }
}
