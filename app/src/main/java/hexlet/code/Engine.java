package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int ROUNDS = 3;

    public static void startGame(Game game){

        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + " !");

        game.start();

        for (int i = 0; i < ROUNDS; i++){
            String question = game.getQuestion();
            System.out.println("Question: " + question);
            System.out.println("Your answer: ");
            String answer = scanner.nextLine();

        if (!answer.equals(game.getCorrectAnswer())){
            System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.%n", answer, game.getCorrectAnswer());
            System.out.println("Let's try again, " + name + "!");
            return;

        }
            System.out.println("Correct!");
    }
        System.out.println("Congratulations, " + name + "!");
}
}
