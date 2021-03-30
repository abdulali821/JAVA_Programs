/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barchart;
import java.util.Scanner;
/**
 *
 * @author HP 84 G4
 */
public class BarChart {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Sc = new Scanner(System.in);
        int i;
        int[] div=new int[99];
        int[] sale= new int[99];
        for (i=1;i<=5;i++){
            System.out.print("Enter today's sales for store "+i+": ");
            sale[i] = Sc.nextInt();
            div[i]=sale[i]/100;
        }
        for (i=1;i<=5;i++){
            System.out.print("\nStore No "+i+": ");
            for(int j=0;j<div[i];j++){
                System.out.print("*");
            }
        }
    }
}
