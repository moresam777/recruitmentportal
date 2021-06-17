package com.tudip.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the status_mst database table.
 * 
 */
@Entity
@Table(name="status_mst")
@NamedQuery(name="StatusMst.findAll", query="SELECT s FROM StatusMst s")
public class StatusMst implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="status_mst_pk", unique=true, nullable=false)
	private int statusMstPk;

	@Column(length=30)
	private String status;

	public StatusMst() {
	}

	public int getStatusMstPk() {
		return this.statusMstPk;
	}

	public void setStatusMstPk(int statusMstPk) {
		this.statusMstPk = statusMstPk;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}