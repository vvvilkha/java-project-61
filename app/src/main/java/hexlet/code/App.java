package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                """);
        System.out.println("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();

        switch (choice) {
            case "1":
                Engine.greet();
                break;
            case "2":
                EvenGame.start();
                break;
            case "3":
                CalcGame.start();
                break;
            case "4":
                GcdGame.start();
                break;
            case "5":
                ProgressionGame.start();
                break;
            case "6":
                PrimeGame.start();
                break;
            case "0":
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Try again.");
                break;
        }
    }
}
