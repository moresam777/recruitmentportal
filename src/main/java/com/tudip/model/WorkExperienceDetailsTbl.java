package com.tudip.model;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the work_experience_details_tbl database table.
 * 
 */
@Entity
@Table(name="work_experience_details_tbl")
@NamedQuery(name="WorkExperienceDetailsTbl.findAll", query="SELECT w FROM WorkExperienceDetailsTbl w")
public class WorkExperienceDetailsTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="work_exp_tbl_pk")
	private int workExpTblPk;

	@Column(name="applicant_id")
	private int applicantId;

	@Column(name="current_ctc")
	private BigDecimal currentCtc;

	@Column(name="employer_name")
	private String employerName;

	@Column(name="expected_ctc")
	private BigDecimal expectedCtc;

	@CreationTimestamp
	@Column(name="inserted_on", updatable = false, nullable = false)
	private Timestamp insertedOn;

	@Column(name="year_of_experience")
	private double yearOfExperience;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="applicant_id",referencedColumnName="login_details_tbl_pk", insertable = false, updatable = false)
	private LoginDetailsTbl loginDetailsTbl;

	public WorkExperienceDetailsTbl() {
	}

	public int getWorkExpTblPk() {
		return this.workExpTblPk;
	}

	public void setWorkExpTblPk(int workExpTblPk) {
		this.workExpTblPk = workExpTblPk;
	}

	public int getApplicantId() {
		return this.applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public BigDecimal getCurrentCtc() {
		return this.currentCtc;
	}

	public void setCurrentCtc(BigDecimal currentCtc) {
		this.currentCtc = currentCtc;
	}

	public String getEmployerName() {
		return this.employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public BigDecimal getExpectedCtc() {
		return this.expectedCtc;
	}

	public void setExpectedCtc(BigDecimal expectedCtc) {
		this.expectedCtc = expectedCtc;
	}

	public Timestamp getInsertedOn() {
		return this.insertedOn;
	}

	public void setInsertedOn(Timestamp insertedOn) {
		this.insertedOn = insertedOn;
	}

	public double getYearOfExperience() {
		return this.yearOfExperience;
	}

	public void setYearOfExperience(double yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

}