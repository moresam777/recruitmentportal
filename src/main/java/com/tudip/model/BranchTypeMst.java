package com.tudip.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the branch_type_mst database table.
 * 
 */
@Entity
@Table(name="branch_type_mst")
@NamedQuery(name="BranchTypeMst.findAll", query="SELECT b FROM BranchTypeMst b")
public class BranchTypeMst implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="branch_mst_pk")
	private int branchMstPk;

	private String branch;

	public BranchTypeMst() {
	}

	public int getBranchMstPk() {
		return this.branchMstPk;
	}

	public void setBranchMstPk(int branchMstPk) {
		this.branchMstPk = branchMstPk;
	}

	public String getBranch() {
		return this.branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

}