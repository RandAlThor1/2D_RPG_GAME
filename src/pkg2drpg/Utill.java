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
    
    final static int GAME_HEIGHT = 500;
    final static int GAME_WIDTH  = 500;
    
    final static int DISPLAY_WIDTH  = 32;
    final static int DISPLAY_HEIGHT = 18;

    final static int BLOCK_SIZE = 50;
    
    static int RightOff = 250;
    static int DownOff = 10;
    
    public static Block[][] blockGrid = new Block[GAME_WIDTH][GAME_HEIGHT];
    public static Block[][] display = new Block[DISPLAY_WIDTH][DISPLAY_HEIGHT];
    public static int[] surfaceHights = new int[GAME_WIDTH];
    
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
