/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author hp
 */
public class list {
     
    public node head, tail;
     
    public list (){
         
        head = tail = null;
    }
     
    public void addHead (String n,double p){
         
        if (head != null){
             
            head = new node (n,p,head, null);
            head.next.pre = head;
        }
         
        else
            head = tail = new node (n,p);
    }
     
      public int  size (){
         
          int size = 0;
        for(node n = head; n!= null; n = n.next){
          size++; 
        }  
          return size;
    }
     
    public String print (){
        String s = "";
        if (head !=null){
             
            for (node p = head; p !=null; p = p.next)
                return p.name +"\t"+ p.price;
                 
        }
         
        return s;
         
    }
}