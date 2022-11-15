package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Alumnos {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "id_alumno")
	private int idAlumno;
	@Basic
	@Column(name = "nombre")
	private String nombre;
	@Basic
	@Column(name = "apellido")
	private String apellido;
	@Basic
	@Column(name = "email")
	private String email;
	@Basic
	@Column(name = "contrasena")
	private String contrasena;
	@Basic
	@Column(name = "dni")
	private String dni;

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Alumnos alumnos = (Alumnos) o;
		return idAlumno == alumnos.idAlumno && Objects.equals(nombre, alumnos.nombre) && Objects.equals(apellido, alumnos.apellido) && Objects.equals(email, alumnos.email) && Objects.equals(contrasena, alumnos.contrasena) && Objects.equals(dni, alumnos.dni);
	}

	@Override
	public int hashCode() {
		return Objects.hash(idAlumno, nombre, apellido, email, contrasena, dni);
	}
}
