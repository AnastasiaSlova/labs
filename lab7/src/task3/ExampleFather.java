package task3;

public class ExampleFather extends ExampleGrandpa {
    public char charFather;

    public ExampleFather(int intGrandpa, char charFather) {
        super(intGrandpa);
        this.charFather = charFather;
    }

    public void setParam(int intGrandpa, char charFather) {
        super.setParam(intGrandpa);
        this.charFather = charFather;
    }

    @Override
    public String toString() {
        return "ExampleFather{" +
                "charFather=" + charFather +
                "} " + super.toString();
    }
}
