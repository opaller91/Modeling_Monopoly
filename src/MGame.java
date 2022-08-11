import java.util.ArrayList;
import java.util.List;

public class MGame {
    private int roundCount;//นับรอบ(round count)
    private Die dice1;//ลูกเต๋าลูกที่1
    private Die dice2;//ลูกเต๋าลูกที่2
    private Board board;//1 Game มี 1 Board
    private List<Player> players;//1 Game มีได้ 2-8 player

    public MGame() {
        this.roundCount = 0;
        this.dice1 = new Die();
        this.dice2 = new Die();
        this.board = new Board();
        this.players = new ArrayList<>();
    }

    public void playGame(int N){
        for (;roundCount<N;roundCount++){
            playRound();
        }

    }

    private void playRound(){
        for (Player player : players){
            player.takeTurn();//วนให้ผุ้เล่นแต่ละคนมาtake Turn
        }
    }
}
