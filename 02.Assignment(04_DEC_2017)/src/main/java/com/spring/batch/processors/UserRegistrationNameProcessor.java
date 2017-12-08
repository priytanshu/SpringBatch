package com.spring.batch.processors;

import org.springframework.batch.item.ItemProcessor;

import com.spring.batch.beans.UserRegistration;
import com.spring.batch.beans.UserRegistrationName;

public class UserRegistrationNameProcessor implements ItemProcessor<UserRegistration, UserRegistrationName> {

	UserRegistrationName usrgNameObj;

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

	public UserRegistrationName process(UserRegistration input) throws Exception {

		name = input.getFirstName() +" " +input.getLastName();
		company = input.getCompany();
		address = input.getAddress();
		city = input.getCity();
		state = input.getState();
		zip = input.getZip();
		country = input.getCountry();
		url = input.getUrl();
		phoneNumber = input.getPhoneNumber();
		fax = input.getFax();

		usrgNameObj = new UserRegistrationName(name, company, address, city, state, zip, country, url, phoneNumber,
				fax);

		System.out.println("UserRegistrationName: " + usrgNameObj);
		return usrgNameObj;
	}

}
