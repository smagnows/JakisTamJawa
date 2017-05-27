package w0;

/**
 * Created by Michał on 2017-02-20.
 */
public class Element {

    private double value;
    private Element next;

    public Element(double v, Element n) {

        this.value = v;
        this.next = n;
    }

    public double getValue() {

        return this.value;
    }

    public Element getNext() {

        return this.next;
    }
}
