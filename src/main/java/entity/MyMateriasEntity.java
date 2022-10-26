package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "materias", schema = "extraschool", catalog = "")
public class MyMateriasEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "id_materia")
	private int idMateria;
	@Basic
	@Column(name = "nombre")
	private String nombre;
	@Basic
	@Column(name = "id_profesor")
	private Integer idProfesor;

	public int getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		MyMateriasEntity that = (MyMateriasEntity) o;
		return idMateria == that.idMateria && Objects.equals(nombre, that.nombre) && Objects.equals(idProfesor, that.idProfesor);
	}

	@Override
	public int hashCode() {
		return Objects.hash(idMateria, nombre, idProfesor);
	}
}
