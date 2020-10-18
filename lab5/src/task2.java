public class task2 {

    public static void main(String[] args) {

        Example example = new Example();
        example.setStart('A');
        example.setStop('C');
        System.out.println(example.getResult());
    }

    public static class Example {
        private static char start;
        private static char stop;

        public void setStart(char start) {
            this.start = start;
        }

        public void setStop(char stop) {
            this.stop = stop;
        }

        public String getResult() {
            Integer startInt = new Integer(start);
            Integer stopInt = new Integer(stop);
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i <= stopInt - startInt; i++) {
                char c = (char) (start + i);
                builder.append(c + " ");
            }
            return builder.toString();
        }
    }
}
