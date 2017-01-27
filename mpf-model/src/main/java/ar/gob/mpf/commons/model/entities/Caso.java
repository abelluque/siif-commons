package ar.gob.mpf.commons.model.entities;

import java.util.Date;

import ar.gob.mpf.commons.model.base.MpfEntity;
import ar.gob.mpf.commons.model.entities.enums.EstadoCaso;

/**
 * @author Abel Luque
 */
public class Caso extends MpfEntity {

	private static final long serialVersionUID = -4409510609152387080L;
	
	private EstadoCaso estadoCaso;
	
	private EstadoProcesal estadoProcesal;
	
	private Date fechaAlta;
	
	private String categorias;
	
	private String origen;
	
	private String caratula;
	
	private String codigo;
	
	private String codigoLetra;
	
	private String codigoNumero;
	
	private String codigoAnio;
	
	private String etiquetas;
	
	private String fiscalia;
	
	private String fiscaliaCamara;
	
	private String juzgado;
	
	private String juzgadoJuicio;
	
	private String juzgadoCamara;
	
	private String ubicacion;

	
	
	
	public EstadoCaso getEstadoCaso() {
		return estadoCaso;
	}

	public void setEstadoCaso(EstadoCaso estadoCaso) {
		this.estadoCaso = estadoCaso;
	}

	public EstadoProcesal getEstadoProcesal() {
		return estadoProcesal;
	}

	public void setEstadoProcesal(EstadoProcesal estadoProcesal) {
		this.estadoProcesal = estadoProcesal;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getCategorias() {
		return categorias;
	}

	public void setCategorias(String categorias) {
		this.categorias = categorias;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getCaratula() {
		return caratula;
	}

	public void setCaratula(String caratula) {
		this.caratula = caratula;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigoLetra() {
		return codigoLetra;
	}

	public void setCodigoLetra(String codigoLetra) {
		this.codigoLetra = codigoLetra;
	}

	public String getCodigoNumero() {
		return codigoNumero;
	}

	public void setCodigoNumero(String codigoNumero) {
		this.codigoNumero = codigoNumero;
	}

	public String getCodigoAnio() {
		return codigoAnio;
	}

	public void setCodigoAnio(String codigoAnio) {
		this.codigoAnio = codigoAnio;
	}

	public String getEtiquetas() {
		return etiquetas;
	}

	public void setEtiquetas(String etiquetas) {
		this.etiquetas = etiquetas;
	}

	public String getFiscalia() {
		return fiscalia;
	}

	public void setFiscalia(String fiscalia) {
		this.fiscalia = fiscalia;
	}

	public String getFiscaliaCamara() {
		return fiscaliaCamara;
	}

	public void setFiscaliaCamara(String fiscaliaCamara) {
		this.fiscaliaCamara = fiscaliaCamara;
	}

	public String getJuzgado() {
		return juzgado;
	}

	public void setJuzgado(String juzgado) {
		this.juzgado = juzgado;
	}

	public String getJuzgadoJuicio() {
		return juzgadoJuicio;
	}

	public void setJuzgadoJuicio(String juzgadoJuicio) {
		this.juzgadoJuicio = juzgadoJuicio;
	}

	public String getJuzgadoCamara() {
		return juzgadoCamara;
	}

	public void setJuzgadoCamara(String juzgadoCamara) {
		this.juzgadoCamara = juzgadoCamara;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
}
