import java.awt.Color;

import javax.swing.*;
public class game{
 
    static int boxsize = 40;
    static JFrame frame;
   static  JPanel panel;
   
//    JButton arrayButtons[] = new JButton[9];
public static void main(String[] args) {
    
    
     makebuttons();
}
static void makebuttons(){
    game.frame = new JFrame(); 
    frame.setBounds(0, 0, 1000, 700);
    frame.setVisible(true);
    game.panel = new JPanel();

    game.panel.setBounds(0,0,1000,1000);
    game.panel.setVisible(true);
    for(int i= 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
            
        button but = new button(i * game.boxsize, j * game.boxsize, i + j);
        
        
    }}
 }
//
}

class button{
    
    int bx;
    int by;
    int position;
    JButton b;
    JLabel l;
    
    button(int x,int y, int position){
        b = new JButton();
        l = new JLabel(String.valueOf(position));
        b.add(l);
        b.setBounds(x,y,game.boxsize,game.boxsize);
        
        // arrayButtons[position] = b;
        if(position == 7){
            b.setForeground(Color.RED);
            b.setBackground(Color.RED);
            
        }
        game.panel.add(b);
       
        game.frame.add(game.panel);
        addbuttontoframe(b);
       //after all 9 buttons are made start a while loop
    }
    // JButton returnbox(){
    //     return b;
    // }
    // JFrame gameloop(){
    //     while(true){
    //         System.out.println("while loop");
    //         return game.frame;
    //     }
    //  }
    JFrame addbuttontoframe(JButton c){
        game.frame.add(c);

        return game.frame;
    }
   
}

