package hexlet.code.games;

import hexlet.code.Game;
import java.util.Random;

public class ProgressionGame implements Game {
    private final Random random = new Random();
    private int correctAnswer;

    public String getQuestion() {
    int length = random.nextInt(6)+5;
    int start = random.nextInt(100);
    int maxStep = (100 - start) / (length -1);
        if (maxStep <=0){
            maxStep = 1;
        }
    int step = random.nextInt(maxStep)+1;
    int hiddenIndex = random.nextInt(length);

    return createProgression(start, step, length, hiddenIndex);
    }

    public String getCorrectAnswer() {
        return String.valueOf(correctAnswer);
    }

    public void start() {
        System.out.println("What number is missing in the progression?");
    }
    private String createProgression(int start, int step, int length, int hiddenIndex){
        StringBuilder progression = new StringBuilder();
        for (int i = 0; i < length; i++){
            if (i == hiddenIndex) {
                progression.append("... ");
                correctAnswer = start + i * step;
            } else {
                progression.append(start + i * step).append(" ");
                }
            }
            return progression.toString().trim();
        }
    }
