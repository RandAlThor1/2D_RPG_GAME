/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2drpg;

import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Davin
 */
class Frame extends JFrame{

    final int WIDTH = 1600;
    final int HEIGHT = 900;
    public static Container container;
    
    public Frame() {
        container = this.getContentPane();
        this.setSize(WIDTH, HEIGHT);
        this.setTitle("2D Test Game");
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        
        
        Icon skyImage = new ImageIcon("src\\pkg2drpg\\Backrounds\\Sky.png");
        JLabel sky = new JLabel(skyImage);
        sky.setLocation(0, 0);
        sky.setSize(WIDTH, HEIGHT);
        this.add(sky,0);
        
        Block.GenBlocks(Frame.container);
        
        this.setVisible(true);
        
        KeyListener listener = new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 37 && Utill.RightOff > 0) {//left
                    Utill.RightOff--;
                    for (int i = 0; i < Utill.DISPLAY_WIDTH; i++) {
                        for (int j = 0; j < Utill.DISPLAY_HEIGHT; j++) {
                            Utill.display[i][j] = Utill.blockGrid[i + Utill.RightOff][j + Utill.DownOff];
                            Utill.display[i][j].Render(Frame.container , Utill.surfaceHights[i + Utill.RightOff]);
                            
                        }
                    }
                }
                if (e.getKeyCode() == 38) {//up
                    Utill.DownOff--;
                    for (int i = 0; i < Utill.DISPLAY_WIDTH; i++) {
                        for (int j = 0; j < Utill.DISPLAY_HEIGHT; j++) {
                            Utill.display[i][j] = Utill.blockGrid[i + Utill.RightOff][j + Utill.DownOff];
                            Utill.display[i][j].Render(Frame.container , Utill.surfaceHights[i + Utill.RightOff]);
                            
                        }
                    }
                }
                if (e.getKeyCode() == 39 && Utill.RightOff < Utill.GAME_WIDTH) {//right
                    Utill.RightOff++;
                    for (int i = 0; i < Utill.DISPLAY_WIDTH; i++) {
                        for (int j = 0; j < Utill.DISPLAY_HEIGHT; j++) {
                            Utill.display[i][j] = Utill.blockGrid[i + Utill.RightOff][j + Utill.DownOff];
                            Utill.display[i][j].Render(Frame.container , Utill.surfaceHights[i + Utill.RightOff]);
                            
                        }
                    }
                }
                if (e.getKeyCode() == 40) {//down
                    Utill.DownOff++;
                    for (int i = 0; i < Utill.DISPLAY_WIDTH; i++) {
                        for (int j = 0; j < Utill.DISPLAY_HEIGHT; j++) {
                            Utill.display[i][j] = Utill.blockGrid[i + Utill.RightOff][j + Utill.DownOff];
                            Utill.display[i][j].Render(Frame.container , Utill.surfaceHights[i + Utill.RightOff]);
                            
                        }
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        };
        this.addKeyListener(listener);
    }
    
}
