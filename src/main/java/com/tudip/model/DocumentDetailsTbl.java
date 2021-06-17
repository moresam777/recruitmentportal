package com.tudip.model;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;


/**
 * The persistent class for the document_details_tbl database table.
 * 
 */
@Entity
@Table(name="document_details_tbl")
@NamedQuery(name="DocumentDetailsTbl.findAll", query="SELECT d FROM DocumentDetailsTbl d")
public class DocumentDetailsTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="doc_details_tbl_pk")
	private int docDetailsTblPk;

	@Column(name="active_flag")
	private String activeFlag;

	@Column(name="applicant_id")
	private int applicantId;

	@Column(name="doc_type")
	private int docType;

	private String filename;

	private String filepath;

	@CreationTimestamp
	@Column(name="inserted_on")
	private Timestamp insertedOn;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="applicant_id",referencedColumnName="login_details_tbl_pk", insertable = false, updatable = false)
	private LoginDetailsTbl loginDetailsTbl;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="doc_type",referencedColumnName="doc_type_mst_pk", insertable = false, updatable = false)
	private DocumentTypeMst documentTypeMst;
	
	public DocumentDetailsTbl() {
	}

	public int getDocDetailsTblPk() {
		return this.docDetailsTblPk;
	}

	public void setDocDetailsTblPk(int docDetailsTblPk) {
		this.docDetailsTblPk = docDetailsTblPk;
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

	public int getDocType() {
		return this.docType;
	}

	public void setDocType(int docType) {
		this.docType = docType;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getFilepath() {
		return this.filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public Timestamp getInsertedOn() {
		return this.insertedOn;
	}

	public void setInsertedOn(Timestamp insertedOn) {
		this.insertedOn = insertedOn;
	}

	public LoginDetailsTbl getLoginDetailsTbl() {
		return loginDetailsTbl;
	}

	public void setLoginDetailsTbl(LoginDetailsTbl loginDetailsTbl) {
		this.loginDetailsTbl = loginDetailsTbl;
	}

	public DocumentTypeMst getDocumentTypeMst() {
		return documentTypeMst;
	}

	public void setDocumentTypeMst(DocumentTypeMst documentTypeMst) {
		this.documentTypeMst = documentTypeMst;
	}
	
	

}