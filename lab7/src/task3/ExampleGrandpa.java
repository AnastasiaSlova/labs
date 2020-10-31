package task3;

public class ExampleGrandpa {
    public int intGrandpa;

    public ExampleGrandpa(int intGrandpa) {
        this.intGrandpa = intGrandpa;
    }

    public void setParam(int intGrandpa) {
        this.intGrandpa = intGrandpa;
    }

    @Override
    public String toString() {
        return "ExampleGrandpa{" +
                "intGrandpa=" + intGrandpa +
                '}';
    }
}
