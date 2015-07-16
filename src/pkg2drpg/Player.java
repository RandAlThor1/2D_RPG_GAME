/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
package pkg2drpg;

/**
 *
 * @author Ben
 */
public class Player {
    
    public int Strength;
    public int Constitution;
    public int Dexterity;
    public int Intelligence;
    public int Wisdom;
    public int Charisma;
    public int Health;
    public int Speed;
    public int DodgeChance;
    public String CharacterName;
     public static int Roll(int Amount, int Type){
        int result = 0;
        for (int i = 0; i < Amount; i++) {
            result += (int)(Math.random() * Type) + 1;
        }     
        return result;
    }
    
}

