package com.tudip.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the applicant_requisition_details_tbl database table.
 * 
 */
@Entity
@Table(name="applicant_requisition_details_tbl")
@NamedQueries({
	@NamedQuery(name="ApplicantRequisitionDetailsTbl.findAllAppliedPosition", query="SELECT a FROM ApplicantRequisitionDetailsTbl a"),
	@NamedQuery(name="ApplicantRequisitionDetailsTbl.findCurrentActivePositionDetailsOfCandidate", query="SELECT a FROM ApplicantRequisitionDetailsTbl a "
			+ " WHERE a.activeFlag='Y' AND a.applicantId=?1")
})
public class ApplicantRequisitionDetailsTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="app_req_details_pk", unique=true, nullable=false)
	private int appReqDetailsPk;

	@Column(name="active_flag", length=1)
	private String activeFlag;

	@Column(name="applicant_id")
	private int applicantId;

	@Column(length=500)
	private String comment;

	private int position;

	private int status;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="applicant_id",referencedColumnName="login_details_tbl_pk", insertable = false, updatable = false)
	private LoginDetailsTbl loginDetailsTbl;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="position",referencedColumnName="position_mst_pk", insertable = false, updatable = false)
	private PositionMst positionMst;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="status",referencedColumnName="status_mst_pk", insertable = false, updatable = false)
	private StatusMst statusMst;

	public ApplicantRequisitionDetailsTbl() {
	}

	public int getAppReqDetailsPk() {
		return this.appReqDetailsPk;
	}

	public void setAppReqDetailsPk(int appReqDetailsPk) {
		this.appReqDetailsPk = appReqDetailsPk;
	}

	public String getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	public int getApplicantId() {
		return this.applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getPosition() {
		return this.position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public LoginDetailsTbl getLoginDetailsTbl() {
		return loginDetailsTbl;
	}

	public void setLoginDetailsTbl(LoginDetailsTbl loginDetailsTbl) {
		this.loginDetailsTbl = loginDetailsTbl;
	}

	public PositionMst getPositionMst() {
		return positionMst;
	}

	public void setPositionMst(PositionMst positionMst) {
		this.positionMst = positionMst;
	}

	public StatusMst getStatusMst() {
		return statusMst;
	}

	public void setStatusMst(StatusMst statusMst) {
		this.statusMst = statusMst;
	}

	
}