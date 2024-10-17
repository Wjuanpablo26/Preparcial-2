package co.edu.uniquindio.poo.model;

import java.util.Date;

public class PersonalApoyo extends Persona{

    private int experienciaLaboral;

    /*
     * Constructor de la clase Entrenador
     */
    public PersonalApoyo(String nombre, String apellido, String nacionalidad,Date fechaNaciemiento, int experienciaLaboral){
        super(nombre, apellido,nacionalidad,fechaNaciemiento);
        assert experienciaLaboral > 0 : "La experiencia laboral debe ser mayor a cero";
        this.experienciaLaboral = experienciaLaboral;
    }
    
    /*
     * Metodos gets y sets
     */
    public int getExperienciaLaboral(){
        return experienciaLaboral;
    }

    public void setExperienciaLaboral(int experienciaLaboral){
        this.experienciaLaboral = experienciaLaboral;
    }
    
}
