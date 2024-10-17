package co.edu.uniquindio.poo.model;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class EventoDeportivo {

    private String nombre,deporte,pais,ciudad;
    private Date fechaInicio;
    private TipoEvento tipoEvento;
    private List<Persona> participantes;
    private List<Equipo> Equipos;
    private List<Atleta> atletasNatacion;
    
    /*
     * Constructor de la clase EventoDeportivo
     */
    public EventoDeportivo(String nombre, String deporte,String pais, String ciudad,Date fechaInicio, TipoEvento tipoEvento){
        assert nombre !=null && !nombre.isBlank(): "El nombre es requerido para el evento";
        assert deporte !=null && !deporte.isBlank(): "El deporte es requerido para el evento";
        assert pais !=null && !pais.isBlank(): "El pais es requerido para el evento";
        assert ciudad !=null && !ciudad.isBlank(): "La ciudad es requerida para el evento";
        assert fechaInicio !=null : "La fecha de inicio es requerida para el evento";
        assert tipoEvento !=null : "El tipo de evento es requerido para el evento";
        this.nombre = nombre;
        this.deporte = deporte;
        this.pais = pais;
        this.ciudad = ciudad;
        this.fechaInicio = fechaInicio;
        this.tipoEvento = tipoEvento;
        this.participantes = new ArrayList<>();
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

    public String getDeporte(){
        return deporte;
    }

    public void setDeporte(String deporte){
        this.deporte = deporte;
    }

    public String getPais(){
        return pais;
    }

    public void setPais(String pais){
        this.pais = pais;
    }

    public String getCiudad(){
        return ciudad;
    }

    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }

    public Date getFechaInicio(){
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio){
        this.fechaInicio = fechaInicio;
    }

    public TipoEvento getTipoEvento(){
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento){
        this.tipoEvento = tipoEvento;
    }

    public List<Persona> getParticipantes(){
        return participantes;
    }

    public void setParticipantes(List<Persona> participantes){
        this.participantes = participantes;
    }

    public List<Equipo> getEquipos(){
        return Equipos;
    }

    public void setEquipos(List<Equipo> equipos){
        this.Equipos = equipos;
    }

    public List<Atleta> getAtletas(){
        return atletasNatacion;
    }

    public void setAtletas(List<Atleta> atletas){
        this.atletasNatacion = atletas;
    }



    /*
     * Metodos CRUD PARA PARTICIPANTES
     */
    public void agregarParticipante(Persona participante){
        assert participante !=null: "El participante no puede ser nulo";
        participantes.add(participante);
    }

    public void eliminarParticipante(Persona participante){
        assert participante !=null: "El participante no puede ser nulo";
        participantes.remove(participante);
    }

    public void actualizarParticipante(Persona participante){
        assert participante !=null: "El participante no puede ser nulo";
        int index = participantes.indexOf(participante);
        if(index != -1){
            participantes.set(index,participante);
        }
    }

    public Persona buscarParticipante(String nombre){
        assert nombre !=null && !nombre.isBlank(): "El nombre del participante es requerido";
        for(Persona participante: participantes){
            if(participante.getNombre().equals(nombre)){
                return participante;
            }
        }
        return null;
    }

    /*
     * Metodo para obtener los atletas de natacion de tipo competicion
     */
    public List<Atleta> obtenerAtletasNatacion(){
        List<Atleta> atletasNatacion = new ArrayList<>();
        for(Persona participante: participantes){
            if(participante instanceof Atleta){
                Atleta atleta = (Atleta) participante;
                if(atleta.getDeporte().equals("natacion") && this.getTipoEvento().equals(TipoEvento.COMPETICION)){
                    atletasNatacion.add(atleta);
                }
            }
        }
        return atletasNatacion;
    }

}
