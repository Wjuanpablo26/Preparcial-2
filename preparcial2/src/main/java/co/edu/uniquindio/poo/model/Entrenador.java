package co.edu.uniquindio.poo.model;
import java.util.Date;

public class Entrenador extends Persona{

    private String especializacion;

    /*
     * Constructor de la clase Entrenador
     */
    public Entrenador(String nombre, String apellido, String nacionalidad,Date fechaNaciemiento, String especializacion){
        super(nombre, apellido,nacionalidad,fechaNaciemiento);
        assert especializacion !=null && !especializacion.isBlank(): "La especializacion es requerida para el entrenador";
        this.especializacion = especializacion;
    }
    
    /*
     * Metodos gets y sets
     */
    public String getEspecializacion(){
        return especializacion;
    }

    public void setEspecializacion(String especializacion){
        this.especializacion = especializacion;
    }
    

}
