package com.isagoksu;

/**
 * Last update date: Jul 13, 2009, 9:39:25 PM
 *
 * @author isa
 * @version 1.0
 */
public class RockPaperScissorEvaluator {
    public static enum Hand {
        ROCK,
        PAPER,
        SCISSOR
    }

    public Integer evaluate(Hand side1, Hand side2) {
        if (side1.equals(Hand.ROCK) && !side2.equals(Hand.ROCK)) {
            return (side2.equals(Hand.SCISSOR)) ? 1 : -1;
        } else if (side1.equals(Hand.SCISSOR) && !side2.equals(Hand.SCISSOR)) {
            return (side2.equals(Hand.PAPER)) ? 1 : -1;
        } else if (side1.equals(Hand.PAPER) && !side2.equals(Hand.PAPER)) {
            return (side2.equals(Hand.ROCK)) ? 1 : -1;
        }

        return 0;
    }
}
