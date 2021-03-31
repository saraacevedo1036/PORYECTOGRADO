package co.proyectoGrado.proyectoGrado.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table( name = "JUEGO_PREGUNTAS")
@NoArgsConstructor
public class JuegoPreguntasEntity {

    @Id
    @Column(name="idJuego_preguntas")
    private int idJuegoPreguntas;
    @Column(name="idPreguntas")
    private int idPreguntas;
    @Column(name="idReto")
    private int idReto;

}
