package com.tudip.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;


/**
 * The persistent class for the skills_details_tbl database table.
 * 
 */
@Entity
@Table(name="skills_details_tbl")
@NamedQuery(name="SkillsDetailsTbl.findAll", query="SELECT s FROM SkillsDetailsTbl s")
public class SkillsDetailsTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="skills_details_pk")
	private int skillsDetailsPk;

	@CreationTimestamp
	@Column(name="inserted_on", updatable = false, nullable = false)
	private Timestamp insertedOn;

	@Column(name="skills_type")
	private int skillsType;
	
	@Column(name = "applicant_id")
	private int applicantId;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="skills_type",referencedColumnName="skill_mst_pk", insertable = false, updatable = false)
	private SkillMst skillMst;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="applicant_id",referencedColumnName="login_details_tbl_pk", insertable = false, updatable = false)
	private LoginDetailsTbl loginDetailsTbl;
	
	public SkillsDetailsTbl() {
	}

	public int getSkillsDetailsPk() {
		return this.skillsDetailsPk;
	}

	public void setSkillsDetailsPk(int skillsDetailsPk) {
		this.skillsDetailsPk = skillsDetailsPk;
	}

	public Timestamp getInsertedOn() {
		return this.insertedOn;
	}

	public void setInsertedOn(Timestamp insertedOn) {
		this.insertedOn = insertedOn;
	}

	public int getSkillsType() {
		return this.skillsType;
	}

	public void setSkillsType(int skillsType) {
		this.skillsType = skillsType;
	}

	public int getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public SkillMst getSkillMst() {
		return skillMst;
	}

	public void setSkillMst(SkillMst skillMst) {
		this.skillMst = skillMst;
	}

	public LoginDetailsTbl getLoginDetailsTbl() {
		return loginDetailsTbl;
	}

	public void setLoginDetailsTbl(LoginDetailsTbl loginDetailsTbl) {
		this.loginDetailsTbl = loginDetailsTbl;
	}
	
	

}