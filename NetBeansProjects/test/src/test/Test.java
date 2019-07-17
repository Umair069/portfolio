package test;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.util.*;
class gui extends JFrame implements ActionListener {
    list li = new list ();
    JButton ad;
    JTextField t,t1;
    JTextField t2;
    JTable table  = new JTable (new table_model());
     
    public gui (){
         
        setSize(500,500);
        setTitle("DEMO");
        setLocationRelativeTo(null);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,2));
        t = new JTextField ("");
        add(t);
        t1 = new JTextField ("");
        add(t1);
        ad = new JButton ("add");
        ad.addActionListener(this);
        add(ad);
        add(table);
    }
     
    public class table_model extends AbstractTableModel {
        public list data;
        String [] columns = {"Name","Price",
        };
         
        public void addList (list data){
             
            this.data = data;
        }
        @Override
        public int getColumnCount() {
        return columns.length;
        }
        @Override
        public int getRowCount() {
         return data.size();
       }
        @Override
           public String getColumnName(int col) {
            return columns[col];
        }
       
        @Override
        public Object getValueAt(int row, int col)
        {
           return table.getValueAt(data.size(), col);
        }  
 
     
         
    }
     
    @Override
    public void actionPerformed (ActionEvent e){
         
         
        if (e.getSource() == ad && !t.equals("")){
             
            li.addHead(t.getText(),Integer.parseInt(t1.getText()));
         
        }
         
         
         
    }
     
     
     
     
}
 
class test{
     
    public static void main (String [] aed){
         
        gui g = new gui();
        g.setVisible (true);
         
    }
}