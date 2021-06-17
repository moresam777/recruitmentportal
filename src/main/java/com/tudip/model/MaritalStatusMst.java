package com.tudip.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the marital_status_mst database table.
 * 
 */
@Entity
@Table(name="marital_status_mst")
@NamedQuery(name="MaritalStatusMst.findAll", query="SELECT m FROM MaritalStatusMst m")
public class MaritalStatusMst implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="marital_status_mst_pk")
	private int maritalStatusMstPk;

	@Column(name="marital_status")
	private String maritalStatus;

	public MaritalStatusMst() {
	}

	public int getMaritalStatusMstPk() {
		return this.maritalStatusMstPk;
	}

	public void setMaritalStatusMstPk(int maritalStatusMstPk) {
		this.maritalStatusMstPk = maritalStatusMstPk;
	}

	public String getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

}