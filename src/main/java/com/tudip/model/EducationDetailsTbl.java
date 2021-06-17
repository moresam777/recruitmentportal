package com.tudip.model;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;


/**
 * The persistent class for the education_details_tbl database table.
 * 
 */
@Entity
@Table(name="education_details_tbl")
@NamedQuery(name="EducationDetailsTbl.findAll", query="SELECT e FROM EducationDetailsTbl e")
public class EducationDetailsTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="education_details_pk")
	private int educationDetailsPk;

	@Column(name="applicant_id")
	private int applicantId;

	private int branch;

	@Column(name="education_type")
	private int educationType;

	@Column(name="end_date")
	private String endDate;

	@CreationTimestamp
	@Column(name="inserted_on", updatable = false, nullable = false)
	private Timestamp insertedOn;

	@Column(name="institute_name")
	private String instituteName;

	@Column(name="start_date")
	private String startDate;

	@UpdateTimestamp
	@Column(name="updated_on")
	private Timestamp updatedOn;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="applicant_id",referencedColumnName="login_details_tbl_pk", insertable = false, updatable = false)
	private LoginDetailsTbl loginDetailsTbl;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="branch",referencedColumnName="branch_mst_pk", insertable = false, updatable = false)
	private BranchTypeMst branchTypeMst;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="education_type",referencedColumnName="edu_type_mst_pk", insertable = false, updatable = false)
	private EducationTypeMst educationTypeMst;

	public EducationDetailsTbl() {
	}

	public int getEducationDetailsPk() {
		return this.educationDetailsPk;
	}

	public void setEducationDetailsPk(int educationDetailsPk) {
		this.educationDetailsPk = educationDetailsPk;
	}

	public int getApplicantId() {
		return this.applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public int getBranch() {
		return this.branch;
	}

	public void setBranch(int branch) {
		this.branch = branch;
	}

	public int getEducationType() {
		return this.educationType;
	}

	public void setEducationType(int educationType) {
		this.educationType = educationType;
	}

	public Timestamp getInsertedOn() {
		return this.insertedOn;
	}

	public void setInsertedOn(Timestamp insertedOn) {
		this.insertedOn = insertedOn;
	}

	public String getInstituteName() {
		return this.instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Timestamp getUpdatedOn() {
		return this.updatedOn;
	}

	public void setUpdatedOn(Timestamp updatedOn) {
		this.updatedOn = updatedOn;
	}

	public LoginDetailsTbl getLoginDetailsTbl() {
		return loginDetailsTbl;
	}

	public void setLoginDetailsTbl(LoginDetailsTbl loginDetailsTbl) {
		this.loginDetailsTbl = loginDetailsTbl;
	}

	public BranchTypeMst getBranchTypeMst() {
		return branchTypeMst;
	}

	public void setBranchTypeMst(BranchTypeMst branchTypeMst) {
		this.branchTypeMst = branchTypeMst;
	}

	public EducationTypeMst getEducationTypeMst() {
		return educationTypeMst;
	}

	public void setEducationTypeMst(EducationTypeMst educationTypeMst) {
		this.educationTypeMst = educationTypeMst;
	}

	public String getEndDate() {
		return endDate;
	}

	
}