import java.util.*;

import javax.persistence.*;

import lombok.*;

@Entity @Setter @Getter
public class Avance {
    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO) 
    private Long id;

    private String nombres;
    private String apellidos;
    private Date fechaIngreso;
    private String cargo;
    private String email;

    @OneToMany(mappedBy="empleado") 
    private List<Tarea> tareas;

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

    // Getters y setters
}
