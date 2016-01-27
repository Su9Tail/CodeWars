import java.util.Arrays;
import java.util.List;

public class Game {
    public String winner(String[] deckSteve, String[] deckJosh) {
        String[] ranks = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
        List<String> rank = Arrays.asList(ranks);
        int scoreSteve =0;
        int scoreJosh = 0;
        for (int i = 0; i < deckSteve.length; i++) {
            if (rank.indexOf(deckSteve[i]) > rank.indexOf(deckJosh[i])) {
                scoreSteve = scoreSteve + 1;
            }else if (rank.indexOf(deckSteve[i]) < rank.indexOf(deckJosh[i])){
                scoreJosh = scoreJosh + 1;
            }
        }
        if(scoreSteve>scoreJosh){
            return "Steve wins " + scoreSteve + " to " + scoreJosh;
        }else if (scoreSteve < scoreJosh){
            return "Josh wins " + scoreJosh + " to " + scoreSteve;
        }
        return "Tie";
    }

    public static void main(String[] args) {
        Game game = new Game();
        System.out.println(game.winner(new String[]{"A", "7", "8"}, new String[]{"K", "5", "9"}));
        System.out.println(game.winner(new String[]{"2", "7", "8"}, new String[]{"K", "5", "9"}));
        System.out.println(game.winner(new String[]{"T"}, new String[]{"T"}));
    }
}