package projectpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class connectSQL {
    
    static PreparedStatement ps;
    
    public void addData(String username,String password,String email,String telephone,String user) throws SQLException
    {
        
        Connection con =DriverManager.getConnection("jdbc:sqlite:database.db");
        String query="insert into userData values(?,?,?,?,?)";
                ps=con.prepareStatement(query);
                ps.setString(1,username);
                ps.setString(2,password);
                ps.setString(3,email);
                ps.setString(4,telephone);
                ps.setString(5,user);
                ps.execute();
    }


public String checkData(String username,String password)
    {
        String user ="";
        try {
                Connection con =DriverManager.getConnection("jdbc:sqlite:database.db");
                ps=con.prepareStatement("select * from userData");
                ResultSet r = ps.executeQuery();
              
                while(r.next())
                {
                    if(r.getString("username").equalsIgnoreCase(username))
                    {
                        if(r.getString("password").equalsIgnoreCase(password))
                        {
                            System.out.println("ok");
                            if(r.getString("person").equalsIgnoreCase("user"))
                                user="user";
                            else if(r.getString("person").equalsIgnoreCase("manager"))
                                user="manager";
                            else if(r.getString("person").equalsIgnoreCase("admin"))
                                user="admin";
                            else
                                user="not exist";
                        }
                        else
                            user="wrong";
                    }
                    else
                        user="wrong user";
                }
                
            } catch (SQLException ex) {
                System.out.print(ex.getMessage());
            }
            return user;
    }

}
        
