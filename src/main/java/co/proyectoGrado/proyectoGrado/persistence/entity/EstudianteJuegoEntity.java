package co.proyectoGrado.proyectoGrado.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table( name = "ESTUDIANTE_JUEGO")
@NoArgsConstructor
public class EstudianteJuegoEntity {

    @Id
    @Column(name = "idEstudiantes_juego")
    private int idEstudianteJuego;
    @Column(name = "calificacion")
    private double calificacion;
    @Column(name = "idReto")
    private int idReto;
    @Column(name = "idEstudiantes")
    private int idEstudiantes;
}
