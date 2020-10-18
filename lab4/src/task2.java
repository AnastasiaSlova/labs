public class task2 {
    public static void main(String[] args) {
        char[] c = {' ', ' ', '/', '\\', ' ', ' ',};
        try {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < c.length; j++) {
                    System.out.print(c[j]);
                }
                System.out.println();
                c[1-i] = c[2-i];
                c[2-i] = ' ';
                c[4+i] = c[3+i];
                c[3+i] = ' ';
            }
        } catch (Exception e){
            System.out.println("______");
        }
    }
}
