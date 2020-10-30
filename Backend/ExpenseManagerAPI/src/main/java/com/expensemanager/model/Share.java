package com.expensemanager.model;

import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Share {

	Integer partnerId;
	
	@ManyToOne
	@JsonIgnore
	private Transaction transaction;

	public Integer getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(Integer partnerId) {
		this.partnerId = partnerId;
	}
	
	
	
}
