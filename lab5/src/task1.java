public class task1 {
    public static void main(String[] args) {
        Example example = new Example();
        example.setC('C');
        System.out.println(example.getCIndex());
        System.out.println(example.getC_Index());
    }

    public static class Example {
        private static char c;

        public Example() {
        }

        public void setC(char c) {
            this.c = c;
        }

        public Integer getCIndex() {
            return new Integer(c);
        }

        public String getC_Index() {
            return "Symbol: " + c + " Code: " + getCIndex();
        }
    }
}

