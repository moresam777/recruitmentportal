/**
 * 
 */
package com.tudip.dto;

/**
 * @author Samadhan.Mo
 *
 */
public class AddressDetailsDTO {

	private int addressDetailsTblPk;
	private String activeFlag;
	private int addressType;
	private String addressline;
	private int applicantId;
	private String city;
	private int country;
	private int district;
	private int pincode;
	private int state;
	private String street;
	private int taluka;
	
	public int getAddressDetailsTblPk() {
		return addressDetailsTblPk;
	}
	public void setAddressDetailsTblPk(int addressDetailsTblPk) {
		this.addressDetailsTblPk = addressDetailsTblPk;
	}
	public String getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}
	public int getAddressType() {
		return addressType;
	}
	public void setAddressType(int addressType) {
		this.addressType = addressType;
	}
	public String getAddressline() {
		return addressline;
	}
	public void setAddressline(String addressline) {
		this.addressline = addressline;
	}
	public int getApplicantId() {
		return applicantId;
	}
	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getCountry() {
		return country;
	}
	public void setCountry(int country) {
		this.country = country;
	}
	public int getDistrict() {
		return district;
	}
	public void setDistrict(int district) {
		this.district = district;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getTaluka() {
		return taluka;
	}
	public void setTaluka(int taluka) {
		this.taluka = taluka;
	}
	
	
}
