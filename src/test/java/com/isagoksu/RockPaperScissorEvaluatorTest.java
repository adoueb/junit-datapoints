package com.isagoksu;

import static org.junit.Assert.assertEquals;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * Last update date: Jul 13, 2009, 7:53:09 PM
 *
 * @author isa
 * @version 1.0
 */
@RunWith(Theories.class)
public class RockPaperScissorEvaluatorTest {
    @DataPoint public static RockPaperScissorEvaluator.Hand[] hands1 = { RockPaperScissorEvaluator.Hand.ROCK, RockPaperScissorEvaluator.Hand.SCISSOR };
    @DataPoint public static RockPaperScissorEvaluator.Hand[] hands2 = { RockPaperScissorEvaluator.Hand.SCISSOR, RockPaperScissorEvaluator.Hand.PAPER };
    @DataPoint public static RockPaperScissorEvaluator.Hand[] hands3 = { RockPaperScissorEvaluator.Hand.PAPER, RockPaperScissorEvaluator.Hand.ROCK };

    RockPaperScissorEvaluator evaluator = new RockPaperScissorEvaluator();

    @Theory
    public void testWinners(RockPaperScissorEvaluator.Hand[] sides) {
        assertEquals(new Integer(1), evaluator.evaluate(sides[0], sides[1]));
    }
}

