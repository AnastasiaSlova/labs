public class task1 {
    public static void main(String[] args) {
        int height = 11;
        while (true) {
            if (height == 11) {
                System.out.println("_______________________");
                height--;
            } else if (height != 0) {
                System.out.println("|                     |");
                height--;
            } else {
                System.out.println("|_____________________|");
                break;
            }
        }
    }
}
