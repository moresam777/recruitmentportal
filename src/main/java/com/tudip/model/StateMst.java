package com.tudip.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the state_mst database table.
 * 
 */
@Entity
@Table(name="state_mst")
@NamedQuery(name="StateMst.findAll", query="SELECT s FROM StateMst s")
public class StateMst implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="state_mst_pk")
	private int stateMstPk;

	private String state;

	public StateMst() {
	}

	public int getStateMstPk() {
		return this.stateMstPk;
	}

	public void setStateMstPk(int stateMstPk) {
		this.stateMstPk = stateMstPk;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}