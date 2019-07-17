
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class database {
    
    public static Connection connection()
   {
      
   String driver= "com.mysql.jdbc.Driver";

    String url="jdbc:mysql://localhost:3306/Airline_M_S";
    String username="root";
    String password="";
    Connection c = null;
try
{
Class.forName(driver);
c = (Connection) DriverManager.getConnection(url,username ,password);
return c;
       
    
}
catch(Exception e)
{

JOptionPane.showMessageDialog(null , e);
return null;
}
    
    
    
   }
}
