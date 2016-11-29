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
public class Actuacion extends MpfEntity {

	private static final long serialVersionUID = 628131420494768878L;

	private String tipoActuacion;

	public Actuacion() {
		super();
	}

	public Actuacion(String tipoActuacion) {
		super();
		this.tipoActuacion = tipoActuacion;
	}

	public String getTipoActuacion() {
		return tipoActuacion;
	}

	public void setTipoActuacion(String tipoActuacion) {
		this.tipoActuacion = tipoActuacion;
	}

	@Override
	public String toString() {
		return tipoActuacion;
	}

}
