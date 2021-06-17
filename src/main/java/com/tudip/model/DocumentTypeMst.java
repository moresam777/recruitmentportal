package com.tudip.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the document_type_mst database table.
 * 
 */
@Entity
@Table(name="document_type_mst")
@NamedQuery(name="DocumentTypeMst.findAll", query="SELECT d FROM DocumentTypeMst d")
public class DocumentTypeMst implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="doc_type")
	private String docType;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="doc_type_mst_pk")
	private int docTypeMstPk;

	public DocumentTypeMst() {
	}

	public String getDocType() {
		return this.docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public int getDocTypeMstPk() {
		return this.docTypeMstPk;
	}

	public void setDocTypeMstPk(int docTypeMstPk) {
		this.docTypeMstPk = docTypeMstPk;
	}

}