package hexlet.code.games;

import hexlet.code.Game;
import java.util.Random;

public class CalcGame implements Game {
    private final Random random = new Random();
    private String correctAnswer;

    @Override
    public String getQuestion(){
        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);
        String operator = getRandomOperator();
        correctAnswer = calculate(num1, num2, operator);
        return num1 + " " + operator + " " + num2;

    }
    @Override
    public String getCorrectAnswer() {
        return correctAnswer;
    }
    public String getRandomOperator(){
        String[] operators = {"+", "-", "*"};
        return operators[random.nextInt(operators.length)];
    }
    public void start() {
        System.out.println("What is the result of the expression?");
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
