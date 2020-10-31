package task4;

public class ExampleFather extends ExampleGrandpa {
    public String stringFather;

    public ExampleFather(char charGrandpa, String stringFather) {
        super(charGrandpa);
        this.stringFather = stringFather;
    }

    public ExampleFather(ExampleFather exampleFather) throws CloneNotSupportedException {
        this(exampleFather.charGrandpa, exampleFather.stringFather);
    }

    @Override
    public String toString() {
        return "ExampleFather{" +
                "stringFather='" + stringFather + '\'' +
                "} " + super.toString();
    }
}
