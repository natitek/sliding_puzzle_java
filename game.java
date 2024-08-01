import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;
import java.util.*;



public class game {

    static int boxsize = 100;
    static JFrame frame;
    static JPanel panel;

    static button arrayButtons[] = new button[9];
    static ArrayList<button> arraylistbuttons = new ArrayList<button>(9);

    public static void main(String[] args) {

        makebuttons();
        button.shufflebuttons();
        button.gameloop();
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
    boolean move = false;
    

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("1")){
            // makemove(true);
           checkmove(this.move);
        }
        else if(e.getActionCommand().equals("2")){
            
        }
        else if(e.getActionCommand().equals("3")){

        }
        else if(e.getActionCommand().equals("4")){

        }
        else if(e.getActionCommand().equals("5")){

        }
        else if(e.getActionCommand().equals("6")){

        }
        else if(e.getActionCommand().equals("7")){

        }
        else if(e.getActionCommand().equals("8")){

        }
        else if(e.getActionCommand().equals("9")){

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
        if (position == 9) {
            
            b.setBackground(Color.GRAY);
            b.setOpaque(true);

        }

        game.arrayButtons[position-1] = this; // why position-1 , cuz started counter at ln 27 at 1

        game.panel.add(b);

        game.frame.add(game.panel);
        addbuttontoframe(b);

    }

    JFrame addbuttontoframe(JButton c) {
        game.frame.add(c);

        return game.frame;
    }
    boolean checkmove(boolean m){
        return m;

    }

    static void shufflebuttons(){
        //shuffle the order of the buttons inside a new arraylist(vector)
        try{
            for(int i = 0; i < game.arrayButtons.length; i++){
                int rand = (int)(Math.random()*9);
                System.out.println(rand);
                if(game.arraylistbuttons.get(rand) == null){
                 game.arraylistbuttons.add(rand,game.arrayButtons[i]);
             }// add element n at index i
             else if(game.arrayButtons[i] == game.arraylistbuttons.get(rand)){
                 continue;
             }
             else{
                 --i;
             }
                 
            }
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("index out of bound exception");
        }
      
    }

    // boolean makemove(button b){

        
    //         if(b.position + 3 == 9 || b.position - 3 == 9){

    //         }
        
        
           
    // }

   void newposition(button b1,button b2){
    button [] swap= new button[3];
    swap[0] = b1;
    swap[1] = b2;
  

    for(int i = 0; i < 2; i++){
    switch(swap[i].position){
        case 1:
            this.bx = 0;
            this.by = 0;
        case 2:
            this.bx = 1*game.boxsize;
            this.by = 0;
        case 3:
            this.bx = 2*game.boxsize;
            this.by = 0;
        case 4:
            this.bx = 0;
            this.by = 1*game.boxsize;
        case 5:
            this.bx = 1*game.boxsize;
            this.by = 1*game.boxsize;
        case 6:
            this.bx = 2*game.boxsize;
            this.by = 1*game.boxsize;
        case 7:
            this.bx = 0;
            this.by = 2*game.boxsize;
        case 8:
            this.bx = 1*game.boxsize;
            this.by = 2*game.boxsize;
        case 9:
            this.bx = 2*game.boxsize;
            this.by = 2*game.boxsize;
    }}

    }
    static void gameloop(){
        while(true){
        try{
            Thread.sleep(1000);
            System.out.println("sleeping for 1 sec");
        }
        catch(InterruptedException e){
            System.out.println("Thread exception caught");
        }
        }
    }

}
