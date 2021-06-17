package com.tudip.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the position_mst database table.
 * 
 */
@Entity
@Table(name="position_mst")
@NamedQuery(name="PositionMst.findAll", query="SELECT p FROM PositionMst p")
public class PositionMst implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="position_mst_pk", unique=true, nullable=false)
	private int positionMstPk;

	@Column(length=50)
	private String position;

	public PositionMst() {
	}

	public int getPositionMstPk() {
		return this.positionMstPk;
	}

	public void setPositionMstPk(int positionMstPk) {
		this.positionMstPk = positionMstPk;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}