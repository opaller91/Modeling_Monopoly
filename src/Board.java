import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Square> squares;

    public Board() {
        this.squares = new ArrayList<Square>();
    }

    public Square getSquare(Square location, int fv) {
        int currentLocation = 0;
        for (int i=0; i < 40 ; i++ ){
            if (location.equals(squares.get(i))){//หาlocationเก่าว่าอยู่indexไหนในsqureเพื่อจะเอาไปบวกแต้มเพิ่มต่อ
                currentLocation = i;
            }
        }
        int newLocation = currentLocation + fv;//เอาindexที่หาได้มาจากlocationเก่าเพื่อเอามาบวกแต้มให้กลายเป็นแต้มปัจุบัน
        if (newLocation > 40){
            newLocation %= 40;//ถ้าเกิน 40 เศษที่เกินจะไปเริ่ม1ใหม่
        }
        return squares.get(newLocation);
    }
}
