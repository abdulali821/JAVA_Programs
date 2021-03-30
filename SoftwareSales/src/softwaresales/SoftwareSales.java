/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaresales;
import java.util.Scanner;
/**
 *
 * @author HP 84 G4
 */
public class SoftwareSales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Sc = new Scanner(System.in);
        float pack ;
        float amount;
        float discount ;
        float totalPack ;
        System.out.println("------------------------");
        System.out.println("QUANTITY        DISCOUNT");
        System.out.println("------------------------");
        System.out.println("10-19           20%     ");
        System.out.println("20-49           30%     ");
        System.out.println("50-99           40%     ");
        System.out.println("100 or More     50%     ");
        System.out.println("Enter the number of packages purchased: ");
        pack = Sc.nextInt() ;
        if(pack>=10 && pack<=19 ){
            totalPack = pack*99;
            discount  = totalPack/100*20;
            amount = pack*99 - discount;
            System.out.println("Discount Amount: "+ discount);
            System.out.println("Total Amount: "+amount );
        }
        else if(pack>19 && pack<=49 ) {
            totalPack = pack*99;
            discount  = totalPack/100*30;
            amount = pack*99 - discount;
            System.out.println("Discount Amount: "+ discount);
            System.out.println("Total Amount: "+amount );
        }
        else if(pack>49 && pack<=99){
            totalPack = pack*99;
            discount  = totalPack/100*40;
            amount = pack*99 - discount;
            System.out.println("Discount Amount: "+ discount);
            System.out.println("Total Amount: "+amount );
        }
        else if( pack>=100){
            totalPack = pack*99;
            discount  = totalPack/100*50;
            amount = pack*99 - discount;
            System.out.println("Discount Amount: "+ discount);
            System.out.println("Total Amount: "+amount );
        }
    }
    
}
