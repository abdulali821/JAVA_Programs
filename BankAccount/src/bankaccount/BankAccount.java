/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;
import java.util.Scanner;
/**
 *
 * @author HP 84 G4
 */
public class BankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Sc = new Scanner(System.in);
        double currentPerks;
        double savingPerks;
        double interest;
        System.out.print("Enter your Account Number: ");
        int accountNumber = Sc.nextInt();
        System.out.print("Enter your Account Type: ");
        char accountType = Sc.next().charAt(0);
        System.out.print("Enter your Account Balance: ");
        int accountBalance = Sc.nextInt();
        System.out.print("Enter your Account Minimum Balance: ");
        int minimumBalance = Sc.nextInt();
        switch (accountType) {
            case 'C' : 
            case 'c' :
                System.out.println("CURRENT ACCOUNT");
                System.out.println("Account Number : " + accountNumber);
                System.out.println("Type : " + accountType);
                System.out.println("Minimum Balance :" + (double)minimumBalance+"$");
                if(accountBalance>5000 && accountBalance>minimumBalance){
                    interest=((double)accountBalance/100)*3;
                    currentPerks=(double)accountBalance+interest;
                    System.out.println("Current Balance :"+currentPerks+"$");
                    System.out.println("Sir You have received 3% interest Rate");
                }
                else if(accountBalance>minimumBalance){
                    interest=((double)accountBalance/100)*5;
                    currentPerks=(double)accountBalance+interest;
                    System.out.println("Current Balance :"+currentPerks+"$");
                    System.out.println("Sir You have received 5% interest Rate");
                }
                else if(accountBalance<minimumBalance){
                    currentPerks=(double)accountBalance-25;
                    System.out.println("Current Balance :" + currentPerks+"$");
                    System.out.println("Sorry Sir Your Current Balance is less than Minimum Balance(Service Charges: 25$)");
                }
                break;
            case 'S':
            case 's': 
                System.out.println("SAVING ACCOUNT");
                System.out.println("Account Number : " + accountNumber);
                System.out.println("Type : " + accountType);
                System.out.println("Minimum Balance :" + (double)minimumBalance+"$");
                if(accountBalance<minimumBalance){
                    savingPerks=(double)accountBalance-10;
                    System.out.println("Current Balance :" + savingPerks+"$");
                    System.out.println("Sorry Sir Your Current Balance is less than Minimum Balance(Service Charges: 10$)");
                }
                else if(accountBalance>minimumBalance){
                    interest=((double)accountBalance/100)*4;
                    savingPerks=(double)accountBalance+interest;
                    System.out.println("Current Balance :"+savingPerks+"$");
                    System.out.println("Sir You have received 4% interest Rate");
                }
                break;
            default :
                main(null);
        }
    }
    
}
