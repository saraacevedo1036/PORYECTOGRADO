package co.proyectoGrado.proyectoGrado.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table( name = "CURSOS_ESTUDIANTES")
@NoArgsConstructor
public class CursosEstudiantesEntity {
    @Id
    @Column(name = "idcurso_estudiantes")
    private int idcursoestudiantes;
    @Column(name="idEstudiantes")
    private int idEstudiantes;
    @Column(name="idCursos")
    private int idCursos;

}
