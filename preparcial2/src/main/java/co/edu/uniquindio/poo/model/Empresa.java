package co.edu.uniquindio.poo.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Empresa {

    private String nombre;
    private List<EventoDeportivo> eventosDeportivos;

    /*
     * Constructor de la clase Empresa
     */
    public Empresa(String nombre){
        assert nombre !=null && !nombre.isBlank(): "El nombre de la empresa es requerido";
        this.nombre = nombre;
        this.eventosDeportivos = new ArrayList<>();
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

    public List<EventoDeportivo> getEventosDeportivos(){
        return eventosDeportivos;
    }

    public void setEventosDeportivos(List<EventoDeportivo> eventosDeportivos){
        this.eventosDeportivos = eventosDeportivos;
    }

    /*
     * Metodo para agregar un evento deportivo
     */
    public void agregarEventoDeportivo(EventoDeportivo eventoDeportivo){
        assert eventoDeportivo !=null: "El evento deportivo no puede ser nulo";
        eventosDeportivos.add(eventoDeportivo);
    }

    /*
     * Metodo para eliminar un evento deportivo
     */
    public void eliminarEventoDeportivo(EventoDeportivo eventoDeportivo){
        assert eventoDeportivo !=null: "El evento deportivo no puede ser nulo";
        eventosDeportivos.remove(eventoDeportivo);
    }

    /*
     * Metodo para buscar un evento deportivo por nombre
     */
    public EventoDeportivo buscarEventoDeportivo(String nombre){
        assert nombre !=null && !nombre.isBlank(): "El nombre del evento deportivo es requerido";
        return eventosDeportivos.stream()
                .filter(eventoDeportivo -> eventoDeportivo.getNombre().equals(nombre))
                .findFirst()
                .orElse(null);
    }

    /*
     * Metodo para buscar un evento deportivo por deporte
     */
    public EventoDeportivo buscarEventoDeportivoPorDeporte(String deporte){
        assert deporte !=null && !deporte.isBlank(): "El deporte del evento deportivo es requerido";
        return eventosDeportivos.stream()
                .filter(eventoDeportivo -> eventoDeportivo.getDeporte().equals(deporte))
                .findFirst()
                .orElse(null);
    }

    /*
     * Metodo para obtener la lista de los atletas que participaron en un eventoDeportivo de natacion de tipo competicion
     */
    public List<Atleta> obtenerAtletasNatacionCompeticion(){
        return eventosDeportivos.stream()
                .filter(eventoDeportivo -> eventoDeportivo.getDeporte().equals("natacion") && eventoDeportivo.getTipoEvento().equals(TipoEvento.COMPETICION))
                .flatMap(eventoDeportivo -> eventoDeportivo.getAtletas().stream())
                .collect(Collectors.toList());
    }

    /*
     * Metodo para obtener los atletas que pertenecen a 3 equipos
     */
    public List<Atleta> obtenerAtletasTresEquipos(){
        return eventosDeportivos.stream()
                .filter(eventoDeportivo -> eventoDeportivo.getEquipos().size() == 3)
                .flatMap(eventoDeportivo -> eventoDeportivo.getAtletas().stream())
                .collect(Collectors.toList());
    }

    /*
     * Metodo para obtener los atletas que pertenecen a un equipo de un pais especifico
     */
    public List<Atleta> obtenerAtletasEquipoPais(String pais){
        return eventosDeportivos.stream()
                .flatMap(eventoDeportivo -> eventoDeportivo.getEquipos().stream())
                .filter(equipo -> equipo.getPais().equals(pais))
                .flatMap(equipo -> equipo.getAtletas().stream())
                .collect(Collectors.toList());
    }

    /*
     * Metodo para obtener los atletas que perteneces a mas de 2 eventos deportivos
     */
    public List<Atleta> obtenerAtletasMasDosEventos(){
        return eventosDeportivos.stream()
                .flatMap(eventoDeportivo -> eventoDeportivo.getAtletas().stream())
                .collect(Collectors.groupingBy(atleta -> atleta, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 2)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
