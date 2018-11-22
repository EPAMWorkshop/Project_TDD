package com.epam.app.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PersonEducationDocument {
	@Id
	private String userID;
	@Column
	private String document_url;
	@Column
	private String dateOfCreation;
	@Column
	private String dateOfModification;
	@Column
	private String statusOfUpload;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getDocument_url() {
		return document_url;
	}
	public void setDocument_url(String document_url) {
		this.document_url = document_url;
	}
	public String getDateOfCreation() {
		return dateOfCreation;
	}
	public void setDateOfCreation(String dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}
	public String getDateOfModification() {
		return dateOfModification;
	}
	public void setDateOfModification(String dateOfModification) {
		this.dateOfModification = dateOfModification;
	}
	public String getStatusOfUpload() {
		return statusOfUpload;
	}
	public void setStatusOfUpload(String statusOfUpload) {
		this.statusOfUpload = statusOfUpload;
	}
	
	

}
