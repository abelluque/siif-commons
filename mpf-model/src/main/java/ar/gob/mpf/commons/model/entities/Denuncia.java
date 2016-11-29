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
public class Denuncia extends MpfEntity {

	private static final long serialVersionUID = 967207153016939983L;

	private String delito;

	private String descripcion;

	public Denuncia() {
		super();
	}

	public Denuncia(String delito, String descripcion) {
		super();
		this.delito = delito;
		this.descripcion = descripcion;
	}

	public String getDelito() {
		return delito;
	}

	public void setDelito(String delito) {
		this.delito = delito;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return delito;
	}

}
