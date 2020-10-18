import java.util.Scanner;

public class task8 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите фразу: ");
        String word = scanner.nextLine();
        System.out.println("Введите ключ: ");
        int key = scanner.nextInt();

        String codingWord = coding(word, key);
        System.out.println("Текст после преобразования : " + codingWord);
        System.out.println("Выполнить обратное преобразование? (y/n)");

        userInterface(codingWord, key);
    }

    public static void userInterface(String codingWord, int key) {
        String reply = scanner.nextLine();

        switch (reply) {
            case "y":
                coding(codingWord.toString(), -key);
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

    public static String coding(String codingWord, int key) {
        StringBuilder word = new StringBuilder();
        for (char c : codingWord.toCharArray()) {
            char r = (char) (c - key);
            word.append(r);
        }
        System.out.println(word);
        return word.toString();
    }
}
