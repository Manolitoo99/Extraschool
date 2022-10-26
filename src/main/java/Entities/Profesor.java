package Entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Profesor {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "id_profesor")
	private int idProfesor;
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
	@Basic
	@Column(name = "id_alumno")
	private Integer idAlumno;
	@OneToMany(mappedBy = "profesorByIdProfesor")
	private Collection<Chat> chatsByIdProfesor;
	@OneToMany(mappedBy = "profesorByIdProfesor")
	private Collection<Materias> materiasByIdProfesor;
	@ManyToOne
	@JoinColumn(name = "id_alumno", referencedColumnName = "id_alumno")
	private Alumnos alumnosByIdAlumno;

	public int getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(int idProfesor) {
		this.idProfesor = idProfesor;
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

	public Integer getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(Integer idAlumno) {
		this.idAlumno = idAlumno;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Profesor profesor = (Profesor) o;
		return idProfesor == profesor.idProfesor && Objects.equals(nombre, profesor.nombre) && Objects.equals(apellido, profesor.apellido) && Objects.equals(email, profesor.email) && Objects.equals(contrasena, profesor.contrasena) && Objects.equals(dni, profesor.dni) && Objects.equals(idAlumno, profesor.idAlumno);
	}

	@Override
	public int hashCode() {
		return Objects.hash(idProfesor, nombre, apellido, email, contrasena, dni, idAlumno);
	}

	public Collection<Chat> getChatsByIdProfesor() {
		return chatsByIdProfesor;
	}

	public void setChatsByIdProfesor(Collection<Chat> chatsByIdProfesor) {
		this.chatsByIdProfesor = chatsByIdProfesor;
	}

	public Collection<Materias> getMateriasByIdProfesor() {
		return materiasByIdProfesor;
	}

	public void setMateriasByIdProfesor(Collection<Materias> materiasByIdProfesor) {
		this.materiasByIdProfesor = materiasByIdProfesor;
	}

	public Alumnos getAlumnosByIdAlumno() {
		return alumnosByIdAlumno;
	}

	public void setAlumnosByIdAlumno(Alumnos alumnosByIdAlumno) {
		this.alumnosByIdAlumno = alumnosByIdAlumno;
	}
}
