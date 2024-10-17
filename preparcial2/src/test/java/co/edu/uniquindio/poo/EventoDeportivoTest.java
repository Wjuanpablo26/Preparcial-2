package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.model.Atleta;
import co.edu.uniquindio.poo.model.Entrenador;
import co.edu.uniquindio.poo.model.EventoDeportivo;
import co.edu.uniquindio.poo.model.TipoEvento;

public class EventoDeportivoTest {

    private static final Logger LOG = Logger.getLogger(EventoDeportivoTest.class.getName());
    
    /*
     * Metodo para probar el metodo que obtiene la lista de los atletas que son de natacion y pertenecen a una competencia
     */
    @Test
    public void testObtenerAtletasDeNatacionCompeticion() {
        LOG.info("Test para obtener los atletas de natacion que pertenecen a una competencia");
        EventoDeportivo evento = new EventoDeportivo("Campeonato Nacional","natacion","colombia","Armenia",java.sql.Date.valueOf(LocalDate.of(2020, 2, 25)), TipoEvento.COMPETICION);
        Atleta atleta1 = new Atleta("Juan", "Pérez",  "Colombiano",new Date(), 10,"natacion");
        Atleta atleta2 = new Atleta("Ana", "Gómez", "Colombiana", new Date(), 5, "natacion");
        Entrenador entrenador = new Entrenador("Carlos", "López",  "Colombiano",new Date(), "fisico");

        evento.agregarParticipante(atleta1);
        evento.agregarParticipante(atleta2);
        evento.agregarParticipante(entrenador);

        List<Atleta> atletas = evento.obtenerAtletasNatacion();
        assertEquals(2, atletas.size());
        assertTrue(atletas.contains(atleta1));
        assertTrue(atletas.contains(atleta2));
        LOG.info("Test exitoso");
    
    }

}
