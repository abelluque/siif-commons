package ar.gob.mpf.commons.model.entities;

import javax.persistence.Entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import ar.gob.mpf.commons.model.base.MpfEntity;

/**
 * 
 * @author Abel Luque
 *
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Imputado extends MpfEntity {

	private static final long serialVersionUID = 5406744157367106574L;

	private String nombreImputado;

	public Imputado() {
		super();
	}

	public Imputado(String nombreImputado) {
		super();
		this.nombreImputado = nombreImputado;
	}

	public String getNombreImputado() {
		return nombreImputado;
	}

	public void setNombreImputado(String nombreImputado) {
		this.nombreImputado = nombreImputado;
	}

	@Override
	public String toString() {
		return nombreImputado;
	}

}
