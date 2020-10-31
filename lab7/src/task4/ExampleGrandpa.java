package task4;

public class ExampleGrandpa {
    public char charGrandpa;

    public ExampleGrandpa(char charGrandpa) {
        this.charGrandpa = charGrandpa;
    }

    public ExampleGrandpa(ExampleGrandpa exampleGrandpa) throws CloneNotSupportedException {
        this(exampleGrandpa.charGrandpa);
    }

    @Override
    public String toString() {
        return "ExampleGrandpa{" +
                "charGrandpa=" + charGrandpa +
                '}';
    }
}
