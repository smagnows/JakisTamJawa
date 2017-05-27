package w2;

import java.util.ArrayList;

/**
 * Created by sebaseba on 27.05.17.
 */
public class Poligon {

    /*Java Collection Framework
    kolejki, stosy, haszmapy, dżeva;

     */

    private ArrayList<MyPoint> points; //tworzymy pole obiektu Poligon, które będzie listą liniową
    //w nawiasach diamentowych piszemy, co tam chcemy trzymać


    public Poligon(){

        this.points = new ArrayList<>(0); //startowa pojemność 0; można tu wrzucić cokolwiek

    }

    public void addPoint(int x, int y){

        MyPoint tmp = new MyPoint(x,y);
        this.points.add(tmp);

    }

    public MyPoint getPoint(int i) {

        return points.get(i);

    }

    public String drawPoligon(){

        String toReturn = "";

        for (int i=0; i<points.size(); i++) {

            if (i == points.size()-1) {

                toReturn += Tools.drawLine(points.get(i), points.get(0));

            } else {

                toReturn += Tools.drawLine(points.get(i), points.get(i + 1));

            }

        }

        return toReturn;

    }

}
