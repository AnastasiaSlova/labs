package task2;

public class ExampleParent {
    private String parentString;

    public ExampleParent(String parentString) {
        this.parentString = parentString;
    }

    public String getParam() {
        return parentString;
    }

    public int getParamLengths() {
        return parentString.length();
    }

    public void setParam(String parentString) {
        this.parentString = parentString;
    }

    public void setParam() {
        this.parentString = "qwe";
    }

    @Override
    public String toString() {
        return "ExampleParent{" +
                "parentString='" + parentString + '\'' +
                '}';
    }
}
