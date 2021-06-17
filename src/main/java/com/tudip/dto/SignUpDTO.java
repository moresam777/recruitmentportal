/**
 * 
 */
package com.tudip.dto;

/**
 * @author Samadhan.Mo
 *
 */
public class SignUpDTO {

	private String firstName="";
	private String lastName="";
	private int title;
	private int loginDetailsTblPk;
	private String birthDate="";
	private int gender;
	private int maritalStatus;
	private String mobileNo="";
	private String password="";
	private String activeFlag="";
	private String emailId="";
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getTitle() {
		return title;
	}
	public void setTitle(int title) {
		this.title = title;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(int maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getLoginDetailsTblPk() {
		return loginDetailsTblPk;
	}
	public void setLoginDetailsTblPk(int loginDetailsTblPk) {
		this.loginDetailsTblPk = loginDetailsTblPk;
	}
	
	
}
