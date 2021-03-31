package co.proyectoGrado.proyectoGrado.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table( name = "CURSOS")
@NoArgsConstructor
public class CursoEntitiy {

    @Id
    @Column(name = "idCursos")
    private int idCursos;
    @Column(name = "grado")
    private String grado;
    @Column(name = "nombre")
    private String nombre;
}
