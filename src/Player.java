package quessing;

/**
 * Created by $(USER) on $ (DATE).
 */
public class Player {

    private final String name;
    private int guessQueue;
    private int randomNumber;

    public Player(String name, int guessQueue) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getGuessQueue() {
        return guessQueue;
    }

    public void setGuessQueue(int guessQueue) {
        this.guessQueue = guessQueue;
    }

    public int getRandomNumber() { return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public String toString() {
        return name;
    }

}
