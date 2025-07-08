package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class CalcGame {
    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_NUMBER = 100;

    public static void start() {
        String gameDescription = "What is the result of the expression?";
        String[] questions = new String[ROUNDS_COUNT];
        String[] correctAnswers = new String[ROUNDS_COUNT];

        Random random = new Random();
        String[] operators = {"+", "-", "*"};

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int num1 = random.nextInt(MAX_NUMBER);
            int num2 = random.nextInt(MAX_NUMBER);
            String operator = operators[random.nextInt(operators.length)];

            questions[i] = num1 + " " + operator + " " + num2;
            correctAnswers[i] = calculateAnswer(num1, num2, operator);

        }

        Engine.run(gameDescription, questions, correctAnswers);
    }

    private static String calculateAnswer(int num1, int num2, String operator) {
        return switch (operator) {
            case "+" -> Integer.toString(num1 + num2);
            case "-" -> Integer.toString(num1 - num2);
            case "*" -> Integer.toString(num1 * num2);
            default -> throw new IllegalStateException("Unexpected operator: " + operator);
        };
    }
}


