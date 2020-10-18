public class task6 {
    public static void main(String[] args) {
        Example example = new Example(1, 2);
        System.out.println(example.toString());
        example.setField(3);
        System.out.println(example.toString());
        example.setField(3, 4);
        System.out.println(example.toString());
    }
    public static class Example{
        private static int max;
        private static int min;

        public Example(int max, int min) {
            if (max>=min){
                Example.max = max;
                Example.min = min;
            } else {
                Example.max = min;
                Example.min = max;
            }

        }

        public static void setField(int max, int min) {
            if (max>=min){
                Example.max = max;
                Example.min = min;
            } else {
                Example.max = min;
                Example.min = max;
            }
        }

        public static void setField(int min) {
            if (max>=min){
                Example.min = min;
            } else {
                Example.min = max;
                Example.max = min;
            }
        }

        @Override
        public String toString() {
            return "Example{" +
                    "max=" + max +
                    ", min=" + min +
                    '}';
        }
    }
}
