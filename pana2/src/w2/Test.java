package w2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Michał on 2017-05-27.
 */
public class Test {

    public static void main(String[] args) {

        try{

            File file = new File("out.svg");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(Tools.drawHeader());
            fileWriter.write(Tools.drawCanvas());

            Polygon polygon = new Polygon();
            polygon.addPoint(50, 50);
            polygon.addPoint(50, 100);
            polygon.addPoint(100, 50);
            fileWriter.write(polygon.drawPolygon());

            Circle circle = new Circle(new MyPoint(75,75), 35);
            fileWriter.write(circle.drawCircle());

            fileWriter.write(Tools.drawEnd());
            fileWriter.close();

        } catch (IOException ex) {

            ex.printStackTrace();
        }

    }
}
