package w0;

/**
 * Created by Michał on 2017-02-20.
 */
public class Stack {

    private Element head;

    public Stack() {

        this.head = null;
    }

    public void push(double v) {

        Element e = new Element(v, head);
        head = e;
    }

    public Double pop() throws MyExeption {

        Double tmp;

        if(!this.isEmpty()) {

            tmp = head.getValue();
            //System.out.println("Ze stosu zdjeliśmy: " + tmp);
            head = head.getNext();

        } else {

            throw new MyExeption("STOS JEST PUSTY!");
        }

        return tmp;
    }

    public void dump() throws MyExeption {

        if (!this.isEmpty()) {

            Element tmp = head;

            while (tmp != null) {

                System.out.println(tmp.getValue());
                tmp = tmp.getNext();
            }
        } else {

            throw new MyExeption("STOS JEST PUSTY!");
        }
    }

    public boolean isEmpty() {

        return head == null;
    }
}
