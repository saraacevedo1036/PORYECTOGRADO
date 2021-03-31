package co.proyectoGrado.proyectoGrado.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table( name = "CURSO_CONTENIDO")
@NoArgsConstructor
public class CursoContenidoEntity {

    @Id
    @Column(name = "idCurso_contenido")
    private int idCursoContenido;
    @Column(name = "idCategoria_contenido")
    private int idCategoriaContenido;
    @Column(name = "cursos_idCusrsos")
    private int cursosIdCursos;
    @Column(name = "comentario")
    private String comentario;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "imagen")
    private String imagen;
    @Column(name = "video")
    private String video;

}
