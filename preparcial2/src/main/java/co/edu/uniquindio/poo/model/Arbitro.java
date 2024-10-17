package co.edu.uniquindio.poo.model;
import java.util.Date;

public class Arbitro extends Persona{

    private String categoria;

    /*
     * Constructor de la clase Arbitro
     */
    public Arbitro(String nombre, String apellido,String nacionalidad, Date fechaNacimiento, String categoria){
        super(nombre,apellido,nacionalidad,fechaNacimiento);
        assert categoria !=null && !categoria.isBlank(): "La categoria es requerida para el arbitro";
        this.categoria = categoria;
    }
    
    /*
     * Metodos gets y sets
     */

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
}
