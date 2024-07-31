import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class game {

    static int boxsize = 100;
    static JFrame frame;
    static JPanel panel;

    static JButton arrayButtons[] = new JButton[9];

    public static void main(String[] args) {

        makebuttons();
    }

    static void makebuttons() {
        game.frame = new JFrame();
        frame.setBounds(0, 0, 1000, 700);
        frame.setVisible(true);

        game.panel = new JPanel();
        game.panel.setBounds(0, 0, 1000, 1000);
        game.panel.setVisible(true);
        int counter = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                button but = new button(i * game.boxsize, j * game.boxsize, counter);
                counter++;

            }
        }
    }
    //
}

class button implements ActionListener {

    int bx;
    int by;
    int position;
    JButton b;
    

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("1")){
            System.out.println("1 pressed");
        }
        else if(e.getActionCommand().equals("2")){
            System.out.println("2 pressed");
        }
        else if(e.getActionCommand().equals("3")){
            System.out.println("3 pressed");
        }
        else if(e.getActionCommand().equals("4")){
            System.out.println("4 pressed");
        }
        else if(e.getActionCommand().equals("5")){
            System.out.println("5 pressed");
        }
        else if(e.getActionCommand().equals("6")){
            System.out.println("6 pressed");
        }
        else if(e.getActionCommand().equals("7")){
            System.out.println("7 pressed");
        }
        else if(e.getActionCommand().equals("8")){
            System.out.println("8 pressed");
        }
        else if(e.getActionCommand().equals("9")){
            System.out.println("9 pressed");
        }
    }

    button(int x, int y, int position) {
        b = new JButton(String.valueOf(position));
       

        //add an action listner for each button
        b.addActionListener(this);

        System.err.println(position + "generated");

        
        b.setBounds(x, y, game.boxsize, game.boxsize);
        b.setBackground(Color.CYAN);
        b.setOpaque(true);
        if (position == 7) {
            
            b.setBackground(Color.GRAY);
            b.setOpaque(true);

        }

        game.arrayButtons[position-1] = b; // why position-1 , cuz started counter at ln 27 at 1

        game.panel.add(b);

        game.frame.add(game.panel);
        addbuttontoframe(b);

    }

    JFrame addbuttontoframe(JButton c) {
        game.frame.add(c);

        return game.frame;
    }

}
