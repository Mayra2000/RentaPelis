
package controlador;
import java.sql.*;

public class PersonaBD{
    
    Connection conexion;
    
    public PersonaBD(){
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException ex){
            System.out.println("Error al cargar el driver");
            System.out.println(ex.getMessage());
        }
    }
    
    public void abrir(){
        try{
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/peliculas?serverTimezone=GMT-5", "root","");
        }catch(SQLException ex){
            System.out.println("Error en abrir");
            System.out.println(ex.getMessage());
        }
    }
}