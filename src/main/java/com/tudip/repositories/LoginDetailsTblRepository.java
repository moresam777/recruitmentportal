/**
 * 
 */
package com.tudip.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tudip.model.LoginDetailsTbl;

/**
 * @author Samadhan.Mo
 *
 */
@Repository
public interface LoginDetailsTblRepository extends JpaRepository<LoginDetailsTbl, Integer> {
	
	@Query("SELECT DISTINCT l FROM LoginDetailsTbl l WHERE l.firstName LIKE %?1% AND l.activeFlag='Y'")
	Page<LoginDetailsTbl> findAllActiveCandidates(String name,Pageable pageable);
	
	@Query("SELECT DISTINCT l FROM LoginDetailsTbl l WHERE l.emailId=:emailId")
	List<LoginDetailsTbl> checkCandidatesByEmailId(String emailId);
	
	@Modifying
	@Query("UPDATE LoginDetailsTbl l SET l.birthDate=:birthDate,l.emailId=:emailId,l.firstName=:firstName,l.gender=:gender,"
			+ "l.lastName=:lastName,l.maritalStatus=:maritalStatus,l.mobile=:mobileNo,l.title=:title WHERE l.loginDetailsTblPk=:loginDetailsTblPk")
	void editSignUpDetails(String birthDate, String emailId, String firstName, int gender, String lastName,
			int maritalStatus, String mobileNo, int title,int loginDetailsTblPk);
}
