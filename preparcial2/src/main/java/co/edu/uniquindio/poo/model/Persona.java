package co.edu.uniquindio.poo.model;

import java.util.Date;

public abstract class  Persona {

    private String nombre,apellido,nacionalidad;
    private Date fechaNacimiento;
    
    /*
     * Constructor de la clase Persona
     */
    public Persona( String nombre, String apellido, String nacionalidad, Date fechaNacimiento){
        assert nombre !=null && !nombre.isBlank() : "El nombre es requerido";
        assert apellido !=null && !apellido.isBlank() : "El apellido es requerido";
        assert nacionalidad !=null && !nacionalidad.isBlank() : "La nacionalidad es requerida";
        assert fechaNacimiento !=null : "La fecha de nacimiento es requerida";
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        
    }

    /*
     * Metodos gets y sets
     */
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getNacionalidad(){
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad){
        this.nacionalidad=nacionalidad;
    }

    public Date getFechaNacimiento(){
        return fechaNacimiento;
    }

    public void setFechaNacimiento( Date fechaNacimiento){
        this.fechaNacimiento=fechaNacimiento;
    }

    
}
