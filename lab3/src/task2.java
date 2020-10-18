import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input text");
        String day = in.nextLine();
        System.out.println("switch case");
        switch (day) {
            case "Monday":
                System.out.println(1);
                break;
            case "Tuesday":
                System.out.println(2);
                break;
            case "Wednesday":
                System.out.println(3);
                break;
            case "Thursday":
                System.out.println(4);
                break;
            case "Friday":
                System.out.println(5);
                break;
            case "Saturday":
                System.out.println(6);
                break;
            case "Sunday":
                System.out.println(7);
                break;
            default:
                System.out.println("you entered an incorrect value");
                break;
        }
        System.out.println("if else case");
        if (day.equals("Monday")) {
            System.out.println(1);
        } else if (day.equals("Tuesday")) {
            System.out.println(2);
        } else if (day.equals("Wednesday")) {
            System.out.println(3);
        } else if (day.equals("Thursday")) {
            System.out.println(4);
        } else if (day.equals("Friday")) {
            System.out.println(5);
        } else if (day.equals("Saturday")) {
            System.out.println(6);
        } else if (day.equals("Sunday")) {
            System.out.println(7);
        } else {
            System.out.println("you entered an incorrect value");
        }
    }
}