package com.tudip.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the gender_mst database table.
 * 
 */
@Entity
@Table(name="gender_mst")
@NamedQuery(name="GenderMst.findAll", query="SELECT g FROM GenderMst g")
public class GenderMst implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="gender_mst_pk")
	private int genderMstPk;

	private String gender;

	public GenderMst() {
	}

	public int getGenderMstPk() {
		return this.genderMstPk;
	}

	public void setGenderMstPk(int genderMstPk) {
		this.genderMstPk = genderMstPk;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}