/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speedofsound;
import java.util.Scanner;
/**
 *
 * @author HP 84 G4
 */
public class SpeedOfSound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Sc =  new Scanner(System.in);
    String medium ;
    float time;
    int distance;
        System.out.println("(AIR,STEEL,WATER)");
        System.out.println("Enter the Medium");
        medium = Sc.nextLine();
        switch (medium) {
            case "Air":
            case "air":
            case "AIR":
                System.out.println("!Distance should be in Meters!");
                System.out.println("Enter the distance: ");
                distance = Sc.nextInt();
                time = (float) distance/1100;
                System.out.println("Distance: "+ distance+"m");
                System.out.println("Time: "+ time+"mps");
                break;
            case "Water":
            case "water":
            case "WATER":
                System.out.println("!Distance should be in Meters!");
                System.out.println("Enter the distance: ");
                distance = Sc.nextInt();
                time = (float)distance/4900;
                System.out.println("Distance: "+ distance+"m");
                System.out.println("Time: "+ time+"mps");
                break;
            case "Steel":
            case "steel":
            case "STEEL":
                System.out.println("!Distance should be in Meters!");
                System.out.println("Enter the distance: ");
                distance = Sc.nextInt();
                time = (float) distance/16400;
                System.out.println("Distance: "+ distance+"m");
                System.out.println("Time: "+ time+"mps");
                break;
            default:
                break;
        }
    }
    
}
