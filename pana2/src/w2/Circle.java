package w2;

/**
 * Created by Michał on 2017-05-27.
 */
public class Circle {

    private MyPoint centre;
    private int radius;

    public Circle(MyPoint centre, int radius) {
        this.centre = centre;
        this.radius = radius;
    }

    public MyPoint getCentre() {
        return centre;
    }

    public void setCentre(MyPoint centre) {
        this.centre = centre;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String drawCircle() {

        String circle = "<circle cx=\"" + this.getCentre().getPosX() +
                        "\" cy=\"" + this.getCentre().getPosY() +
                        "\" r=\"" + this.getRadius() +
                        "\" stroke=\"black\" stroke-width=\"3\" fill=\"none\" />\n";

        return circle;

    }
}
