import java.util.Random;

public class Die {
    private int faceValue;

    public Die() {
        this.faceValue = roll();
    }

    public int roll(){
        return faceValue = new Random().nextInt(6)+1;//สุ่มแต้มของลูกเต๋า สุ่ม 0-5 เลยต้องบวก1
    }

    public int getFaceValue() {
        return faceValue;
    }//คืนค่าหน้าของลูกเต๋า

}
