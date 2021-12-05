/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author DavVF
 */
public class Funcion extends Pelicula {
    
        private String CodigoPelicula;
        private int Hora;
        private int Capacidad;  
        private int NumeroDeSala;
        private String TipoDeSala;

    public String getCodigoPelicula() {
        return CodigoPelicula;
    }

    public void setCodigoPelicula(String CodigoPelicula) {
        this.CodigoPelicula = CodigoPelicula;
    }

    public int getHora() {
        return Hora;
    }

    public void setHora(int Hora) {
        this.Hora = Hora;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public int getNumeroDeSala() {
        return NumeroDeSala;
    }

    public void setNumeroDeSala(int NumeroDeSala) {
        this.NumeroDeSala = NumeroDeSala;
    }

    public String getTipoDeSala() {
        return TipoDeSala;
    }

    public void setTipoDeSala(String TipoDeSala) {
        this.TipoDeSala = TipoDeSala;
    }
    
    public String mostrarDatos(){
        
        
        String info= "Codigo Pelicula: "+ getCodigoPelicula()+"\n"+
                     "Nombre: "+ getNombre()+"\n"+
                     "Duracion: "+ getHora()+"\n"+
                     "Genero: "+ getCapacidad()+"\n"+
                     "Idioma: "+ getNumeroDeSala()+"\n"+
                     "Genero: "+ getTipoDeSala()+"\n";
    return info;                 
    }
}
