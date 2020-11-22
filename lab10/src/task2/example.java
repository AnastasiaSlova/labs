package task2;

import java.io.*;

public class example {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
// Создание потоков
            br = new BufferedReader(new InputStreamReader(new FileInputStream("lab10\\src\\task2\\Новый текстовый документ.txt"), "cp1251"));
            out = new PrintWriter("lab10\\src\\task2\\Новый текстовый документ2.txt", "cp1251");
// Переписывание информации из одного файла в другой
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                if (lineCount == 2) {
                    out.println(lineCount + ": " + s);
                }
                for (int i = 0; i < s.split(" ").length; i++) {
                    if (isNumber(s.split(" ")[i])){
                        double d = Double.parseDouble(s.split(" ")[i]);
                        if (d>=0){
                            out.println(i + ": " + d);
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!");
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
    public static boolean isNumber(String s) {
        try {
            double i = Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
