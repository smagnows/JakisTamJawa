package w2;

/**
 * Created by Michał on 2017-05-27.
 */
public class Tools {

    public static String drawHeader() {

        String header = "<?xml version=\"1.0\" standalone=\"yes\"?>";
        return header;
    }

    public static String drawCanvas() {

        String data = "<svg width=\"1000\" height=\"800\" version=\"1.1\" " +
                "xmlns=\"http://www.w3.org/2000/svg\">\n";

        return data;
    }

    public static String drawLine(MyPoint first, MyPoint second) {

        String line =
                        "<line x1=\""+ first.getPosX() +
                        "\" y1=\"" + first.getPosY() +
                        "\" x2=\"" + second.getPosX() +
                        "\" y2=\"" + second.getPosY() +
                        "\" " +
                        "style=\"stroke:rgb(0,0,0);stroke-width:2\" />\n";

        return line;
    }

    public static String drawEnd() {

        String end = "</svg>";

        return end;
    }
}
