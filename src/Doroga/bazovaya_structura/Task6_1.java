package Doroga.bazovaya_structura;

import java.util.Scanner;

public class Task6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String greeting = scanner.nextLine();
        printAnswer(greeting);
    }
        static void printAnswer(String greeting) {
            String answer;
            switch (greeting) {
                case "Hi":
                    answer = "Hello";
                    break;
                case "Bye":
                    answer = "Good bye";
                    break;
                case "How are you":
                    answer = "How are you doing";
                    break;
                default:
                    answer = "Unknown message";
            }
            log(answer);

        }
        static void log (String answer) {
                System.out.println(answer);

            }
        }


