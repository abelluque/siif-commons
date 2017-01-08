package ar.gob.mpf.commons.model.entities;

import ar.gob.mpf.commons.model.base.MpfEntity;
import ar.gob.mpf.commons.model.entities.enums.EstadoTipoActuacion;

public class TipoActuacion extends MpfEntity{

	private static final long serialVersionUID = 1183520673220750863L;
	
	private EstadoProcesal estadoProcesal;
	
	private String descripcion;

	private String observacio;
	
	private EstadoTipoActuacion estadoTipoActuacion;

	public EstadoProcesal getEstadoProcesal() {
		return estadoProcesal;
	}

	public void setEstadoProcesal(EstadoProcesal estadoProcesal) {
		this.estadoProcesal = estadoProcesal;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getObservacio() {
		return observacio;
	}

	public void setObservacio(String observacio) {
		this.observacio = observacio;
	}

	public EstadoTipoActuacion getEstadoTipoActuacion() {
		return estadoTipoActuacion;
	}

	public void setEstadoTipoActuacion(EstadoTipoActuacion estadoTipoActuacion) {
		this.estadoTipoActuacion = estadoTipoActuacion;
	}
	
	
	
}
