package w3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by Michał‚ on 2016-11-13.
 */
public class CalcFrame extends JFrame {


    public CalcFrame() {

        int screenHeight = 1080;
        int screenWidth = 1920;
        Font myFont = new Font("Arial", Font.PLAIN, 18);

        screenWidth = screenWidth / 2 - 600;
        screenHeight = screenHeight / 2;

        setSize(screenWidth, screenHeight);
        setLocationByPlatform(true);

        JPanel main = new JPanel();

        JPanel mainTop = new JPanel();
        JPanel mainBot = new JPanel();
        JPanel mainCentral = new JPanel();

        JTextArea input = new JTextArea(1, 23);
        input.setFont(myFont);
        mainTop.add(input);

        ArrayList<JButton> buttons = new ArrayList<>(0);

        for (int i = 0; i < 10; i++) {

            buttons.add(createButton(i));
        }

        buttons.add(createButton("+"));
        buttons.add(createButton("-"));
        buttons.add(createButton("*"));
        buttons.add(createButton("/"));
        buttons.add(createButton("="));
        buttons.add(createButton("."));

        mainCentral.setLayout(new GridLayout(4, 4, 0, 0));

        mainCentral.add(buttons.get(1));
        mainCentral.add(buttons.get(2));
        mainCentral.add(buttons.get(3));
        mainCentral.add(buttons.get(10));
        mainCentral.add(buttons.get(4));
        mainCentral.add(buttons.get(5));
        mainCentral.add(buttons.get(6));
        mainCentral.add(buttons.get(11));
        mainCentral.add(buttons.get(7));
        mainCentral.add(buttons.get(8));
        mainCentral.add(buttons.get(9));
        mainCentral.add(buttons.get(12));
        mainCentral.add(buttons.get(15));
        mainCentral.add(buttons.get(0));
        mainCentral.add(buttons.get(14));
        mainCentral.add(buttons.get(13));

        for (JButton button : buttons) {
            button.setFont(myFont);
        }

        for (JButton button : buttons) {
            if (!button.getText().equals("="))
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        input.append(button.getText());
                    }
                });
        }

        buttons.get(14).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(Logic.calculate(input.getText()));
            }
        });

        main.setLayout(new BorderLayout());

        main.add(mainTop, BorderLayout.NORTH);
        main.add(mainCentral, BorderLayout.CENTER);
        main.add(mainBot, BorderLayout.SOUTH);

        add(main);

    }

    public JButton createButton(int number) {

        JButton button = new JButton(String.valueOf(number));
        button.setSize(new Dimension(25, 25));
        return button;
    }

    public JButton createButton(String operand) {

        JButton button = new JButton(operand);
        button.setSize(new Dimension(25, 25));
        return button;
    }
}
