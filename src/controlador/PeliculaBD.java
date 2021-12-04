
package controlador;
import java.sql.*;
import modelo.Pelicula;

public class PeliculaBD {
    
    Connection conexion;
    PreparedStatement stInsertar; 
    PreparedStatement stConsulta;
    PreparedStatement stActualizar;
    PreparedStatement stEliminar;
    
    public PeliculaBD(){
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
            stInsertar = conexion.prepareStatement("INSERT INTO Pelicula VALUES (?,?,?,?,?,?)");
            stConsulta = conexion.prepareStatement("SELECT * FROM Pelicula WHERE Codigo=?");
            stActualizar = conexion.prepareStatement("UPDATE Pelicula set Nombre=?, Duracion=?, Clasificacion=?, Genero=?, Idioma=? WHERE Codigo=?");
            stEliminar = conexion.prepareStatement("DELETE FROM Pelicula WHERE Codigo=?");
        
        }catch(SQLException ex){
            System.out.println("Error en abrir la base de datos");
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
    
    public void insertarRegistro(Pelicula objPeli){
        try {
            stInsertar.setString(1, objPeli.getCodigo());
            stInsertar.setString(2, objPeli.getNombre());
            stInsertar.setString(3, objPeli.getDuracion());
            stInsertar.setString(4, objPeli.getClasificacion());
            stInsertar.setString(5, objPeli.getGenero());
            stInsertar.setString(6, objPeli.getIdioma());
        } catch (SQLException ex) {
            System.out.println("Error insertar en bd");
            System.out.println(ex.getMessage());
        }
    }
    
    public Pelicula consultarRegistro(String Codigo){
        Pelicula objPeli = null;
            ResultSet rs = null;
        
        try {
            stConsulta.setString(1, Codigo);
            rs = stConsulta.executeQuery();
            
            if(rs.next()){
                objPeli = new Pelicula();
                objPeli.setCodigo(rs.getString("Codigo"));
                objPeli.setNombre(rs.getString("Nombre"));
                objPeli.setDuracion(rs.getString("Duracion"));
                objPeli.setClasificacion(rs.getString("Clasificacion"));
                objPeli.setGenero(rs.getString("Genero"));
                objPeli.setIdioma(rs.getString("Idioma"));
            }
            
        } catch (SQLException ex) {
            System.out.println("Error en colsulta de alumno");
            System.out.println(ex.getMessage());
        }
        
        return objPeli;
    }
    
    public void actualizarRegistro(Pelicula objPeli){
        try {
            stInsertar.setString(1, objPeli.getNombre());
            stInsertar.setString(2, objPeli.getDuracion());
            stInsertar.setString(3, objPeli.getClasificacion());
            stInsertar.setString(4, objPeli.getGenero());
            stInsertar.setString(5, objPeli.getIdioma());
            stInsertar.setString(6, objPeli.getCodigo());
            
            stActualizar.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al actualizar");
            System.out.println(ex.getMessage());
        }
    }
    
    public void eliminarRegistro(Pelicula objPeli){
        try{
            stEliminar.setString(1, objPeli.getCodigo());
            stEliminar.executeUpdate();
        }catch(SQLException ex){
            System.out.println("Error en eliminar");
            System.out.println(ex.getMessage());
        }
        
    }
}
