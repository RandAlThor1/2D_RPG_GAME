/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2drpg;

import java.awt.Color;
import java.awt.Container;
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
    
    JLabel ForBlock;
    //JLabel BackBlock;
    public Block(int x, int y, Container cont) {
        xPos = x;
        yPos = y;
        
        this.setSize(25, 25);
        this.setLayout(null);
        this.setBackground(new Color(0, 0, 0, 0));
        cont.add(this, 0);
        
//        BackBlock = new JLabel();
//        BackBlock.setBounds(0, 0, 25, 25);
//        this.add(BackBlock,0);
        
        ForBlock = new JLabel();
        ForBlock.setSize(25, 25);
        ForBlock.setLocation(0, 0);
        this.add(ForBlock,0);
        if (yPos <= 25) ForBlock.setIcon(null);
        if (yPos > 5)  ForBlock.setIcon(new ImageIcon("src\\pkg2drpg\\BlockTextures\\Dirt.jpg"));
        
        
    }
    
    public static void GenBlocks(Container cont){
        for (int i = 0; i < Utill.BLOCKS_WIDTH; i++) {
            for (int j = 0; j < Utill.BLOCKS_HEIGHT; j++) {
                Utill.blocks[i][j] = new Block(i,j,cont);
                if (i < Utill.DISPLAY_WIDTH && j < Utill.DISPLAY_HEIGHT) {
                    Utill.display[i][j] = Utill.blocks[i][j];
                    Utill.display[i][j].setLocation(Utill.display[i][j].xPos, Utill.display[i][j].yPos);
                    System.out.println(i+", "+j);
                }
            }
        }
    }   
}

