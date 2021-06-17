package com.tudip.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the country_mst database table.
 * 
 */
@Entity
@Table(name="country_mst")
@NamedQuery(name="CountryMst.findAll", query="SELECT c FROM CountryMst c")
public class CountryMst implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="country_mst_pk")
	private int countryMstPk;

	private String country;

	public CountryMst() {
	}

	public int getCountryMstPk() {
		return this.countryMstPk;
	}

	public void setCountryMstPk(int countryMstPk) {
		this.countryMstPk = countryMstPk;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}