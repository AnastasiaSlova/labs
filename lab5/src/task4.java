public class task4 {
    public static void main(String[] args) {

        Example example = new Example(1, 'w');
        System.out.println(example.toString());

        Example example1 = new Example(65.2211);
        System.out.println(example1.toString());

    }
    public static class Example{
        private static int a;
        private static char b;

        public Example(int a, char b) {
            this.a = a;
            this.b = b;
        }

        public Example(double d) {
            String s = String.valueOf(d);
            this.a = Integer.parseInt(s.split("\\.")[1].substring(0,2));
            this.b = (char)Integer.parseInt(s.split("\\.")[0]);
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
