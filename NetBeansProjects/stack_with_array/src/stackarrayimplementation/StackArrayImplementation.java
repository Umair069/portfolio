
package stackarrayimplementation;

import java.util.Scanner;

public class StackArrayImplementation {
stack obj=new stack();
       Scanner input=new Scanner(System.in);
    //   System.out.println(" INSERTION");
       int top=obj.push();


class stack{
    int size=0;
    int top=-1;
    int num;
    int[] stack =new int[5];
    int push(){
        Scanner input=new Scanner(System.in);
        System.out.println(" Enter Number ");
        num=input.nextInt();
        if(top==4){
            System.out.println(" STACK OVERFLOW ");
        }
        top=top+1;
        stack[top]=num;
    
        return top;
}
    
    int Pop(int top){
        if(top==-1){
            System.out.println(" Stack is Empty\n Nothing to Delete ");
        }
        else{
            top=top-1;
        }
        return top;
    }
}
}
