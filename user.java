package projectpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class user {
    
 public String find(String domain)
    {
        String ip="";
        try
        {
            Connection con =DriverManager.getConnection("jdbc:sqlite:database.db");
            PreparedStatement ss=con.prepareStatement("select * from data");
            ResultSet r = ss.executeQuery();
            while(r.next())
            {
                if(r.getString("DomainName").equalsIgnoreCase(domain))
                    ip=r.getString("IPAddress");
            }
            if(ip=="")
                ip="not found";
        }catch(SQLException ee)
        {
            System.out.print(ee.getMessage());
        }
        return ip;
    }
    
}
