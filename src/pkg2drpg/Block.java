/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2drpg;

import java.awt.Color;
import java.awt.Container;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Davin
 */
public class Block extends JPanel{

    int xPos;
    int yPos;
    int type;
    
    JLabel ForBlock;
    //JLabel BackBlock;
    public Block(){
    }
    
    public void Render(Container cont, int surface) {
        
        this.setSize(Utill.BLOCK_SIZE, Utill.BLOCK_SIZE);
        this.setLocation((xPos - Utill.RightOff) * Utill.BLOCK_SIZE, (yPos - Utill.DownOff) * Utill.BLOCK_SIZE);
        this.setLayout(null);
        this.setBackground(new Color(0, 0, 0, 0));
        cont.add(this, 0);
        
//        BackBlock = new JLabel();
//        BackBlock.setBounds(0, 0, 25, 25);
//        this.add(BackBlock,0);
        
        ForBlock = new JLabel();
        ForBlock.setSize(Utill.BLOCK_SIZE, Utill.BLOCK_SIZE);
        ForBlock.setLocation(0, 0);
        this.add(ForBlock,0);
        
        int surfaceHeight = 25 - surface;
        if (yPos <= surfaceHeight) {ForBlock.setIcon(null); type =  0;}
        if (yPos == surfaceHeight) {ForBlock.setIcon(new ImageIcon("src\\pkg2drpg\\BlockTextures\\Grass.jpg")); type = 1;}
        if (yPos > surfaceHeight) {ForBlock.setIcon(new ImageIcon("src\\pkg2drpg\\BlockTextures\\Dirt.jpg")); type = 2;}
       
        
        
    }
    
    public static void GenBlocks(Container cont){
        Random surface = new Random();
        int surfaceHeight = surface.nextInt(5);
        for (int i = 0; i < Utill.GAME_WIDTH; i++) {
            if (Math.random() >= .5) surfaceHeight++;
            if (Math.random() < .5) surfaceHeight--;
            Utill.surfaceHights[i] = surfaceHeight; 
            for (int j = 0; j < Utill.GAME_HEIGHT; j++) {
                Utill.blockGrid[i][j] = new Block();
                Utill.blockGrid[i][j].type = 0;
                Utill.blockGrid[i][j].xPos = i;
                Utill.blockGrid[i][j].yPos = j;
                
                if (i < Utill.DISPLAY_WIDTH + Utill.RightOff && i >= Utill.RightOff) {
                    if (j < Utill.DISPLAY_HEIGHT + Utill.DownOff && j >= Utill.DownOff) {
                        Utill.display[i - Utill.RightOff][j - Utill.DownOff] = Utill.blockGrid[i][j];
                        Utill.display[i - Utill.RightOff][j - Utill.DownOff].Render(cont, surfaceHeight);
                    } 
                }
            }
        }
    }   
}

