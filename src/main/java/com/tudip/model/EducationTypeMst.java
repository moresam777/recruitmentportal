package com.tudip.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the education_type_mst database table.
 * 
 */
@Entity
@Table(name="education_type_mst")
@NamedQuery(name="EducationTypeMst.findAll", query="SELECT e FROM EducationTypeMst e")
public class EducationTypeMst implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="edu_type_mst_pk")
	private int eduTypeMstPk;

	@Column(name="education_type")
	private String educationType;

	public EducationTypeMst() {
	}

	public int getEduTypeMstPk() {
		return this.eduTypeMstPk;
	}

	public void setEduTypeMstPk(int eduTypeMstPk) {
		this.eduTypeMstPk = eduTypeMstPk;
	}

	public String getEducationType() {
		return this.educationType;
	}

	public void setEducationType(String educationType) {
		this.educationType = educationType;
	}

}