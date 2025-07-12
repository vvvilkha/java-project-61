package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GcdGame {
    private static final int MAX_NUMBER = 100;
    private static final int ROUNDS_COUNT = 3;

    public static void start() {
        String gameDescription = "Find the greatest common divisor of given numbers.";
        String[][] roundsData = new String[ROUNDS_COUNT][2];

        Random random = new Random();

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int num1 = random.nextInt(MAX_NUMBER - 1) + 1;
            int num2 = random.nextInt(MAX_NUMBER - 1) + 1;

            String question = num1 + " " + num2;
            String answer = String.valueOf(gcd(num1, num2));

            roundsData[i][0] = question;
            roundsData[i][1] = answer;
        }

        Engine.run(gameDescription, roundsData);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
