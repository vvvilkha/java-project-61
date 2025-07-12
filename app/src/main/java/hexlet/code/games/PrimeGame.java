package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;

public final class PrimeGame {
    private static final int MAX_NUMBER = 100;
    private static final int ROUNDS_COUNT = 3;

    public static void start() {
        String gameDescription = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] roundsData = new String[ROUNDS_COUNT][2];

        Random random = new Random();

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int number = random.nextInt(MAX_NUMBER - 2) + 2;
            String question = String.valueOf(number);
            String answer = isPrime(number) ? "yes" : "no";

            roundsData[i][0] = question;
            roundsData[i][1] = answer;
        }

        Engine.run(gameDescription, roundsData);
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
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
