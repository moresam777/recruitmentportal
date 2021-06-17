package com.tudip.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the district_mst database table.
 * 
 */
@Entity
@Table(name="district_mst")
@NamedQuery(name="DistrictMst.findAll", query="SELECT d FROM DistrictMst d")
public class DistrictMst implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="district_mst_pk")
	private int districtMstPk;

	private String district;

	public DistrictMst() {
	}

	public int getDistrictMstPk() {
		return this.districtMstPk;
	}

	public void setDistrictMstPk(int districtMstPk) {
		this.districtMstPk = districtMstPk;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

}