package com.spring.batch.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "UserRegistration")
public class UserRegistrationName {

	private String name;

	private String company;

	private String address;

	private String city;

	private String state;

	private String zip;

	private String country;

	private String url;

	private String phoneNumber;

	private String fax;

	public UserRegistrationName() {
		// TODO Auto-generated constructor stub
	}

	public UserRegistrationName(String name, String company, String address, String city, String state, String zip,
			String country, String url, String phoneNumber, String fax) {
		super();
		this.name = name;
		this.company = company;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
		this.url = url;
		this.phoneNumber = phoneNumber;
		this.fax = fax;
	}

	@XmlElement(name = "FullName")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name = "company")
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@XmlElement(name = "address")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@XmlElement(name = "city")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@XmlElement(name = "state")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@XmlElement(name = "zip")
	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@XmlElement(name = "country")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@XmlElement(name = "url")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@XmlElement(name = "phoneNumber")
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@XmlElement(name = "fax")
	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	@Override
	public String toString() {
		return "UserRegistrationName [name=" + name + ", company=" + company + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", country=" + country + ", url=" + url + ", phoneNumber="
				+ phoneNumber + ", fax=" + fax + "]";
	}

}
