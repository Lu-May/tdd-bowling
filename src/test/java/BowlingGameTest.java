import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    @Test
    void should_return_0_when_the_ball_is_not_knocked_down() {
        BowlinGame bowlinGame = new BowlinGame();
        int[] score = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int totalScore = bowlinGame.calculateScore(score);
        assertEquals(0, totalScore);
    }

    @Test
    void should_return_full_score_when_bowling_strike() {
        BowlinGame bowlinGame = new BowlinGame();
        int[] score = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int totalScore = bowlinGame.calculateScore(score);
        assertEquals(300, totalScore);
    }

    @Test
    void should_return_total_score_when_the_tenth_is_strike() {
        BowlinGame bowlinGame = new BowlinGame();
        int[] score = {1, 1, 10, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 10, 1, 1};
        int totalScore = bowlinGame.calculateScore(score);
        assertEquals(40, totalScore);
    }
}
