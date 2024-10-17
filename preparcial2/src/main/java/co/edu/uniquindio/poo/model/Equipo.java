package co.edu.uniquindio.poo.model;
import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String nombre,pais;
    private List<Atleta> atletas;
    
    /*
     * Constructor de la clase Equipo
     */
    public Equipo(String nombre,String pais,List<Atleta> atletas){
        assert nombre != null && !nombre.isBlank(): "El nombre del equipo no puede ser nulo o vacio";
        assert pais != null && !pais.isBlank(): "El pais del equipo no puede ser nulo o vacio";
        assert atletas != null && !atletas.isEmpty(): "El equipo debe tener al menos un atleta";
        this.nombre = nombre;
        this.pais = pais;
        this.atletas = new ArrayList<>();
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

    public String getPais(){
        return pais;
    }

    public void setPais(String pais){
        this.pais = pais;
    }

    public List<Atleta> getAtletas(){
        return atletas;
    }

    public void setAtletas(List<Atleta> atletas){
        this.atletas = atletas;
    }

    /*
     * Metodo para agregar un atleta al equipo
     */
    public void agregarAtleta(Atleta atleta){
        assert atleta !=null: "El atleta no puede ser nulo";
        atletas.add(atleta);
    }
}
