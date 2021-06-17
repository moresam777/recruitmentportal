/**
 * 
 */
package com.tudip.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tudip.model.AddressDetailsTbl;

/**
 * @author Samadhan.Mo
 *
 */

@Repository
public interface AddressDetailsRepository extends JpaRepository<AddressDetailsTbl, Integer> {

}
