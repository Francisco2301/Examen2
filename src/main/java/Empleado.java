import java.util.*;

import javax.persistence.*;

import antlr.collections.List;

@Entity
public class Empleado {
    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO) 
    private Long id;

    private String nombres;
    private String apellidos;
    private Date fechaIngreso;
    private String cargo;
    private String email;

    @OneToMany(mappedBy="empleado") 
    private List tareas;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

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

    // Getters y setters
}
