package hexlet.code.games;

import hexlet.code.Game;
import java.util.Random;

public final class CalcGame implements Game {
    private final Random random = new Random();
    private static final int MAX_NUMBER = 100;
    private int num1;
    private int num2;
    private String correctAnswer;

    public void start() {
        System.out.println("What is the result of the expression?");
    }
    @Override
    public String getQuestion() {
        int num1 = random.nextInt(MAX_NUMBER);
        int num2 = random.nextInt(MAX_NUMBER);
        String operator = getRandomOperator();
        correctAnswer = calculate(num1, num2, operator);
        return num1 + " " + operator + " " + num2;

    }
    @Override
    public String getCorrectAnswer() {
        return correctAnswer;
    }
    public String getRandomOperator() {
        String[] operators = {"+", "-", "*"};
        return operators[random.nextInt(operators.length)];
    }
    private String calculate(int num1, int num2, String operator) {
        switch (operator) {
            case "+":
                return String.valueOf(num1 + num2);
            case "-":
                return String.valueOf(num1 - num2);
            case "*":
                return String.valueOf(num1 * num2);
            default:
                throw new IllegalArgumentException("Неизвестный оператор: " + operator);
        }
    }
}
