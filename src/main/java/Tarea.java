import java.util.*;

import javax.persistence.*;

@Entity
public class Tarea {
    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO) 
    private Long id;

    private String nombre;
    private String descripcion;
    private String estado;
    private Date fechaLimite;

    @ManyToOne 
    @JoinColumn(name="proyecto_id")
    private Proyecto proyecto;

    @ManyToOne 
    @JoinColumn(name="empleado_id")
    private Empleado empleado;

    @OneToMany(mappedBy="tarea")
    private List avances;

    // Getters y setters
}
