package ar.gob.mpf.commons.model.base;

import java.util.Date;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

/**
 *  Listener para agregar timestamps previo a la persistencia de los MpfEntity
 *  
 * @author Abel Luque
 *
 */
public class MpfEntityListener {
	
	/**
	 * Cambia automáticamente la fecha de creación y update de la entidad que
	 * está a punto de ser persistida
	 */
	@PrePersist
	public void setAuditDates(MpfEntity entity) {
		entity.setCreationDate(new Date());
		entity.setLastUpdate(new Date());
	}

	/**
	 * Cambia automáticamente la fecha de update de la entidad que está a punto
	 * de ser actualizada
	 */
	@PreUpdate
	public void updateAuditDates(MpfEntity entity) {
		entity.setLastUpdate(new Date());
	}

}
