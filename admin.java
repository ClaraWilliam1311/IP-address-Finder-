package projectpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static projectpl.connectSQL.ps;



public class admin extends manager
{
    
    public void add_row(String ip, String domain)
    {
       try
       {
            Connection con =DriverManager.getConnection("jdbc:sqlite:database.db");
            String query="insert into data values(?,?)";
                ps=con.prepareStatement(query);
                ps.setString(1,ip);
                ps.setString(2,domain);
                ps.execute();
            
       }catch(SQLException ee)
       {
           System.out.print(ee.getMessage());
       }
    }
    
    
    
    public void delete(String ip,String domain)
    {
        try
       {
            Connection con =DriverManager.getConnection("jdbc:sqlite:database.db");
            String query="delete from data where IPAddress=? and DomainName=?";
                ps=con.prepareStatement(query);
                ps.setString(1,ip);
                ps.setString(2,domain);
                ps.execute();
            
       }catch(SQLException ee)
       {
           System.out.print(ee.getMessage());
       }
        
    }
 
}
