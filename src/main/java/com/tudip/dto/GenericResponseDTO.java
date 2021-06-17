/**
 * 
 */
package com.tudip.dto;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

/**
 * @author Samadhan.Mo
 *
 */

public class GenericResponseDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String status = "";
	private Object content = "";
	private HttpStatus httpStatus;
	public GenericResponseDTO() {
		super();
	}
	
	public GenericResponseDTO(String status,HttpStatus httpStatus, Object content) {
		super();
		this.status = status;
		this.content = content;
		this.httpStatus = httpStatus;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Object getContent() {
		return content;
	}
	public void setContent(Object content) {
		this.content = content;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	
	

}
