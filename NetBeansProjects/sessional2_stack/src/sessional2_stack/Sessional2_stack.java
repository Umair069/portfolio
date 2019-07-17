/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessional2_stack;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Sessional2_stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        stack s1=new stack();
       
       int top= s1.push();
     
      
       
       s1.pop(top);
       
    }
    
}
class stack
{
     
    int top=-1;
    int top2=0;
    int num,k;
    int[] stack =new int[5];
    int size=stack.length;
    int push(){
        for(k=0;k<=size-1;k++)
        {
        Scanner input=new Scanner(System.in);
        System.out.println(" Enter Number ");
        
        num=input.nextInt();
        }
        if(top==size){
            System.out.println(" STACK OVERFLOW ");
        }
        else
        {
            
        top=top+1;
        }
        
        stack[top]=num;
    
        return top;
}
    
    int pop(int top)
    {
        int j,top2=0;
        Scanner s=new Scanner(System.in);
        System.out.println("IF YOU WANT TO DELETE FROM END PRESS 1 and from start press 2");
        int a=s.nextInt();
        if(a==1)
        {
        if(top==-1){
            System.out.println(" Stack is Empty Nothing to Delete ");
        }
        else if(top==size)
        {
            
            System.out.println("overflow");
        }
        else{
            for(j=top;j>=0;j--)
            {
            System.out.println("element delete :: "+stack[top]);
            top=top-1;
        }
        }
        }
        else if (a==2)
        {
            for(int u=0;u<=size-1;u++)
            {
            System.out.println("element delete :: " +stack[u]);
            top2=top2+1;
        }
        }
        return top;
    }
    
    
    void display()
            
    {
        int i;
       if(top==-1)
       {
           System.out.println("underflow");
    }
      else if(top==size)
       {
           System.out.println("over flow");
       }
       else
      {
         
      }
       
    }
}