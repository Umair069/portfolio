package tree.implementation;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class TreeImplementation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        node obj=new node();
        
        obj.insert();
       
System.out.println("preorder");
     obj.preorder(obj.root);
     
     Scanner ss=new Scanner(System.in);
        System.out.println("For find info");
     int a=ss.nextInt();
    
     obj.search(a);

        System.out.println("Deletion");
      int b=ss.nextInt();
     obj.delete(b);
     System.out.println("preorder");
   obj.preorder(obj.root);
 
      int h=0;
    h=obj.count(obj.root);
        System.out.println("The size is"+h);
     
    // obj.postorder(obj.root);
  //     System.out.println("The minimum value is \n\n"+obj.minimumvalue());
        
        
     System.out.println("The maximum value is \n\n"+obj.maxminumvalue());
        
        
   
        
        
       System.out.println("Height of the tree is \n\n"+obj.maxDepth(obj.root));
        
     
    }
    
}

class node
{
    int info;
    node lchild;
    node rchild;
    
    node root=null;
    node parent,location;
  
    int count=0;
    
    void insert()
    {
        node temp;
        int item; int num;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length");
        num=s.nextInt();
       for(int i=0;i<num;i++)
       {
           System.out.println("The element is");
            item=s.nextInt();
           find(item);
       
        if(location!=null)
        {
            System.out.println("Item already present");
            return;
        }
         temp=new node();
        temp.info=item;
        temp.lchild=null;
        temp.rchild=null;
        
        if(parent==null)
        {
            root=temp;
        }
            else if(item<parent.info)
                    {
                    parent.lchild=temp;
                    }
            else 
                parent.rchild=temp;
        
        
    }
    }
    void find(int item)
    {
        node ptr,ptrsave;
        if(root==null)
        {
            location=null;
            parent=null;
            return;
            
        }
        if(item==root.info)
        {
            location=root;
            parent=null;
            return;
        }
        if(item<root.info)
        {
            ptr=root.lchild;
            
        }
        else
        {
            ptr=root.rchild;
        }
        ptrsave=root;
        
        while(ptr!=null)
        {
          if(item==ptr.info)
          {
              location=ptr;
              parent=ptrsave;
              return;
          }
          ptrsave=ptr;
          
          if(item<ptr.info)
          {
              ptr=ptr.lchild;
              
        }
          else
              ptr=ptr.rchild;
          
    }
          location=null;
          parent=ptrsave;
          
          
}
   int count(node ptr)
   {
       
       if(root==null)
       {
           System.out.println("Tree is empty");
           
       }
       if(ptr!=null)
       {
            count++;
            count(ptr.lchild);
            count(ptr.rchild);
            
       }
       return count;
   }

    
    
    void preorder(node ptr)
    {
       if(root==null)
       {
           System.out.println("Tree is empty");
           return;
       }
       if(ptr!=null)
       {
           
            System.out.println("the data is== "+ptr.info);
            preorder(ptr.lchild);
            preorder(ptr.rchild);
            
       }
    }
    
    void postorder(node ptr)
    {
    if(root==null)
    {System.out.println("tree empty");
    return;
    }
    if(ptr!=null)
    {
         System.out.println("the data is== "+ptr.info);
           
            preorder(ptr.rchild);
             preorder(ptr.lchild);
    }
    
    }
  
    
    void delete(int item)
{
//	node parent=new node(), location=new node();
	if(root==null)
	{
		System.out.println("Tree is empty");
		return;
	}
	find(item);
	if(location==null)
	{
            System.out.println("Item not present in tree"); 
            return;
	}
	if((location.lchild==null)&&(location.rchild==null))
            casea(parent,location);
	if((location.lchild!=null)&&(location.rchild==null))
            caseb(parent,location);
	if((location.lchild==null)&&(location.rchild!=null))
            caseb(parent,location);
	if((location.lchild!=null)&&(location.rchild!=null))	
            casec(parent,location);
	//free(location);
}
void casea(node par, node loc)
{ 
	if(par==null)	root=null;
	else if(loc==par.lchild)	par.lchild=null;
	else par.rchild=null;
}
void caseb(node par, node loc)
{
	node child;
	
	if(loc.lchild!=null)	child=loc.lchild;
	else child=loc.rchild;
	
	if(par==null)	root=child;
	else if(loc==par.lchild)	par.lchild=child;
	else par.rchild=child;
}
void casec(node par,node loc)
{
	node ptr, ptrsave, suc, parsuc;
	
	ptrsave=loc;
	ptr=loc.rchild;
	while(ptr.lchild!=null)
	{
		ptrsave=ptr;
		ptr=ptr.lchild;
	}
	suc=ptr;
	parsuc=ptrsave;

	if(suc.lchild==null && suc.rchild==null)	casea(parsuc,suc);
	else caseb(parsuc,suc);
	
	if(par==null)	root=suc;
	else if(loc==par.lchild)	par.lchild=suc;
	else par.rchild=suc;

	suc.lchild=loc.lchild;
	suc.rchild=loc.rchild;
}


          
          void search(int item){
              
              find(item);
              if(location==null){
                  System.out.println("item not present");
              }
              else if (item==root.info)
             {
                  System.out.println("location =="+location.info+"==and parent is null");
                 
              }
              else 
              {
                  System.out.println("Your Parent is"+parent.info);
                  System.out.println("Your location is"+location.info); 
              
          }
             
          }
          
     
           
           int maxminumvalue()
           {
               node current=root;
               
               while(current.rchild!=null)
               {
                 current=current.rchild;  
               }
               return (current.info);
           }
          
   
          
           int maxDepth(node p)  
    { 
        if (p == null) 
        {
            return 0;
        } 
        else 
        { 
            /* compute the depth of each subtree */
            int lDepth = maxDepth(p.lchild); 
            int rDepth = maxDepth(p.rchild); 
   
            /* use the larger one */
            if (lDepth > rDepth) 
                return (lDepth + 1); 
             else 
                return (rDepth + 1); 
        } 
        
    }

          
          
          
         
          
         
          }
          
    

