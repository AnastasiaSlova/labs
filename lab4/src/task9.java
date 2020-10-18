import java.util.Scanner;

public class task9 {
    static Scanner scanner = new Scanner(System.in);
    static char[] charsLowReg = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };
    static char[] charsUpReg = {
            'A', 'B', 'C', 'D', 'C', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input word");
        String word = in.nextLine();
        System.out.println("Input key");
        int key = in.nextInt();
        if (key > charsUpReg.length) {
            key = key % charsUpReg.length;
        }
        String codingWord = coding(word, key);
        System.out.println("Текст после преобразования : " + codingWord);
        System.out.println("Выполнить обратное преобразование? (y/n)");
        userInterface(codingWord, key);
    }

    public static void userInterface(String codingWord, int key) {
        String reply = scanner.nextLine();

        switch (reply) {
            case "y":
                System.out.println(decoding(codingWord, key));
                break;
            case "n":
                System.out.println("До свидания!");
                break;
            default:
                System.out.println("Введите корректный ответ");
                userInterface(codingWord, key);
                break;
        }
    }

    public static String decoding(String word, int key) {
        int decodingKey = charsLowReg.length - key;
        return coding(word, decodingKey);
    }

    public static String coding(String word, int key) {
        char[] returnWord = new char[word.toCharArray().length];
        for (int i = 0; i < word.toCharArray().length; i++) {
            char s = word.toCharArray()[i];
            if (Character.isUpperCase(s)) {
                returnWord[i] = upperCaseUpdate(s, key);
            } else {
                returnWord[i] = lowCaseUpdate(s, key);
            }
        }

        return new String(returnWord);
    }

    private static char upperCaseUpdate(char s, int key) {
        char returnChar = 0;
        for (int i = 0; i < charsUpReg.length; i++) {
            if (s == charsUpReg[i] && i + key < charsUpReg.length) {
                returnChar = charsUpReg[i + key];
            } else if (s == charsUpReg[i] && i + key > charsUpReg.length) {
                returnChar = charsUpReg[i + key - charsUpReg.length];
            }
        }
        return returnChar;
    }

    private static char lowCaseUpdate(char s, int key) {
        char returnChar = 0;
        for (int i = 0; i < charsLowReg.length; i++) {
            if (s == charsLowReg[i] && i + key < charsLowReg.length) {
                returnChar = charsLowReg[i + key];
            } else if (s == charsLowReg[i] && i + key > charsLowReg.length) {
                returnChar = charsLowReg[i + key - charsLowReg.length];
            }
        }
        return returnChar;
    }
}
