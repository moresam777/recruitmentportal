package com.tudip.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


/**
 * The persistent class for the login_details_tbl database table.
 * 
 */
@Entity
@Table(name="login_details_tbl")
@NamedQueries({
	@NamedQuery(name="LoginDetailsTbl.findAll", query="SELECT l FROM LoginDetailsTbl l"),
})
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="applicantId", scope = AddressDetailsTbl.class)
public class LoginDetailsTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="login_details_tbl_pk", unique=true, nullable=false)
	private int loginDetailsTblPk;

	@Column(name="active_flag", length=1)
	private String activeFlag;

	@Column(name="birth_date")
	private String birthDate;

	@Column(name="email_id", nullable=false, length=150)
	private String emailId;

	@Column(name="first_name", length=25)
	private String firstName;

	private int gender;

	@CreationTimestamp
	@Column(name="insert_date", updatable = false, nullable = false)
	private Timestamp insertDate;

	@Column(name="last_name", length=25)
	private String lastName;

	@Column(name="marital_status")
	private int maritalStatus;

	@Column(length=10)
	private String mobile;

	@Column(length=500)
	private String password;

	private int title;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="title",referencedColumnName="title_mst_pk", insertable = false, updatable = false)
	private TitleMst titleMst;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "marital_status", referencedColumnName = "marital_status_mst_pk",insertable = false,updatable = false)
	private MaritalStatusMst maritalStatusMst;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "gender", referencedColumnName = "gender_mst_pk", insertable = false, updatable = false)
	private GenderMst genderMst;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "applicant_id", referencedColumnName = "login_details_tbl_pk", insertable = false, updatable = false)
	@JsonManagedReference
	private List<AddressDetailsTbl> addressDetailsTbl;
	
	public LoginDetailsTbl() {
	}

	public int getLoginDetailsTblPk() {
		return this.loginDetailsTblPk;
	}

	public void setLoginDetailsTblPk(int loginDetailsTblPk) {
		this.loginDetailsTblPk = loginDetailsTblPk;
	}

	public String getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getGender() {
		return this.gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public Timestamp getInsertDate() {
		return this.insertDate;
	}

	public void setInsertDate(Timestamp insertDate) {
		this.insertDate = insertDate;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setMaritalStatus(int maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getTitle() {
		return this.title;
	}

	public void setTitle(int title) {
		this.title = title;
	}

	public TitleMst getTitleMst() {
		return titleMst;
	}

	public void setTitleMst(TitleMst titleMst) {
		this.titleMst = titleMst;
	}

	public MaritalStatusMst getMaritalStatusMst() {
		return maritalStatusMst;
	}

	public void setMaritalStatusMst(MaritalStatusMst maritalStatusMst) {
		this.maritalStatusMst = maritalStatusMst;
	}

	public GenderMst getGenderMst() {
		return genderMst;
	}

	public void setGenderMst(GenderMst genderMst) {
		this.genderMst = genderMst;
	}

	public List<AddressDetailsTbl> getAddressDetailsTbl() {
		return addressDetailsTbl;
	}

	public void setAddressDetailsTbl(List<AddressDetailsTbl> addressDetailsTbl) {
		this.addressDetailsTbl = addressDetailsTbl;
	}
	
	

}