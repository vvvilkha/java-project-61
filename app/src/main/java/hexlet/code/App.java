package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;
import java.util.Scanner;

public class App {
    private static final int GREET = 1;
    private static final int EVEN_GAME = 2;
    private static final int CALC_GAME = 3;
    private static final int GCD_GAME = 4;
    private static final int PROGRESSION_GAME = 5;
    private static final int PRIME_GAME = 6;
    private static final int EXIT = 0;

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        System.out.println(" ");

        switch (choice) {
            case GREET:
                Cli.greetUser();
                break;
            case EVEN_GAME:
                EvenGame.play();
                break;
            case CALC_GAME:
                Engine.startGame(new CalcGame());
                break;
            case GCD_GAME:
                Engine.startGame(new GcdGame());
                break;
            case PROGRESSION_GAME:
                Engine.startGame(new ProgressionGame());
                break;
            case PRIME_GAME:
                Engine.startGame(new PrimeGame());
                break;
            case EXIT:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;


        }
    }
}
