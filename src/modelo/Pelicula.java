/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author DavVF
 */
public class Pelicula {
    
    private String Codigo;
    private String Nombre;
    private String Duracion;
    private String Clasificacion;
    private String Genero;
    private String Idioma;

    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String Clasificacion) {
        this.Clasificacion = Clasificacion;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDuracion() {
        return Duracion;
    }

    public void setDuracion(String Duracion) {
        this.Duracion = Duracion;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }

    public String mostrarDatos(){
        
        String info= "Codigo: "+ getCodigo()+"\n"+
                     "Nombre: "+ getNombre()+"\n"+
                     "Duracion: "+ getDuracion()+"\n"+
                     "Genero: "+ getGenero()+"\n"+
                     "Idioma: "+ getIdioma()+"\n";
                     
    return info;                 
    }
}
