package com.tudip.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the address_type_mst database table.
 * 
 */
@Entity
@Table(name="address_type_mst")
@NamedQuery(name="AddressTypeMst.findAll", query="SELECT a FROM AddressTypeMst a")
public class AddressTypeMst implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="add_mst_pk")
	private int addMstPk;

	@Column(name="address_type")
	private String addressType;

	public AddressTypeMst() {
	}

	public int getAddMstPk() {
		return this.addMstPk;
	}

	public void setAddMstPk(int addMstPk) {
		this.addMstPk = addMstPk;
	}

	public String getAddressType() {
		return this.addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

}