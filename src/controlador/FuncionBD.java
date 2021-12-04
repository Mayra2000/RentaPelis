
package controlador;
import java.sql.*;
import modelo.Funcion;

public class FuncionBD {
    
    Connection conexion;
    PreparedStatement stInsertar; 
    PreparedStatement stConsulta;
    PreparedStatement stActualizar;
    PreparedStatement stEliminar;
    
    public FuncionBD(){
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
            stInsertar = conexion.prepareStatement("INSERT INTO Funcion VALUES (?,?,?,?,?)");
            stConsulta = conexion.prepareStatement("SELECT * FROM Funcion WHERE CodigoPelicula=?");
            stActualizar = conexion.prepareStatement("UPDATE Funcion set Hora=?, Capacidad=?, NumeroDeSala=?, TipoDeSala=? WHERE CodigoPelicula=?");
            stEliminar = conexion.prepareStatement("DELETE FROM Funcion WHERE CodigoPelicula=?");
        
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
    
    public void insertarRegistro(Funcion objFun){
        try {
            stInsertar.setString(1, objFun.getCodigoPelicula());
            stInsertar.setInt(2, objFun.getHora());
            stInsertar.setInt(3, objFun.getCapacidad());
            stInsertar.setInt(4, objFun.getNumeroDeSala());
            stInsertar.setString(5, objFun.getTipoDeSala());
        } catch (SQLException ex) {
            System.out.println("Error insertar en bd");
            System.out.println(ex.getMessage());
        }
    }
    
    public Funcion consultarRegistro(String CodigoPelicula){
        Funcion objFun = null;
        ResultSet rs = null;
        
        try {
            stConsulta.setString(1, CodigoPelicula);
            rs = stConsulta.executeQuery();
            
            if(rs.next()){
                objFun = new Funcion();
                objFun.setCodigoPelicula(rs.getString("CodigoPelicula"));
                objFun.setHora(rs.getInt("Hora"));
                objFun.setCapacidad(rs.getInt("Capacidad"));
                objFun.setNumeroDeSala(rs.getInt("NumeroDeSala"));
                objFun.setTipoDeSala(rs.getString("TipoDeSala"));
            }
            
        } catch (SQLException ex) {
            System.out.println("Error en colsulta de alumno");
            System.out.println(ex.getMessage());
        }
        
        return objFun;
    }
    
    public void actualizarRegistro(Funcion objFun){
        try {
            stInsertar.setInt(1, objFun.getHora());
            stInsertar.setInt(2, objFun.getCapacidad());
            stInsertar.setInt(3, objFun.getNumeroDeSala());
            stInsertar.setString(4, objFun.getTipoDeSala());
            stInsertar.setString(5, objFun.getCodigoPelicula());
            
            stActualizar.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al actualizar");
            System.out.println(ex.getMessage());
        }
    }
    
    public void eliminarRegistro(Funcion objFun){
        try{
            stEliminar.setString(1, objFun.getCodigoPelicula());
            stEliminar.executeUpdate();
        }catch(SQLException ex){
            System.out.println("Error en eliminar");
            System.out.println(ex.getMessage());
        }   
    }
}
