package hexlet.code.games;

import hexlet.code.Game;
import java.util.Random;

public final class PrimeGame implements Game {
    private final Random random = new Random();
    private static final int MAX_NUMBER = 100;
    private int correctAnswer;

    public void start() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public String getQuestion() {
        correctAnswer = random.nextInt(MAX_NUMBER);
        return String.valueOf(correctAnswer);
    }
    public String getCorrectAnswer() {
        return isPrime(correctAnswer) ? "yes" : "no";
    }
    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
