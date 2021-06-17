/**
 * 
 */
package com.tudip.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tudip.dto.CommonListDTO;
import com.tudip.dto.GenericResponseDTO;
import com.tudip.dto.SignUpDTO;
import com.tudip.model.LoginDetailsTbl;
import com.tudip.services.ApplicantDetailsService;

/**
 * @author Samadhan.Mo
 *
 */
@RestController
@CrossOrigin
public class ApplicantDetailsController {

	@Autowired
	ApplicantDetailsService appDetailsService;
	
	@GetMapping("/getAllActiveCandidates")
	public GenericResponseDTO getAllActiveCandidates(@RequestParam Optional<String> name,
			@RequestParam Optional<Integer> page,@RequestParam Optional<String> sortBy) {
		GenericResponseDTO genericResponseDTO = null;
		try {			
			Pageable pageable = PageRequest.of(page.orElse(0), 5, Sort.Direction.DESC, sortBy.orElse("loginDetailsTblPk"));
			genericResponseDTO = new GenericResponseDTO("success",HttpStatus.OK,
					appDetailsService.getAllActiveCandidatesDetails(name.orElse("_"), pageable));			
		} catch (Exception e) {			
			genericResponseDTO = new GenericResponseDTO("failed",HttpStatus.BAD_REQUEST,new LoginDetailsTbl());
			e.printStackTrace();
		}
		return genericResponseDTO;
	}
	
	@PostMapping("/signUpCandidate")
	public GenericResponseDTO signUpCandidate(@RequestBody SignUpDTO signUpDTO,HttpServletRequest request,HttpServletResponse response) {
		GenericResponseDTO genericResponseDTO = null;
		try {
			LoginDetailsTbl loginDetailsTbl = appDetailsService.signUpCandidate(signUpDTO);
			if(loginDetailsTbl.getEmailId()!=null)
				genericResponseDTO = new GenericResponseDTO("success",HttpStatus.OK,loginDetailsTbl);
			else
				genericResponseDTO = new GenericResponseDTO("Email Id Is Present",HttpStatus.CONFLICT,signUpDTO);
		} catch (Exception e) {
			genericResponseDTO = new GenericResponseDTO("failed",HttpStatus.BAD_REQUEST,new SignUpDTO());
			e.printStackTrace();
		}
		return genericResponseDTO;
	}
	
	@PostMapping("/editSignUpDetails")
	public GenericResponseDTO editSignUpDetails(@RequestBody SignUpDTO signUpDTO,HttpServletRequest request,HttpServletResponse response) {
		GenericResponseDTO genericResponseDTO = null;
		try {
			genericResponseDTO = new GenericResponseDTO("success",HttpStatus.OK,appDetailsService.editSignUpDetails(signUpDTO));
		} catch (Exception e) {
			genericResponseDTO = new GenericResponseDTO("failed",HttpStatus.BAD_REQUEST,signUpDTO);
			e.printStackTrace();
		}
		return genericResponseDTO;
	}
	
	@PostMapping("saveCandidateAddress")
	public GenericResponseDTO saveCandidateAddress(@RequestBody CommonListDTO commonListDTO) {
		GenericResponseDTO genericResponseDTO = null;
		try {
			genericResponseDTO = new GenericResponseDTO("success",HttpStatus.OK,appDetailsService.saveCandidateAddress(commonListDTO));
		} catch (Exception e) {
			genericResponseDTO = new GenericResponseDTO("failed",HttpStatus.BAD_REQUEST,commonListDTO);
			e.printStackTrace();
		}
		return genericResponseDTO;
	}
	
}
