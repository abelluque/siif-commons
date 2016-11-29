package ar.gob.mpf.commons.model.base;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

/**
 * Clase utilizada como base para todos los objetos persistibles.
 * 
 * @author Abel Luque
 *
 */
@MappedSuperclass
@EntityListeners(MpfEntityListener.class)
public abstract class MpfEntity implements Serializable {

	private static final long serialVersionUID = -5842727861761279836L;

	@Id
	@GeneratedValue(generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	@Column(name = "id", nullable = false)
	@JsonIgnore
	private long id;

	@Basic
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creation_date")
	@JsonIgnore
	private Date creationDate;

	@Basic
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_update_date")
	@JsonIgnore
	private Date lastUpdate;

	@Version
	@JsonIgnore
	// @Transient
	private int version;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}
