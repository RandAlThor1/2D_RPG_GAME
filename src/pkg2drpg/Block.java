/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2drpg;

/**
 *
 * @author Davin
 */
public class Block {

    int xPos;
    int yPos;
    public Block(int x, int y) {
        xPos = x;
        yPos = y;
        
    }
    
    public void GenBlocks(){
        for (int i = 0; i < General.BLOCKS_WIDTH; i++) {
            for (int j = 0; j < General.BLOCKS_HEIGHT; j++) {
                General.blocks[i][j] = new Block(i,j);
            }
        }
    }   
}

