package w2;

/**
 * Created by sebaseba on 27.05.17.
 */
public class MyPoint /*extend Objects*/ {

    private int posX;
    private int posY;

    public MyPoint() {

        super(); //

    }

    public MyPoint(int x, int y) {

        this.posX = x;
        this.posY = y;

    }

    public int getPosX() {
        return posX; //w geterach możemy używać "this." ale nie musimy
    }

    public void setPosX(int posX) {
        this.posX = posX; //a w setrach niewiem
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}
