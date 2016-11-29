package ar.gob.mpf.commons.model.entities;

import java.util.List;

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
public class Causa extends MpfEntity {


	private static final long serialVersionUID = 9210034251727835676L;

	private Long nroCausa;

	private List<Denuncia> denuncias;

	private List<Imputado> imputados;

	private List<Testigo> testigos;

	private List<Actuacion> actuaciones;

	/**
	 * 
	 */
	public Causa() {
		super();
	}

	/**
	 * 
	 * @param nroCausa
	 * @param denuncias
	 * @param imputados
	 * @param testigos
	 * @param actuaciones
	 */
	public Causa(Long nroCausa, List<Denuncia> denuncias,
			List<Imputado> imputados, List<Testigo> testigos,
			List<Actuacion> actuaciones) {
		super();
		this.nroCausa = nroCausa;
		this.denuncias = denuncias;
		this.imputados = imputados;
		this.testigos = testigos;
		this.actuaciones = actuaciones;
	}

	public Long getNroCausa() {
		return nroCausa;
	}

	public void setNroCausa(Long nroCausa) {
		this.nroCausa = nroCausa;
	}

	public List<Denuncia> getDenuncias() {
		return denuncias;
	}

	public void setDenuncias(List<Denuncia> denuncias) {
		this.denuncias = denuncias;
	}

	public List<Imputado> getImputados() {
		return imputados;
	}

	public void setImputados(List<Imputado> imputados) {
		this.imputados = imputados;
	}

	public List<Testigo> getTestigos() {
		return testigos;
	}

	public void setTestigos(List<Testigo> testigos) {
		this.testigos = testigos;
	}

	public List<Actuacion> getActuaciones() {
		return actuaciones;
	}

	public void setActuaciones(List<Actuacion> actuaciones) {
		this.actuaciones = actuaciones;
	}

}
