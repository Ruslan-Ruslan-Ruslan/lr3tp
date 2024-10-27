import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запит користувача на введення речення
        System.out.println("Введіть речення: ");
        String sentence = scanner.nextLine();

        // Перевірка типу речення
        if (sentence.endsWith("!")) {
            System.out.println("Це окличне речення.");
        } else if (sentence.endsWith("?")) {
            System.out.println("Це питальне речення.");
        } else {
            System.out.println("Це звичайне речення.");
        }
        scanner.close();
    }
}



