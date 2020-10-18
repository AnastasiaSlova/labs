import java.util.Random;

public class task6 {
    public static void main(String[] args) {
        Random random = new Random();

        int firstArray[][] = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                firstArray[i][j] = random.nextInt(200);
                System.out.print(firstArray[i][j] + " ");

            }
            System.out.println();
        }

        int deleteS = random.nextInt(4);
        int deleteK = random.nextInt(4);


        System.out.println("deleteS= " + deleteS + "; deleteK= " + deleteK);

        int secondArray[][] = new int[5][5];
        int deleteSInd = 0;
        int deleteKInd = 0;
        for (int i = 0; i < secondArray.length;i++) {
//            удаление строки
            if (deleteS != i){
                deleteSInd= i;
                for (int j = 0; j < secondArray[i].length; j++) {
//                    удаление столбца
                    if (deleteK != j){
                        deleteKInd= j;
                        secondArray[i][j] = firstArray[deleteSInd][deleteKInd];
                        System.out.print(secondArray[i][j]+" ");
                    } else {
                        deleteKInd++;
                        continue;
                    }
                }
                System.out.println();
            } else {
                deleteSInd++;
                continue;
            }
        }
    }
}
