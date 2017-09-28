package com.easylearnjava.springbootsalesforce.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {

	public String Id;
	public String Name;
	public String Industry;
	public BillingAddress BillingAddress;
	
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getIndustry() {
		return Industry;
	}

	public void setIndustry(String industry) {
		Industry = industry;
	}

	public BillingAddress getBillingAddress() {
		return BillingAddress;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		BillingAddress = billingAddress;
	}

	@Override
	public String toString() {
		return "Account [Id=" + Id + ", Name=" + Name + ", Industry=" + Industry + ", BillingAddress=" + BillingAddress
				+ "]";
	}

	

}
