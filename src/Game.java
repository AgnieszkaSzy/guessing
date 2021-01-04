package quessing;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by $(USER) on $ (DATE).
 */
public class Game {

    int playersNumber;

    Scanner input = new Scanner(System.in);

    public Player[] enterPlayers() {
        System.out.println("Welcome to the big guessing number! Enter the number of players:");
        playersNumber = input.nextInt();
        Player[] players = new Player[playersNumber];
        input.nextLine();
        for (int i = 0; i < playersNumber; i++) {
            System.out.println("Enter name " + (i + 1) + " :");
            String name = input.nextLine();
            players[i] = new Player(name, 0);
        }
        return players;
    }

    public void showPlayers(Player[] players) {
        System.out.println("You play in the following order:");
        for (Player player : players) {
            System.out.println(player);
        }
    }

    Random random = new Random();
    int randomNumber = random.nextInt(50);
    boolean endGuessing = false;

    public void guess(Player[] players) {

        do {
            for (int j = 0; j < playersNumber; j++) {
                players[j].setGuessQueue(players[j].getGuessQueue() + 1);
                System.out.println();
                System.out.println("The number chosen by the player: " + (players[j]).getName());
                players[j].setRandomNumber(input.nextInt());
                if (players[j].getRandomNumber() == randomNumber) {
                    input.close();
                    System.out.println(
                            "Congratulations! You guessed it in :" + players[j].getGuessQueue() + " time!");
                    endGuessing = true;
                    break;
                } else {
                    System.out.println("That's not the number!");
                }
            }
        } while
        (!endGuessing);
        System.out.println("The number to guess was the number: " + randomNumber);
    }


}
