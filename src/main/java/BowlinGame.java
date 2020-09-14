public class BowlinGame {
    public int calculateScore(int[] score) {
        int totalScore = 0;
        for (int i = 0; i < 10; ++i) {
            if (score[i] == 10) {
                totalScore += score[i] + score[i + 1] + score[i + 2];
            }
        }
        return totalScore;
    }
}
