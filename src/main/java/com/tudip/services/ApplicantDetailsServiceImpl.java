/**
 * 
 */
package com.tudip.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.tudip.dto.CommonListDTO;
import com.tudip.dto.SignUpDTO;
import com.tudip.model.AddressDetailsTbl;
import com.tudip.model.LoginDetailsTbl;
import com.tudip.repositories.AddressDetailsRepository;
import com.tudip.repositories.LoginDetailsTblRepository;

/**
 * @author Samadhan.Mo
 *
 */
@Transactional
@Service
public class ApplicantDetailsServiceImpl implements ApplicantDetailsService{

	@Autowired
	LoginDetailsTblRepository loginRepository;
	
	@Autowired
	AddressDetailsRepository addressRepository;
	
	@Override
	public Page<LoginDetailsTbl> getAllActiveCandidatesDetails(String name,Pageable pageable) throws Exception {
		return loginRepository.findAllActiveCandidates(name,pageable);
	}

	@Override
	public LoginDetailsTbl signUpCandidate(SignUpDTO signUpDTO) throws Exception {
		LoginDetailsTbl tempObj =null;
		 List<LoginDetailsTbl> emailCheck = loginRepository.checkCandidatesByEmailId(signUpDTO.getEmailId());
		if(emailCheck.size()==0) {
			tempObj = new LoginDetailsTbl();
			tempObj.setBirthDate(signUpDTO.getBirthDate());
			tempObj.setEmailId(signUpDTO.getEmailId());
			tempObj.setFirstName(signUpDTO.getFirstName());
			tempObj.setGender(signUpDTO.getGender());
			tempObj.setLastName(signUpDTO.getLastName());
			tempObj.setMaritalStatus(signUpDTO.getMaritalStatus());
			tempObj.setMobile(signUpDTO.getMobileNo());
			tempObj.setPassword(DigestUtils.md5DigestAsHex(signUpDTO.getPassword().getBytes()));
			tempObj.setTitle(signUpDTO.getTitle());
			tempObj.setActiveFlag("Y");
			tempObj = loginRepository.save(tempObj);
		}else {
			tempObj = new LoginDetailsTbl();
		}
		return tempObj;
	}

	@Override
	public Optional<LoginDetailsTbl> editSignUpDetails(SignUpDTO signUpDTO) throws Exception {
		loginRepository.editSignUpDetails(signUpDTO.getBirthDate(),signUpDTO.getEmailId(),signUpDTO.getFirstName(),signUpDTO.getGender(),
				signUpDTO.getLastName(),signUpDTO.getMaritalStatus(),signUpDTO.getMobileNo(),signUpDTO.getTitle(),signUpDTO.getLoginDetailsTblPk());
		return loginRepository.findById(signUpDTO.getLoginDetailsTblPk());
	}

	@Override
	public List<AddressDetailsTbl> saveCandidateAddress(CommonListDTO commonListDTO) throws Exception {
		List<AddressDetailsTbl> saveAddressDetailsList = new ArrayList<AddressDetailsTbl>();
		commonListDTO.getAddressDetailsDTO().stream().forEach(data->{
			AddressDetailsTbl tempObj = new AddressDetailsTbl();
			tempObj.setActiveFlag("Y");
			tempObj.setAddressDetailsTblPk(data.getAddressDetailsTblPk());
			tempObj.setAddressline(data.getAddressline());
			tempObj.setAddressType(data.getAddressType());
			tempObj.setApplicantId(commonListDTO.getApplicantId());
			tempObj.setCity(data.getCity());
			tempObj.setCountry(data.getCountry());
			tempObj.setDistrict(data.getDistrict());
			tempObj.setPincode(data.getPincode());
			tempObj.setState(data.getState());
			tempObj.setStreet(data.getStreet());
			tempObj.setTaluka(data.getTaluka());
			//To Save Address Details
			tempObj = addressRepository.save(tempObj);
			//To Return Saved Address Details.
			saveAddressDetailsList.add(tempObj);
			
		});
		return saveAddressDetailsList;
	}	
	
}
