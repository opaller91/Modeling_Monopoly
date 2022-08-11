public class Player {
    private String name;
    private Die dice1;//ลูกเต๋าลูกที่1
    private Die dice2;//ลูกเต๋าลูกที่2
    private Piece piece;
    private Board board;

    public Player(String name,Board board){
        this.name = name;
        this.board = board;//ต้องมีการเอาboardมา
    }

    public void takeTurn(){
        dice1.roll();
        dice2.roll();
        int fv1 = dice1.getFaceValue();
        int fv2 = dice2.getFaceValue();
        int fvTotal = fv1 + fv2;//รวมแต้มหน้าลูกเต๋าลูก1กับ2
        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc,fvTotal);
        piece.setLocation(newLoc);
    }

}
