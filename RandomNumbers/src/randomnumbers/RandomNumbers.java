/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumbers;

import java.util.Random;

/**
 *
 * @author HP 84 G4
 */
public class RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random(); //instance of random class
        int upperbound = 9;
        int int_random = rand.nextInt(upperbound);
        int int_random2 = rand.nextInt(upperbound);
        int int_random3 = rand.nextInt(upperbound);
        System.out.printf("Price Goes to this user: %d%d%d%n", int_random, int_random2, int_random3);
    }
    
}
