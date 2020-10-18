import java.util.Random;

public class task5 {
    public static void main(String[] args) {
        int [][] arr = new int[3][5];
        int [][] arr2 = new int[5][3];
        Random random = new Random();
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                arr[i][j] = random.nextInt(100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i<arr2.length; i++){
            for (int j = 0; j<arr2[i].length; j++){
                arr2[i][j] = arr[j][i];
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
