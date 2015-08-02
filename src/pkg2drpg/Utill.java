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
class Utill {
    
    final static int GAME_HEIGHT = 1000;
    final static int GAME_WIDTH  = 1000;
    
    final static int DISPLAY_HEIGHT = 29;
    final static int DISPLAY_WIDTH  = 52;
    
    final static int BLOCK_SIZE = 25;
    
    static int RightOff = 0;
    static int DownOff = 10;
    
    public static Block[][] block_grid = new Block[GAME_WIDTH][GAME_HEIGHT];
    public static Block[][] display = new Block[DISPLAY_WIDTH][DISPLAY_HEIGHT];
    
    public Utill() {
    }
    public static int Roll(int Amount, int Type){
        int result = 0;
        for (int i = 0; i < Amount; i++) {
            result += (int)(Math.random() * Type) + 1;
        }     
        return result;
    }
    
}
