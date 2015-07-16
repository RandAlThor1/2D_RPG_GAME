/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2drpg;

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
        
        this.setLocation(xPos * 25, yPos * 25);
        this.setSize(25, 25);
        this.setLayout(null);
        cont.add(this, 0);
        
//        BackBlock = new JLabel();
//        BackBlock.setBounds(0, 0, 25, 25);
//        this.add(BackBlock,0);
        
        ForBlock = new JLabel();
        ForBlock.setSize(25, 25);
        ForBlock.setLocation(0, 0);
        this.add(ForBlock,0);
        if (yPos <= 5) ForBlock.setOpaque(false);
        if (yPos > 5)  ForBlock.setIcon(new ImageIcon("src\\pkg2drpg\\BlockTextures\\Dirt.jpg"));
        
        
    }
    
    public static void GenBlocks(Container cont){
        for (int i = 0; i < General.BLOCKS_WIDTH; i++) {
            for (int j = 0; j < General.BLOCKS_HEIGHT; j++) {
                General.blocks[i][j] = new Block(i,j,cont);
            }
        }
    }   
}

