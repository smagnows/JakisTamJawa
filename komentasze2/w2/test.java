package w2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by sebaseba on 27.05.17.
 */
public class test {

    public static void main(String[] args) {
        try {

            File file = new File("out.svg");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(Tools.drawHeader());
            fileWriter.write(Tools.drawCanvas());

            Poligon poligon = new Poligon();
            //poligon.addPoint(0,0);
            poligon.addPoint(50,50);
            poligon.addPoint(50,100);
            poligon.addPoint(100,50);

            fileWriter.write(poligon.drawPoligon());
            MyPoint srodeczek = new MyPoint(75,75);
            fileWriter.write(Kulko.drawKulko(srodeczek,  ));
            fileWriter.write(Tools.drawEnd());
            fileWriter.close();


        } catch (IOException ex) {

            ex.printStackTrace();
        }
    }

}
