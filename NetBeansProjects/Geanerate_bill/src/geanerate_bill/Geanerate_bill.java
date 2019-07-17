/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geanerate_bill;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class Geanerate_bill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)   {
        // TODO code application logic here
           GetPlanFactory planFactory = new GetPlanFactory();  
        
      System.out.print("Enter the name of plan for which the bill will be generated: ");  
    
        Scanner ss=new Scanner(System.in);
        String planName=ss.next();
     
      System.out.print("Enter the number of units for bill will be calculated: ");  
     
      int units=ss.nextInt();
       
  
      Plan p = planFactory.getPlan(planName);  
      //call getRate() method and calculateBill()method of DomesticPaln.  
  
       System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");  
           p.getRate();  
           p.calculateBill(units); 
    }
    
}
