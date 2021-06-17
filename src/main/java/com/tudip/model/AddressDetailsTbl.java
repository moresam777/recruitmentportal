package com.tudip.model;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;


/**
 * The persistent class for the address_details_tbl database table.
 * 
 */
@Entity
@Table(name="address_details_tbl")
@NamedQueries({
	@NamedQuery(name="AddressDetailsTbl.findAll", query="SELECT a FROM AddressDetailsTbl a")
})
public class AddressDetailsTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="address_details_tbl_pk")
	private int addressDetailsTblPk;

	@Column(name="active_flag")
	private String activeFlag;

	@Column(name="address_type")
	private int addressType;

	private String addressline;

	@Column(name="applicant_id")
	private int applicantId;

	private String city;

	private int country;

	private int district;

	@CreationTimestamp
	@Column(name="inserted_on", updatable = false, insertable = false)
	private Timestamp insertedOn;

	private int pincode;

	private int state;

	private String street;

	private int taluka;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="applicant_id",referencedColumnName="login_details_tbl_pk", insertable = false, updatable = false)
	private LoginDetailsTbl loginDetailsTbl;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "taluka", referencedColumnName = "taluka_mst_pk", insertable = false, updatable = false)
	private TalukaMst talukaMst;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "state", referencedColumnName = "state_mst_pk", insertable = false, updatable = false)
	private StateMst stateMst;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "district", referencedColumnName = "district_mst_pk", insertable = false, updatable = false)
	private DistrictMst districtMst;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "country", referencedColumnName = "country_mst_pk", insertable = false, updatable = false)
	private CountryMst countryMst;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "address_type", referencedColumnName = "add_mst_pk", insertable = false, updatable = false)
	private AddressTypeMst addressTypeMst;
	
	public AddressDetailsTbl() {
	}

	public int getAddressDetailsTblPk() {
		return this.addressDetailsTblPk;
	}

	public void setAddressDetailsTblPk(int addressDetailsTblPk) {
		this.addressDetailsTblPk = addressDetailsTblPk;
	}

	public String getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	public int getAddressType() {
		return this.addressType;
	}

	public void setAddressType(int addressType) {
		this.addressType = addressType;
	}

	public String getAddressline() {
		return this.addressline;
	}

	public void setAddressline(String addressline) {
		this.addressline = addressline;
	}

	public int getApplicantId() {
		return this.applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getCountry() {
		return this.country;
	}

	public void setCountry(int country) {
		this.country = country;
	}

	public int getDistrict() {
		return this.district;
	}

	public void setDistrict(int district) {
		this.district = district;
	}

	public Timestamp getInsertedOn() {
		return this.insertedOn;
	}

	public void setInsertedOn(Timestamp insertedOn) {
		this.insertedOn = insertedOn;
	}

	public int getPincode() {
		return this.pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getState() {
		return this.state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getTaluka() {
		return this.taluka;
	}

	public void setTaluka(int taluka) {
		this.taluka = taluka;
	}

	public LoginDetailsTbl getLoginDetailsTbl() {
		return loginDetailsTbl;
	}

	public void setLoginDetailsTbl(LoginDetailsTbl loginDetailsTbl) {
		this.loginDetailsTbl = loginDetailsTbl;
	}

	public TalukaMst getTalukaMst() {
		return talukaMst;
	}

	public void setTalukaMst(TalukaMst talukaMst) {
		this.talukaMst = talukaMst;
	}

	public StateMst getStateMst() {
		return stateMst;
	}

	public void setStateMst(StateMst stateMst) {
		this.stateMst = stateMst;
	}

	public DistrictMst getDistrictMst() {
		return districtMst;
	}

	public void setDistrictMst(DistrictMst districtMst) {
		this.districtMst = districtMst;
	}

	public CountryMst getCountryMst() {
		return countryMst;
	}

	public void setCountryMst(CountryMst countryMst) {
		this.countryMst = countryMst;
	}

	public AddressTypeMst getAddressTypeMst() {
		return addressTypeMst;
	}

	public void setAddressTypeMst(AddressTypeMst addressTypeMst) {
		this.addressTypeMst = addressTypeMst;
	}

	
	
}