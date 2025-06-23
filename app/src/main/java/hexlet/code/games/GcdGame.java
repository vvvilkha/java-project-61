package hexlet.code.games;

import hexlet.code.Game;
import java.util.Random;

public class GcdGame implements Game {
    private final Random random = new Random();
    private int correctAnswer;


    public String getQuestion(){
        int num1 = random.nextInt(150);
        int num2 = random.nextInt(150);
        correctAnswer = calculateGcd(num1,num2);
        return num1 + " " + num2;
    }
    public String getCorrectAnswer() {
        return String.valueOf(correctAnswer);
}
    private int calculateGcd(int a, int b){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}