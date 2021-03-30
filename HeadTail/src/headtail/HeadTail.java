/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headtail;

import java.util.Random;

/**
 *
 * @author HP 84 G4
 */
public class HeadTail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random(); //instance of random class
        int int_random = rand.nextInt(10);
        if (int_random == 8 || int_random == 6 || int_random == 4 || int_random == 2 || int_random ==0){
            System.out.println("Head");
        }
        else if(int_random==9 || int_random==7 || int_random==5 || int_random==3 || int_random==1 ){
            System.out.println("Tail");
        }
    }
    
}
