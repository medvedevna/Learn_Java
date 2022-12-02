package Doroga.bazovaya_structura;

import java.util.Scanner;

public class Task3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        switch (a) {
            case "Hi":
                System.out.println("Hello");
                break;
            case "Bye":
                System.out.println("Good bye");
                break;
            case "How are you":
                System.out.println("How are you doing");
                break;
            default:
                System.out.println("Unknown message");
        }
    }
}
