package projectpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static projectpl.connectSQL.ps;

public class manager extends user 
{
    public void edit(String ip,String domain)
    {
        try
       {
            Connection con =DriverManager.getConnection("jdbc:sqlite:database.db");
            String query="update data set  DomainName=? where IPAddress=? ";
                ps=con.prepareStatement(query);
                ps.setString(1,domain);
                ps.setString(2,ip);
                ps.execute();
            
       }catch(SQLException ee)
       {
           System.out.print(ee.getMessage());
       }
    }
    
    
    public ArrayList<table> getData()
    {
        ArrayList<table> data =new ArrayList<>();
       
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:database.db"); 
            ps=con.prepareStatement("select * from data");
            ResultSet r=ps.executeQuery();
            while(r.next())
            {
                table t1 = new table(r.getString("DomainName"),r.getString("IPAddress"));
                data.add(t1);
            }
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
       return data;
    }
}
    
     
    
    
 


