package ar.gob.mpf.commons.model.entities;

import ar.gob.mpf.commons.model.base.MpfEntity;
import ar.gob.mpf.commons.model.entities.enums.EstadoHecho;

/**
 * @author Abel Luque
 */
public class Hecho extends MpfEntity {

	private static final long serialVersionUID = 1259171567370160030L;
	
	private EstadoHecho estadoHecho;
	
	private String Categoria;
	
	private String descripcion;
	
	private String resenia;
	
	private String flagrancia;
	
	private String tiempoDeterminacion;
	
	private String tiempoInicio;
	
	private String tiempoFin;
	
	//TODO ver si es necesario crear una entidad Lugar?
	private String lugarDeterminacion;
	
	private String lugarExactitud;
	
	private String lugarUbicacion;
	
	private String lugarTipo;
	
	

	public EstadoHecho getEstadoHecho() {
		return estadoHecho;
	}

	public void setEstadoHecho(EstadoHecho estadoHecho) {
		this.estadoHecho = estadoHecho;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getResenia() {
		return resenia;
	}

	public void setResenia(String resenia) {
		this.resenia = resenia;
	}

	public String getFlagrancia() {
		return flagrancia;
	}

	public void setFlagrancia(String flagrancia) {
		this.flagrancia = flagrancia;
	}

	public String getTiempoDeterminacion() {
		return tiempoDeterminacion;
	}

	public void setTiempoDeterminacion(String tiempoDeterminacion) {
		this.tiempoDeterminacion = tiempoDeterminacion;
	}

	public String getTiempoInicio() {
		return tiempoInicio;
	}

	public void setTiempoInicio(String tiempoInicio) {
		this.tiempoInicio = tiempoInicio;
	}

	public String getTiempoFin() {
		return tiempoFin;
	}

	public void setTiempoFin(String tiempoFin) {
		this.tiempoFin = tiempoFin;
	}

	public String getLugarDeterminacion() {
		return lugarDeterminacion;
	}

	public void setLugarDeterminacion(String lugarDeterminacion) {
		this.lugarDeterminacion = lugarDeterminacion;
	}

	public String getLugarExactitud() {
		return lugarExactitud;
	}

	public void setLugarExactitud(String lugarExactitud) {
		this.lugarExactitud = lugarExactitud;
	}

	public String getLugarUbicacion() {
		return lugarUbicacion;
	}

	public void setLugarUbicacion(String lugarUbicacion) {
		this.lugarUbicacion = lugarUbicacion;
	}

	public String getLugarTipo() {
		return lugarTipo;
	}

	public void setLugarTipo(String lugarTipo) {
		this.lugarTipo = lugarTipo;
	}
	
}
