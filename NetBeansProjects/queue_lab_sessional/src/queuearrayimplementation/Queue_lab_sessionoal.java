
package queuearrayimplementation;

import java.util.Scanner;

/**
 *
 * @author LARAIB
 */
public class Queue_lab_sessionoal {

    public static void main(String[] args) {
    Queue obj=new Queue();
       
    obj.insert();
        System.out.println(" delete node  form last and front  ");
        System.out.println("Enter no 1 to delete from front and enter no 2 delete from rear");
        Scanner s=new Scanner(System.in);
        int no=s.nextInt();
    obj.delete_from_front(no);
   // int no2=s.nextInt();
    obj.delete_from_rear(no);
    
    }
    
}
class Queue{
    int front=-1;
    int rear=-1;
    int[] Queue=new int[5];
    void insert(){
        int num;
        System.out.println(" Enter length of element under or equal to 5 ");
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        for(int i=0;i<size;i++)
        {
        if(rear==size-1)
        {
            System.out.println("Queue Overflow");
        }
        else{
            if(front==-1)
            {
                front=0;
            }
            System.out.println(" Enter elements you need ");
            num=s.nextInt();
            rear=rear+1;
            Queue[rear]=num;
        }
        }
    }
  
    
    void delete_from_front(int no)
    {
          if(no==1)
          {
        if(front==-1 || front > rear)
        {
            System.out.println(" Queue Overflow here ");
        }
        else{
            System.out.println("\n");
            System.out.println(" Queue Element deleted from front=="+Queue[front]);
            front=front+1;
       
        }
    }
    }
    
    void delete_from_rear(int no)
    {
        if(no==2)
        {
             System.out.println("\n");
            System.out.println("Element delete also from rear=="+Queue[rear]);
            rear=rear-1;
    }
    }
}



