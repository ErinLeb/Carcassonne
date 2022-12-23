package domino.model;

import shared.model.Player;

/**
 * Represents a player of the domino game.
 */
public class PlayerDomino extends Player {
    private static int nbPlayers;

    private int id;
    protected String name;

    // Constructors
    public PlayerDomino() {
        id = nbPlayers++;
        score = 0;
        name = "Player " + id;
    }

    public PlayerDomino(String name) {
        id = nbPlayers++;
        score = 0;
        this.name = name;
    }

    // Getters

    public static int getNbPlayers() {
        return nbPlayers;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getScore() {
        return score;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    // Methods

    /**
     * Prints the player's id, name and score.
     */
    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Player " + id + " : " + name + "\nScore : " + score;
    }

}
