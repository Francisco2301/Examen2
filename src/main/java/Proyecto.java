import java.util.*;

import javax.persistence.*;

@Entity
public class Proyecto {
    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO) 
    private Long id;

    private String nombre;
    private String descripcion;
    private Date fechaInicio;
    private Date fechaFin;

    @OneToMany(mappedBy="proyecto") 
    private List<Tarea> tareas;

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    // Getters y setters
}
