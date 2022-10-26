package Entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Chat {
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
	private Alumnos alumnosByIdAlumno;

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
		Chat chat = (Chat) o;
		return idChat == chat.idChat && Objects.equals(message, chat.message) && Objects.equals(idAlumno, chat.idAlumno) && Objects.equals(idProfesor, chat.idProfesor);
	}

	@Override
	public int hashCode() {
		return Objects.hash(idChat, message, idAlumno, idProfesor);
	}

	public Alumnos getAlumnosByIdAlumno() {
		return alumnosByIdAlumno;
	}

	public void setAlumnosByIdAlumno(Alumnos alumnosByIdAlumno) {
		this.alumnosByIdAlumno = alumnosByIdAlumno;
	}
}
