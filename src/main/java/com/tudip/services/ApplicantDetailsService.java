/**
 * 
 */
package com.tudip.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tudip.dto.CommonListDTO;
import com.tudip.dto.SignUpDTO;
import com.tudip.model.AddressDetailsTbl;
import com.tudip.model.LoginDetailsTbl;

/**
 * @author Samadhan.Mo
 *
 */
public interface ApplicantDetailsService {
	
	Page<LoginDetailsTbl> getAllActiveCandidatesDetails(String name,Pageable pageable) throws Exception;

	LoginDetailsTbl signUpCandidate(SignUpDTO signUpDTO) throws Exception;

	Optional<LoginDetailsTbl> editSignUpDetails(SignUpDTO signUpDTO) throws Exception;

	List<AddressDetailsTbl> saveCandidateAddress(CommonListDTO commonListDTO) throws Exception;

}
