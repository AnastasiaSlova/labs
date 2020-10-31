package task3;

public class ExampleSon extends ExampleFather {
    public String stringSon;

    public ExampleSon(int intGrandpa, char charFather, String stringSon) {
        super(intGrandpa, charFather);
        this.stringSon = stringSon;
    }

    public void setParam(int intGrandpa, char charFather, String stringSon) {
        super.setParam(intGrandpa, charFather);
        this.stringSon = stringSon;
    }

    @Override
    public String toString() {
        return "ExampleSon{" +
                "stringSon='" + stringSon + '\'' +
                "} " + super.toString();
    }
}
