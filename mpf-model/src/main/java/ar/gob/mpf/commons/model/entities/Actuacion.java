package ar.gob.mpf.commons.model.entities;

import javax.persistence.Entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import ar.gob.mpf.commons.model.base.MpfEntity;
import ar.gob.mpf.commons.model.entities.enums.EstadoActuacion;

/**
 * 
 * @author Abel Luque
 *
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Actuacion extends MpfEntity {

	private static final long serialVersionUID = -5571608695069866965L;

	private TipoActuacion tipoActuacion;

	private EstadoActuacion estado;

	private String TextoActuacion;

	private Documento documento;

	private EstadoProcesal estadoProcesal;

	public Actuacion() {
		super();
	}

	public TipoActuacion getTipoActuacion() {
		return tipoActuacion;
	}

	public void setTipoActuacion(TipoActuacion tipoActuacion) {
		this.tipoActuacion = tipoActuacion;
	}

	public EstadoActuacion getEstado() {
		return estado;
	}

	public void setEstado(EstadoActuacion estado) {
		this.estado = estado;
	}

	public String getTextoActuacion() {
		return TextoActuacion;
	}

	public void setTextoActuacion(String textoActuacion) {
		TextoActuacion = textoActuacion;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public EstadoProcesal getEstadoProcesal() {
		return estadoProcesal;
	}

	public void setEstadoProcesal(EstadoProcesal estadoProcesal) {
		this.estadoProcesal = estadoProcesal;
	}

}
