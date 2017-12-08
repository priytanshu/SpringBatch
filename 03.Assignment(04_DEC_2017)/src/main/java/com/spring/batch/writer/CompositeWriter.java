package com.spring.batch.writer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.spring.batch.beans.UserRegistrationDate;

public class CompositeWriter implements ItemWriter<UserRegistrationDate> {

	private ItemWriter<UserRegistrationDate> itemWriter1;
	private ItemWriter<UserRegistrationDate> itemWriter2;

	public void write(List<? extends UserRegistrationDate> input) throws Exception {

		List<UserRegistrationDate> validDob = new ArrayList<UserRegistrationDate>();
		List<UserRegistrationDate> invalidDob = new ArrayList<UserRegistrationDate>();

		for (UserRegistrationDate usr : input) {
			System.out.println(usr.getDod());
			if (usr.getDod() != null) {
				if (usr.getDob().after(usr.getDod())) {
					invalidDob.add(usr);
				} else
					validDob.add(usr);
			} else {
				validDob.add(usr);
			}

		}

		itemWriter1.write(validDob);
		itemWriter2.write(invalidDob);

	}

	public void setDelegate1(ItemWriter<UserRegistrationDate> itemWriter) {
		this.itemWriter1 = itemWriter;
	}

	public void setDelegate2(ItemWriter<UserRegistrationDate> itemWriter) {
		this.itemWriter2 = itemWriter;
	}

}
