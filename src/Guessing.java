package quessing;


/**
 * Created by $(USER) on $ (DATE).
 */
public class Guessing {

    public static void main(String[] arg) {

        Game game = new Game();
        Player[] players = game.enterPlayers();
        game.showPlayers(players);
        game.guess(players);

    }

}
