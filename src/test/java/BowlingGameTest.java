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
}
