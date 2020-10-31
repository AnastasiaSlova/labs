package task4;

public class ExampleSon extends ExampleFather {
    public int intSon;

    public ExampleSon(char charGrandpa, String stringFather, int intSon) {
        super(charGrandpa, stringFather);
        this.intSon = intSon;
    }

    public ExampleSon(ExampleSon exampleSon) throws CloneNotSupportedException {
        this(exampleSon.charGrandpa, exampleSon.stringFather, exampleSon.intSon);
    }

    @Override
    public String toString() {
        return "ExampleSon{" +
                "intSon=" + intSon +
                "} " + super.toString();
    }
}
