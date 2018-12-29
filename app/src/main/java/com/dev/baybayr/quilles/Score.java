package com.dev.baybayr.quilles;

import android.support.design.widget.Snackbar;

import java.util.ArrayList;

/**
 * Class that stores the score of a player for a round.
 */
public class Score
{
    /**
     * Class representing a single throw.
     */
    private class Throw
    {
        Integer range;
        Integer result;
        Boolean played;

        /**
         * Constructor.
         * @param range Range of the throw.
         */
        Throw(Integer range)
        {
            this.range = range;
            this.played = false;
            this.result = 0;
        }
    }

    // List containing each throw for a round.
    private ArrayList<Throw> scores = new ArrayList<>();

    /**
     * Private constructor.
     * @param fiveMeters Number of throw at 5 meters.
     * @param tenMeters Number of throw at 10 meters.
     * @param fithteenMeters Number of throw at 15 meters.
     * @param twentyMeters Number of throw at 20 meters.
     */
    public Score(Integer fiveMeters, Integer tenMeters, Integer fithteenMeters, Integer twentyMeters)
    {
        // There is always a 1 meter throw.
        scores.add(new Throw(1));

        for (int i = 0; i < fiveMeters; i++)
        {
            scores.add(new Throw(5));
        }
        for (int i = 0; i < tenMeters; i++)
        {
            scores.add(new Throw(10));
        }
        for (int i = 0; i < fithteenMeters; i++)
        {
            scores.add(new Throw(15));
        }
        for (int i = 0; i < twentyMeters; i++)
        {
            scores.add(new Throw(20));
        }
    }

    /**
     * Return the range of the throw at the given index.
     * @param throwNumber Index of the throw.
     * @return Range of the throw.
     */
    public Integer getRange(Integer throwNumber)
    {
        return scores.get(throwNumber).range;
    }

    /**
     * Return the result of the throw at the given index.
     * @param throwNumber Index of the throw.
     * @return Result of the throw.
     */
    public Integer getResult(Integer throwNumber)
    {
        return scores.get(throwNumber).result;
    }

    /**
     * Return if the throw at the given index has been played or not.
     * @param throwNumber Index of the throw.
     * @return True if the throw has already been played.
     */
    public Boolean getPlayed(Integer throwNumber)
    {
        return scores.get(throwNumber).played;
    }

    /**
     * Set the result of the throw at the given index.
     * @param throwNumber Index of the throw.
     * @return True if set for the first time.
     */
    public Boolean setResult(Integer throwNumber, Integer result)
    {
        scores.get(throwNumber).result = result;

        // Return false if the throw was already set.
        if (scores.get(throwNumber).played == true)
        {
            return false;
        }
        else
        {
            scores.get(throwNumber).played = true;
            return true;
        }
    }
}
