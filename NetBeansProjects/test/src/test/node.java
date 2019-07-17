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
public class node {
     
    public node next,pre;
    public String name;
    public double price;
     
    public node (String n,double p){
         
        this (n,p,null,null);
    }
     
    public node (String n,double p, node ne,node pr){
         
        name = n;
        price = p;
        next = ne;
        pre = pr;
    }
     
}
