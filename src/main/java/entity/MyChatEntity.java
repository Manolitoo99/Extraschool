package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "chat", schema = "extraschool", catalog = "")
public class MyChatEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "id_chat")
	private int idChat;
	@Basic
	@Column(name = "message")
	private String message;
	@Basic
	@Column(name = "id_alumno")
	private Integer idAlumno;
	@Basic
	@Column(name = "id_profesor")
	private Integer idProfesor;
	@ManyToOne
	@JoinColumn(name = "id_alumno", referencedColumnName = "id_alumno")
	private MyAlumnosEntity alumnosByIdAlumno;

	public int getIdChat() {
		return idChat;
	}

	public void setIdChat(int idChat) {
		this.idChat = idChat;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(Integer idAlumno) {
		this.idAlumno = idAlumno;
	}

	public Integer getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(Integer idProfesor) {
		this.idProfesor = idProfesor;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		MyChatEntity that = (MyChatEntity) o;
		return idChat == that.idChat && Objects.equals(message, that.message) && Objects.equals(idAlumno, that.idAlumno) && Objects.equals(idProfesor, that.idProfesor);
	}

	@Override
	public int hashCode() {
		return Objects.hash(idChat, message, idAlumno, idProfesor);
	}

	public MyAlumnosEntity getAlumnosByIdAlumno() {
		return alumnosByIdAlumno;
	}

	public void setAlumnosByIdAlumno(MyAlumnosEntity alumnosByIdAlumno) {
		this.alumnosByIdAlumno = alumnosByIdAlumno;
	}
}
