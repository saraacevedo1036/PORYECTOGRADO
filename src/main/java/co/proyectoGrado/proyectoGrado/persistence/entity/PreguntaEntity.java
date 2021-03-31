package co.proyectoGrado.proyectoGrado.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table( name = "PREGUNTAS")
@NoArgsConstructor
public class PreguntaEntity {

    @Id
    @Column(name = "idPreguntas")
    private int idPregunta;
    @Column(name = "texto")
    private String texto;
    @Column(name = "imagen")
    private int imagen;
    @Column(name = "respuesta")
    private String respuesta;
    @Column(name = "opcion1")
    private String opcion1;
    @Column(name = "opcion2")
    private String opcion2;
    @Column(name = "opcion3")
    private String opcion3;
    @Column(name = "opcion4")
    private String opcion4;
    @Column(name = "estado")
    private boolean estado;


}
