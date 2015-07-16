/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TwoDrpg;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Ben
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File temp = new File("src\\finalProject\\Map.txt");
        Scanner s = new Scanner(temp);
        for (int j = 0; j <= 71; j++){
            for (int i = 0; i <= 127; i++){
                borderType[i][j] = 0;
                tileType[i][j] = s.nextInt();
            }
        }
    }
    
}
