package com.easylearnjava.springbootsalesforce.model;

public class BillingAddress {
	
	private String city;
	private String country;
	private String countryCode;
	private String geocodeAccuracy;
	private String latitude;
	private String longitude;
	private String postalCode;
	private String state;
	private String stateCode;
	private String street;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getGeocodeAccuracy() {
		return geocodeAccuracy;
	}
	public void setGeocodeAccuracy(String geocodeAccuracy) {
		this.geocodeAccuracy = geocodeAccuracy;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "BillingAddress [city=" + city + ", country=" + country + ", countryCode=" + countryCode
				+ ", geocodeAccuracy=" + geocodeAccuracy + ", latitude=" + latitude + ", longitude=" + longitude
				+ ", postalCode=" + postalCode + ", state=" + state + ", stateCode=" + stateCode + ", street=" + street
				+ "]";
	}	
	
}
