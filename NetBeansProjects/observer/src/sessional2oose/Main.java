
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessional2oose;

import java.util.ArrayList;
import sessional2oose.observer;

/**
 *
 * @author Student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        customer c1=new customer();
         c1.setcustomername("Umair"); 
         customer c2=new customer();
         c2.setcustomername("Ansar"); 
        customer c3=new customer();
        c3.setcustomername("Aslam");
        customer c4=new customer();
        c4.setcustomername("Haider");
        customer c5=new customer();
        c4.setcustomername("Usman Haider ");
        customer c6=new customer();
        c4.setcustomername("Faraz Ahmed");
        products mychee=new products();
         mychee.setproductName("Laptops");
         mychee.setavailable(true);
         mychee.registerobserver(c1);
         c1.update("Microphone");
        System.out.println("\n\n"); 
         mychee.setproductName("Phone Data Cables");
         mychee.setavailable(false);
         mychee.registerobserver(c2);
         System.out.println("\n\n");
         mychee.setproductName("Computer pins");
         mychee.setavailable(true);
         System.out.println("\n\n");
         mychee.registerobserver(c3);
         c1.update("magnetic pins");
          mychee.setproductName("charger");
         mychee.setavailable(false);
         mychee.registerobserver(c4);
         mychee.setproductName("devices");
         mychee.setavailable(true);
         mychee.registerobserver(c5);
         c1.update("power devices");
         mychee.setproductName("keyboared");
         mychee.setavailable(false);
         mychee.registerobserver(c6);
             
    }

}


interface observer{
    
 void update();

    public void update(String productname);
 
}
interface subject
{
    void registerobserver();
    void removeobserver();
    void notifyobserver();
}

class customer implements observer
{
    private String customername;
    private subject Subject;
  String  getcustomername()
    {
        return customername;
    }
  void setcustomername(String customername)
  {
      this.customername=customername;
  }
  
  public subject getsubject()
  {
      return Subject;
          }
  void setsubject(subject Subject)
  {
      this.Subject=Subject;
  }
  public void update(String productname)
  {
      System.out.println("yes :: "+customername+" , "+productname+" :: is now  ");
  }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  }



class products implements subject
          { String productName;
     customer c;
     
             private String productname;
           private ArrayList <observer> listofobserver=new ArrayList<observer>(10);  
        public ArrayList<observer> getlistofobserver()
        {
            return listofobserver;
        }
        
        public void setlistofobserver(ArrayList<observer> listofobserver)
        {
            this.listofobserver=listofobserver;
        }
        
       void registerobserver(observer observer)
       {
         listofobserver.add(observer);  
       }
        void removeobserver(observer observer)
        {
           listofobserver.remove(observer);
        }
        void notifyObserver()
        {
            System.out.println("Notify all observer when product is available");
            listofobserver.forEach((observer)->
            {
                observer.update(productname);
            });
        }
        public String getproductName(){
            return productName;
        }
        public void setproductName( String productName){
            this.productName=productName;
        }
     private boolean available;
     
     void setavailable(boolean available)
        {
            this.available=available;
            if(available==true)
            {
                notifyObserver();
            }
        }

    @Override
    public void registerobserver() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeobserver() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifyobserver() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }}

      

