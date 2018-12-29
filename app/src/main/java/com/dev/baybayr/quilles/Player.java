package com.dev.baybayr.quilles;

import java.util.ArrayList;

/**
 * Represent a player.
 */
public class Player
{
    /**
     * Gender of a player.
     */
    public enum Gender
    {
        MALE,
        FEMALE
    }

    /**
     * Category of a player.
     */
    public enum Category
    {
        JUNIOR,
        CADET,
        SENIOR
    }

    private Gender gender;
    private Category category;
    private String name;
    // List containing the scores for each round.
    private ArrayList<Score> scores = new ArrayList<>();

    /**
     * Constructor.
     * @param gender Player's gender.
     * @param category Player's category.
     * @param name Player's name.
     */
    public Player(Gender gender, Category category, String name)
    {
        this.name = name;
        this.gender = gender;
        this.category = category;
    }

    /**
     * Get the player's gender.
     * @return The gender.
     */
    public Gender getGender()
    {
        return gender;
    }

    /**
     * Get the player's category.
     * @return The category.
     */
    public Category getCategory()
    {
        return category;
    }

    /**
     * Get the player's name.
     * @return The name.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Add a new round to the player scores.
     */
    public void addRound()
    {
        // TODO proofread the scores ranges.
        if (category == Category.JUNIOR)
        {
            scores.add(new Score(3, 5, 0, 0));
        }
        else if (gender == Gender.MALE && category == Category.SENIOR
                || gender == Gender.FEMALE)
        {
            scores.add(new Score(3, 3, 2, 0));
        }
        else if (gender == Gender.MALE && category == Category.CADET)
        {
            scores.add(new Score(2, 3, 2, 1));
        }
    }

    /**
     * Get the player's score for the given round.
     * @param round Round number.
     * @return The Score.
     */
    public Score getScore(Integer round)
    {
        return scores.get(round);
    }
}
