package entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "profesor", schema = "extraschool", catalog = "")
public class MyProfesorEntity {
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
	private Collection<MyChatEntity> chatsByIdProfesor;
	@OneToMany(mappedBy = "profesorByIdProfesor")
	private Collection<MyMateriasEntity> materiasByIdProfesor;
	@ManyToOne
	@JoinColumn(name = "id_alumno", referencedColumnName = "id_alumno")
	private MyAlumnosEntity alumnosByIdAlumno;

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
		MyProfesorEntity that = (MyProfesorEntity) o;
		return idProfesor == that.idProfesor && Objects.equals(nombre, that.nombre) && Objects.equals(apellido, that.apellido) && Objects.equals(email, that.email) && Objects.equals(contrasena, that.contrasena) && Objects.equals(dni, that.dni) && Objects.equals(idAlumno, that.idAlumno);
	}

	@Override
	public int hashCode() {
		return Objects.hash(idProfesor, nombre, apellido, email, contrasena, dni, idAlumno);
	}

	public Collection<MyChatEntity> getChatsByIdProfesor() {
		return chatsByIdProfesor;
	}

	public void setChatsByIdProfesor(Collection<MyChatEntity> chatsByIdProfesor) {
		this.chatsByIdProfesor = chatsByIdProfesor;
	}

	public Collection<MyMateriasEntity> getMateriasByIdProfesor() {
		return materiasByIdProfesor;
	}

	public void setMateriasByIdProfesor(Collection<MyMateriasEntity> materiasByIdProfesor) {
		this.materiasByIdProfesor = materiasByIdProfesor;
	}

	public MyAlumnosEntity getAlumnosByIdAlumno() {
		return alumnosByIdAlumno;
	}

	public void setAlumnosByIdAlumno(MyAlumnosEntity alumnosByIdAlumno) {
		this.alumnosByIdAlumno = alumnosByIdAlumno;
	}
}
