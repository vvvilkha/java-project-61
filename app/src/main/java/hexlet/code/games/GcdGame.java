package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GcdGame {
    private static final int MAX_NUMBER = 100;
    private static final int ROUNDS_COUNT = 3;

    public static void start() {
        String gameDescription = "Find the greatest common divisor of given numbers.";
        String[] questions = new String[ROUNDS_COUNT];
        String[] correctAnswers = new String[ROUNDS_COUNT];

        Random random = new Random();

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int num1 = random.nextInt(MAX_NUMBER - 1) + 1; // избегаем нуля
            int num2 = random.nextInt(MAX_NUMBER - 1) + 1;

            questions[i] = num1 + " " + num2;
            correctAnswers[i] = Integer.toString(gcd(num1, num2));
        }

        Engine.run(gameDescription, questions, correctAnswers);
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
