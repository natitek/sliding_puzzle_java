import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;





import java.awt.Image;
import javax.imageio.*;

import java.io.*;

public class Main2{
    public static void main(String[] args) {
        
        
        
       
    }
    class box{
        int position; 
        /*
        1 2 3
        4 5 6
        7 8 9
        */
        int bx;
        int by;
        
        JButton button;
       JPanel panel = new JPanel();
    
    
       public box(){
           buttonSetBounds();
        }
        //inital Setup i.e crop image set it to buttons
       
    
    
     JPanel buttonSetBounds(){
        for(int i = 0; i < 9; i++){
           
            this.button = new JButton(String.valueOf(i));
            this.button.setBackground(Color.GREEN);
            this.position = setPosition(i);
            this.panel.setVisible(true);
            if(i == 8){
                button.setBackground(Color.RED);
            }
          
            panel.add(button);
            
        }
    
    return this.panel;
       
      }
        int setPosition(int position){
            //switch statment goes here
             
            switch(this.position){
                case 1:
                    this.bx = 0;
                    this.by = 0;
                case 2:
                    this.bx = 300;
                    this.by = 0;
                case 3:
                    this.bx = 600;
                    this.by = 0;
                case 4:
                    this.bx = 0;
                    this.by = 300;
                case 5:
                    this.bx = 300;
                    this.by = 300;
                case 6:
                    this.bx = 600;
                    this.by = 300;
                case 7:
                    this.bx = 0;
                    this.by = 600;
                case 8:
                    this.bx = 300;
                    this.by = 600;
                case 9:
                    this.bx = 600;
                    this.by = 600;
            }
            return position;
       }
        
    }
    
    class window{
        int windowX;
        int windowY;
    
        window(int x,int y){
            this.windowX = x;
            this.windowY = y;
            displayWindow();
        }
        JFrame displayWindow(){
          
           
    
    
            JFrame windowFrame = new JFrame();
            windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
            // windowFrame.add(imageholder);
    
            box p  = new box();
            JPanel x = p.buttonSetBounds();
    
            windowFrame.setLayout(null);
            windowFrame.setSize(windowX,windowY);
            windowFrame.setVisible(true);
            windowFrame.setVisible(true);
            windowFrame.add(x);
            return windowFrame; 
        }
    }
}

