public class task3 {
    public static void main(String[] args) {
        Example example = new Example();
        System.out.println(example.toString());
        Example example1 = new Example(1);
        System.out.println(example1.toString());
        Example example2 = new Example(2, 3);
        System.out.println(example2.toString());
    }

    public static class Example {
        private static int a;
        private static int b;

        public Example(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public Example(int a) {
            this.a = a;
        }

        public Example() {
        }

        @Override
        public String toString() {
            return "Example{" +
                    "a=" + a +
                    ", b=" + b +
                    '}';
        }
    }
}
