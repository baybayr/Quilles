package com.dev.baybayr.quilles;

import java.util.ArrayList;

/**
 * Class that represent a game with several players.
 */
public class Game
{
    // List of players.
    private ArrayList<Player> players = new ArrayList<>();
    private Integer numberOfRound = 0;

    /**
     * Get the player at the given index.
     * @param playerNb Player's index.
     * @return The player.
     */
    public Player getPlayer(Integer playerNb)
    {
        return players.get(playerNb);
    }

    /**
     * Get the number of players.
     * @return The number of players.
     */
    public Integer getNumberOfPlayer()
    {
        return players.size();
    }

    /**
     * Return the number of round in the game.
     * @return The number of round.
     */
    public Integer getNumberOfRound()
    {
        return numberOfRound;
    }

    /**
     * Add a player to the game.
     * @param player Player to add.
     */
    public void addPlayer(Player player)
    {
        players.add(player);
    }

    /**
     * Add a round to the game.
     */
    public void addRound()
    {
        numberOfRound++;
        for (Player player : players)
        {
            player.addRound();
        }
    }
}
