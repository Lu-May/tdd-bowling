import java.util.Arrays;

public class BowlinGame {
    public int calculateScore(int[] score) {
        int totalScore = 0;
        if (theTenthIsNotSPareOrStrike(score)) {
            totalScore = getTotalScore(score, totalScore);
            return totalScore + score[score.length - 2] + score[score.length - 1];
        }
        totalScore = getTotalScore(score, totalScore);
        return totalScore;
    }

    private boolean theTenthIsNotSPareOrStrike(int[] score) {
        return score[score.length - 3] != 10 && (score[score.length - 3] + score[score.length - 2]) != 10;
    }

    private int getTotalScore(int[] score, int totalScore) {
        for (int i = 0; i < score.length - 2; ++i) {
            if (score[i] == 10) {
                totalScore += score[i] + score[i + 1] + score[i + 2];
            } else if ((score[i] + score[i + 1]) == 10) {
                totalScore += 10 + score[i + 2];
                i++;
            } else {
                totalScore += score[i];
            }
        }
        return totalScore;
    }
}
