package co.proyectoGrado.proyectoGrado.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table( name = "ESTUDIANTES")
@NoArgsConstructor
public class EstudianteEntity {

    @Id
    @Column(name = "idEstudiantes")
    private int idEstudiantes;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "identificacion")
    private int identificacion;
    @Column(name = "correo")
    private String correo;
    @Column(name = "contraseña")
    private String contraseña;
    @Column(name = "estado")
    private boolean estado;

}
