package ar.gob.mpf.commons.model.entities;

import javax.persistence.Entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import ar.gob.mpf.commons.model.base.MpfEntity;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Testigo extends MpfEntity {

	private static final long serialVersionUID = -2004911014685508431L;

	private String nombreTestigo;

	public Testigo() {
		super();
	}

	public Testigo(String nombreTestigo) {
		super();
		this.nombreTestigo = nombreTestigo;
	}

	public String getNombreTestigo() {
		return nombreTestigo;
	}

	public void setNombreTestigo(String nombreTestigo) {
		this.nombreTestigo = nombreTestigo;
	}

	@Override
	public String toString() {
		return nombreTestigo;
	}

}
