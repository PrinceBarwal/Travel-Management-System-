package travel.management.system;
import java.sql.*;
public class Conn {
    Conn(){
        Connection c;
        Statement s;
        try{
            c = DriverManager.getConnection("jdbc://mysql://localhost:3306/travelmanagementsystem" , "root" , "saini@786;");
            s = c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
