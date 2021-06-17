package com.tudip.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the title_mst database table.
 * 
 */
@Entity
@Table(name="title_mst")
@NamedQuery(name="TitleMst.findAll", query="SELECT t FROM TitleMst t")
public class TitleMst implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="title_mst_pk")
	private int titleMstPk;

	private String title;

	public TitleMst() {
	}

	public int getTitleMstPk() {
		return this.titleMstPk;
	}

	public void setTitleMstPk(int titleMstPk) {
		this.titleMstPk = titleMstPk;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}