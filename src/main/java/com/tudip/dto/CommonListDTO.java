/**
 * 
 */
package com.tudip.dto;

import java.util.List;

/**
 * @author Samadhan.Mo
 *
 */
public class CommonListDTO {
	
	private int applicantId;
	List<AddressDetailsDTO> addressDetailsDTO;

	public List<AddressDetailsDTO> getAddressDetailsDTO() {
		return addressDetailsDTO;
	}

	public void setAddressDetailsDTO(List<AddressDetailsDTO> addressDetailsDTO) {
		this.addressDetailsDTO = addressDetailsDTO;
	}

	public int getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}
	
	
	
	
}
