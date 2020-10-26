package task1;

public class Example {
    private String s;
    private char c;

    public void setField(String s) {
        this.s = s;
    }

    public void setField(char s) {
        this.c = s;
    }

    public void setField(char[] s) {
        if (s.length == 1) {
            this.c = s[0];
        } else {
            this.s = String.copyValueOf(s);
        }
    }

    @Override
    public String toString() {
        return "Example{" +
                "s='" + s + '\'' +
                ", c=" + c +
                '}';
    }
}
