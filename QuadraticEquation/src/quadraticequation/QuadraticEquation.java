/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadraticequation;
import java.util.Scanner;
/**
 *
 * @author HP 84 G4
 */
public class QuadraticEquation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = Sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = Sc.nextInt();
        System.out.println("Enter the value of c: ");
        int c = Sc.nextInt();
        double disc = (double) b*b - 4*a*c;
        if(disc!=0){
            disc = Math.sqrt(disc);
            double root1up = -b + disc;
            double root1Answer =  root1up/((double)2*a);
            double root2up = -b - disc;
            double root2Answer =  root2up/((double)2*a);
            System.out.println("Root 1: "+root1Answer);
            System.out.println("Root 2: "+root2Answer);
        }
        else {
            double root0=(double)-b/2*a;
            System.out.println("Root 0: "+root0);
        }
    }
    
}
