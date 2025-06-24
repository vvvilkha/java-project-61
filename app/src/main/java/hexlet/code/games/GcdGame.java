package hexlet.code.games;

import hexlet.code.Game;
import java.util.Random;

public final class GcdGame implements Game {
    private final Random random = new Random();
    private static final int MAX_NUMBER = 100;
    private int num1;
    private int num2;
    private int correctAnswer;

    public void start() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public String getQuestion() {
        int num1 = random.nextInt(MAX_NUMBER);
        int num2 = random.nextInt(MAX_NUMBER);
        correctAnswer = calculateGcd(num1, num2);
        return num1 + " " + num2;
    }

    public String getCorrectAnswer() {
        return String.valueOf(correctAnswer);
    }

    private int calculateGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
