/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2drpg;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Davin
 */
class Frame extends JFrame{

    final int WIDTH = 1280;
    final int HEIGHT = 720;
    
    public Frame() {
        this.setSize(WIDTH, HEIGHT);
        this.setTitle("2D Test Game");
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        
        
        Icon skyImage = new ImageIcon("src\\pkg2drpg\\Backrounds\\Sky.png");
        JLabel sky = new JLabel(skyImage);
        sky.setLocation(0, 0);
        sky.setSize(WIDTH, HEIGHT);
        this.add(sky,0);
        
        Block.GenBlocks(this);
        
        this.setVisible(true);
        
    }
    
}
