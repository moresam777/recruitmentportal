package com.tudip.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the skill_mst database table.
 * 
 */
@Entity
@Table(name="skill_mst")
@NamedQuery(name="SkillMst.findAll", query="SELECT s FROM SkillMst s")
public class SkillMst implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="skill_mst_pk", unique=true, nullable=false)
	private int skillMstPk;

	@Column(length=50)
	private String skill;

	public SkillMst() {
	}

	public int getSkillMstPk() {
		return this.skillMstPk;
	}

	public void setSkillMstPk(int skillMstPk) {
		this.skillMstPk = skillMstPk;
	}

	public String getSkill() {
		return this.skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

}