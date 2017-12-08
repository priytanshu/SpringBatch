package com.spring.batch.processors;

import org.springframework.batch.item.ItemProcessor;

import com.spring.batch.beans.UserRegistration;

public class UserRegistrationValidationItemProcessor implements ItemProcessor<UserRegistration, UserRegistration> {

	public UserRegistration process(UserRegistration input) throws Exception {
		System.out.println("Processor called: " + input.toString());
		return input;
	}

}
