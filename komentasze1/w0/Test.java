package w0;

/**
 * Created by Michał on 2017-02-20.
 */
public class Test {

    public static void main(String args[]) {

        Stack stack = new Stack();

        //stack.push(1.0);
        //stack.push(2.0);
        //stack.push(127.0);

        try {

            stack.dump();

        } catch (MyExeption ex) {

            System.out.println("Złapałem wyjątek!");
        }

        //stack.push(1.0);


        try {

            System.out.print(stack.pop());

        } catch (MyExeption ex) {

            System.out.println("Złapałem wyjątek!");
        }

        //stack.pop();
        //stack.pop();
    }
}
