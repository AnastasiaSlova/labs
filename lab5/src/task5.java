public class task5 {
    public static void main(String[] args) {

        Example example = new Example(3);
        System.out.println(example.toString());
        example.setA();
        System.out.println(example.toString());
        example.setA(1000);
        System.out.println(example.toString());
    }

    public static class Example{
        private static int a;

        public Example(int a) {
            this.a = checkNumb(a);
        }

        public void setA() {
            this.a = 0;
        }

        public void setA(int a) {
            this.a = checkNumb(a);
        }

        private int checkNumb(int i){
            if (i>100){
                return 100;
            } else {
                return i;
            }
        }

        @Override
        public String toString() {
            return "Example{" +
                    "a=" + a +
                    '}';
        }
    }
}
