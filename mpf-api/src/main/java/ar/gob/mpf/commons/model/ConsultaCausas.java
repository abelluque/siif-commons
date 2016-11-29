package ar.gob.mpf.commons.model;

import java.io.Serializable;

/**
 * 
 * @author Abel Luque
 *
 */
public class ConsultaCausas implements Serializable {

	private static final long serialVersionUID = 4169760298690490123L;

	private String nroCausa;
	private String IdOperador;
	
	
	

	public ConsultaCausas(String nroCausa, String idOperador) {
		super();
	}

	public String getNroCausa() {
		return nroCausa;
	}

	public void setNroCausa(String nroCausa) {
		this.nroCausa = nroCausa;
	}

	public String getIdOperador() {
		return IdOperador;
	}

	public void setIdOperador(String idOperador) {
		IdOperador = idOperador;
	}

}
