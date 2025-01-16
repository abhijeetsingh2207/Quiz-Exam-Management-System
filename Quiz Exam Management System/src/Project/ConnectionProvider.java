/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
//import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Acer
 */
public class ConnectionProvider {
    public static Connection getCon(){
    try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quizproject");
return con;
}
    
    catch(Exception e)
    { 
        return null;
    }
    }
    public static void closeCon(Connection con){
    if(con !=null)
    {
    
try{
   con.close();
}  catch(SQLException e){
 
e.printStackTrace();
}
    }
    }

}
