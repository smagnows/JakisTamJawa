package w2;

/**
 * Created by Michał on 2017-05-27.
 */
public class MyPoint {

    private int posX;
    private int posY;

    public MyPoint() {
        super();
    }

    public MyPoint(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}
