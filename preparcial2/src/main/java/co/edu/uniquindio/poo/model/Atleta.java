package co.edu.uniquindio.poo.model;
import java.util.Date;

public class Atleta extends Persona {

    private int experiencia;
    private String Deporte;

    /*
     * Constructor de la clase Atleta
     */
    public Atleta (String nombre, String apellido,String nacionalidad, Date fechaNacimiento,int experiencia, String Deporte){
        super(nombre,apellido,nacionalidad,fechaNacimiento);
        assert experiencia > 0 : "La experiencia debe ser mayor a cero";
        assert Deporte !=null && !Deporte.isBlank(): "El deporte es requerido para el atleta";
        this.Deporte = Deporte;
        this.experiencia = experiencia;
    }

    /*
     * Metodos gets y sets
     */
    public int getExperiencia(){
        return experiencia;
    }

    public void setExperiencia(int experiencia){
        this.experiencia = experiencia;
    }

    public String getDeporte(){
        return Deporte;
    }

    public void setDeporte(String Deporte){
        this.Deporte = Deporte;
    }
}
