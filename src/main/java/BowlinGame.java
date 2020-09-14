public class BowlinGame {
    public int calculateScore(int[] score) {
        int totalScore = 0;
        for (int i = 0; i < score.length - 2; ++i) {
            if (score[i] == 10) {
                totalScore += score[i] + score[i + 1] + score[i + 2];
            }
            else if ((score[i] + score[i + 1]) == 10) {
                totalScore += 10 + score[i + 2];
                i++;
            } else {
                totalScore += score[i];
            }
        }
        return totalScore;
    }
}
