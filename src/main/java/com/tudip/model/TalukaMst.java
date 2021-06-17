package com.tudip.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the taluka_mst database table.
 * 
 */
@Entity
@Table(name="taluka_mst")
@NamedQuery(name="TalukaMst.findAll", query="SELECT t FROM TalukaMst t")
public class TalukaMst implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="taluka_mst_pk")
	private int talukaMstPk;

	private String taluka;

	public TalukaMst() {
	}

	public int getTalukaMstPk() {
		return this.talukaMstPk;
	}

	public void setTalukaMstPk(int talukaMstPk) {
		this.talukaMstPk = talukaMstPk;
	}

	public String getTaluka() {
		return this.taluka;
	}

	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}

}