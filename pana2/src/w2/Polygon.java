package w2;

import javax.tools.Tool;
import java.util.ArrayList;

/**
 * Created by Michał on 2017-05-27.
 */
public class Polygon {

    private ArrayList<MyPoint> points;

    public Polygon() {

        this.points = new ArrayList<>(0);
    }

    public void addPoint(int x, int y) {

        MyPoint tmp = new MyPoint(x, y);
        this.points.add(tmp);
    }

    public String drawPolygon() {

        String toReturn = "";

        for (int i = 0; i < points.size(); i++) {

            if (i == points.size()-1) {

                toReturn += Tools.drawLine(points.get(i), points.get(0));

            } else {

                toReturn += Tools.drawLine(points.get(i), points.get(i + 1));
            }
        }

        return toReturn;
    }

}
