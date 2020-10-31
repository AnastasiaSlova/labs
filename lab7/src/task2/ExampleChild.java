package task2;

public class ExampleChild extends ExampleParent {
    public int intChildren;

    public ExampleChild(String parentString, int intChildren) {
        super(parentString);
        this.intChildren = intChildren;
    }

    public void setParam(String parentString, int intChildren) {
        super.setParam(parentString);
        this.intChildren = intChildren;
    }

    public void setParam(int intChildren) {
        super.setParam();
        this.intChildren = intChildren;
    }

    @Override
    public void setParam(String parentString) {
        super.setParam(parentString);
        this.intChildren = parentString.length();
    }

    @Override
    public void setParam() {
        super.setParam();
        this.intChildren = super.getParamLengths();
    }

    @Override
    public String toString() {
        return "ExampleChild{" +
                "intChildren=" + intChildren +
                "} " + super.toString();
    }
}
