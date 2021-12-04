
package controlador;
import java.sql.*;
import modelo.Persona;

public class PersonaBD{
    
    Connection conexion;
    PreparedStatement stInsertar; 
    PreparedStatement stConsulta;
    PreparedStatement stActualizar;
    PreparedStatement stEliminar;
    
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
            stInsertar = conexion.prepareStatement("INSERT INTO Persona VALUES (?,?,?,?)");
            stConsulta = conexion.prepareStatement("SELECT * FROM Persona WHERE NumEmpleado=?");
            stActualizar = conexion.prepareStatement("UPDATE Persona set Contrasenia=?, NombreEmp=?, Edad=? WHERE NumEmpleado=?");
            stEliminar = conexion.prepareStatement("DELETE FROM Persona WHERE NumEmpleado=?");
        
        }catch(SQLException ex){
            System.out.println("Error en abrir");
            System.out.println(ex.getMessage());
        }
    }
    
    public void cerrar(){
        try{
            conexion.close();
        }catch(SQLException ex){
            System.out.println("Error cerrar");
            System.out.println(ex.getMessage());
        }
    }
    
    public void insertarRegistro(Persona objPer){
        try {
            stInsertar.setInt(1, objPer.getNumEmpleado());
            stInsertar.setString(2, objPer.getNombreEmp());
            stInsertar.setString(3, objPer.getContrasenia());
            stInsertar.setInt(4, objPer.getEdad());
            
        } catch (SQLException ex) {
            System.out.println("Error insertar en bd");
            System.out.println(ex.getMessage());
        }
    }
    
    public Persona consultarRegistro(int NumEmpleado){
        Persona objPer = null;
        ResultSet rs = null;
        
        try {
            stConsulta.setInt(1, NumEmpleado);
            rs = stConsulta.executeQuery();
            
            if(rs.next()){
                objPer = new Persona();
                objPer.setNumEmpleado(rs.getInt("NumEmpleado"));
                objPer.setContrasenia(rs.getString("Contrasenia"));
                objPer.setNombreEmp(rs.getString("NombreEmp"));
                objPer.setEdad(rs.getInt("Edad"));
            }
            
        } catch (SQLException ex) {
            System.out.println("Error en colsulta de alumno");
            System.out.println(ex.getMessage());
        }
        
        return objPer;
    }
    
    public void actualizarRegistro(Persona objPer){
        try {
            stInsertar.setString(1, objPer.getNombreEmp());
            stInsertar.setString(2, objPer.getContrasenia());
            stInsertar.setInt(3, objPer.getEdad());
            stInsertar.setInt(4, objPer.getNumEmpleado());
            
            stActualizar.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al actualizar");
            System.out.println(ex.getMessage());
        }
    }
    
    public void eliminarRegistro(Persona objPer){
        try{
            stEliminar.setInt(1, objPer.getNumEmpleado());
            stEliminar.executeUpdate();
        }catch(SQLException ex){
            System.out.println("Error en eliminar");
            System.out.println(ex.getMessage());
        }   
    }
}