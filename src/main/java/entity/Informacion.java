package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Informacion {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "id_informacion")
	private int idInformacion;
	@Basic
	@Column(name = "clave_texto")
	private String claveTexto;
	@Basic
	@Column(name = "texto")
	private String texto;

	public int getIdInformacion() {
		return idInformacion;
	}

	public void setIdInformacion(int idInformacion) {
		this.idInformacion = idInformacion;
	}

	public String getClaveTexto() {
		return claveTexto;
	}

	public void setClaveTexto(String claveTexto) {
		this.claveTexto = claveTexto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Informacion that = (Informacion) o;
		return idInformacion == that.idInformacion && Objects.equals(claveTexto, that.claveTexto) && Objects.equals(texto, that.texto);
	}

	@Override
	public int hashCode() {
		return Objects.hash(idInformacion, claveTexto, texto);
	}
}
