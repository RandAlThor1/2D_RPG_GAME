/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2drpg;

import javax.swing.JFrame;

/**
 *
 * @author Davin
 */
class Frame extends JFrame{

    final int WIDTH = 1280;
    final int HEIGHT = 820;
    
    public Frame() {
        this.setVisible(true);
        this.setSize(WIDTH, HEIGHT);
        this.setTitle("2D Test Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
}
