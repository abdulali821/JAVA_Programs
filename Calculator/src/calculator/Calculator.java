/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;
/**
 *
 * @author HP 84 G4
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Sc = new Scanner(System.in);
        int a,b;
        char x ;
        System.out.println("Enter the first value: ");
        a = Sc.nextInt();
        System.out.println("Choose any Operator(+,-,/,*): ");
        x = Sc.next().charAt(0);
        switch (x)
        {
            case '+':
            {
                System.out.println("Enter the second Value: ");
                b = Sc.nextInt();
                System.out.println("Addition of "+a+" & "+b+" is "+(a+b));
                break;
            }
            case '-':
            {
                System.out.println("Enter the second Value: ");
                b = Sc.nextInt();
                System.out.println("Subtraction of " +a+ " & " +b+ " is " +(a-b));
                break;
            }
            case '/':
            {
                System.out.println("Enter the second Value: ");
                b = Sc.nextInt();
                System.out.println("Division of "+a+" & "+b+" is " +((float) a/b));
                break;
            }
            case '*':
            {
                System.out.println("Enter the second Value: ");
                b = Sc.nextInt();
                System.out.println("Product of "+a+" & "+b+" is "+(a*b));
                break;
            }
        }
    }
    
}
