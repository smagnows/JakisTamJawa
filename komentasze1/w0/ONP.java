package w0;

import java.io.*;

/**
 * Created by Michał on 2017-05-27.
 */
public class ONP {

    public static void performCount() {

        try {

            File file = new File("data.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            while (line != null) {

                System.out.println(calculate(line));
                line = bufferedReader.readLine();
            }

        } catch (FileNotFoundException ex) {

            ex.printStackTrace();

        } catch (IOException ex) { /* nie ma pliku/mamy plik, ale nie uprawnienia/plik jest uszkodzony/... */
            ex.printStackTrace();

        } catch (MyExeption ex) { /* Stos pusty/stosu nie ma/... */

            ex.printStackTrace();
        }
    }

    private static Double calculate(String line) throws MyExeption {

        String[] tokens = line.split(" "); //ze stringa robimy tablicę ... okouo
        Stack stack = new Stack();

        for (int i = 0; i < tokens.length; i++) {

            if (isOperand(tokens[i])) {

                Double res;
                Double a;
                Double b;

                a = stack.pop();
                b = stack.pop();

                res = makeOperation(tokens[i], b, a);
                stack.push(res);

            } else {

                Double tmp;

                tmp = Double.parseDouble(tokens[i]);
                stack.push(tmp);
            }
        }

        return stack.pop();
    }

    private static Double makeOperation(String token, Double a, Double b) throws MyExeption {

        if (token.equals("+")) {

            return a + b;

        } else if (token.equals("-")) {

            return a - b;

        } else if (token.equals("*")) {

            return a * b;

        } else if (token.equals("/")) {

            if (b == 0)
                throw new MyExeption("Zero!!!");

            return a / b;

        }

        throw new MyExeption("Nie znam operacji!");
    }

    private static boolean isOperand(String s) {

        if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {

            return true;
        }

        return false;
    }

    public static void main(String args[]) {

        performCount();
    }
}
