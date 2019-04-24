
package comision1917conexionabd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Comision1917ConexionABD {

  
    public static void main(String[] args) {
       Connection con;
       //no se le pone new porque es una clase estatica
       
       try{
           con = DriverManager.getConnection("jdbc:mysql://localhost/estudiantes", "root","");
                   
       ResultSet consulta;
       Statement stmt = con.createStatement();
       consulta = stmt.executeQuery("SELECT * FROM ESTUDIANTES");
               
               
       while(consulta.next()){
           System.out.print(consulta.getString("nombre") + ",");
           System.out.println(consulta.getString("apellido"));
       }
       }catch (SQLException ex){
           System.out.println(ex);
       }
           
       }
       }
    
    

