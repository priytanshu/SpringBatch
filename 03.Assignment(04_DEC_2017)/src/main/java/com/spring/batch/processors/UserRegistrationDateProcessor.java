package com.spring.batch.processors;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.batch.item.ItemProcessor;

import com.spring.batch.beans.UserRegistration;
import com.spring.batch.beans.UserRegistrationDate;

public class UserRegistrationDateProcessor implements ItemProcessor<UserRegistration, UserRegistrationDate> {

	UserRegistrationDate usrRgD;

	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

	private String firstName;
	private String lastName;
	private String company;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String country;
	private String url;
	private String phoneNumber;
	private String fax;
	private Date dob;
	private Date dod;

	public UserRegistrationDate process(UserRegistration input) throws Exception {

		usrRgD = new UserRegistrationDate();

		firstName = input.getFirstName();
		lastName = input.getLastName();
		company = input.getCompany();
		address = input.getAddress();
		city = input.getCity();
		state = input.getState();
		zip = input.getZip();
		country = input.getCountry();
		url = input.getUrl();
		phoneNumber = input.getPhoneNumber();
		fax = input.getFax();

		System.out.println("DOB Parser: " + input.getDob());
		System.out.println("DOD Parser: " + input.getDod());
		dob = dateFormat.parse(input.getDob());
		if (input.getDod() != "") {
			dod = dateFormat.parse(input.getDod());
			usrRgD.setDod(dod);
		}

		usrRgD.setFirstName(firstName);
		usrRgD.setLastName(lastName);
		usrRgD.setCompany(company);
		usrRgD.setAddress(address);
		usrRgD.setCity(city);
		usrRgD.setState(state);
		usrRgD.setZip(zip);
		usrRgD.setCountry(country);
		usrRgD.setUrl(url);
		usrRgD.setPhoneNumber(phoneNumber);
		usrRgD.setFax(fax);
		usrRgD.setDob(dob);
		
		return usrRgD;
	}

}
