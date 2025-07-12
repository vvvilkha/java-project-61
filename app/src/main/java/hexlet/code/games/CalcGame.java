package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class CalcGame {
    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_NUMBER = 100;
    private static final char[] OPERATIONS = {'+', '-', '*'};

    public static void start() {
        String gameDescription = "What is the result of the expression?";
        String[][] roundsData = new String[ROUNDS_COUNT][2];

        Random random = new Random();

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int num1 = random.nextInt(MAX_NUMBER);
            int num2 = random.nextInt(MAX_NUMBER);
            char operation = OPERATIONS[random.nextInt(OPERATIONS.length)];

            String question = num1 + " " + operation + " " + num2;
            String answer = calculate(num1, num2, operation);

            roundsData[i][0] = question;
            roundsData[i][1] = answer;
        }

        Engine.run(gameDescription, roundsData);
    }

    private static String calculate(int num1, int num2, char operations) {
        return switch (operations) {
            case '+' -> Integer.toString(num1 + num2);
            case '-' -> Integer.toString(num1 - num2);
            case '*' -> Integer.toString(num1 * num2);
            default -> throw new IllegalStateException("Unexpected operator: " + operations);
        };
    }
}


