package com.blbz.advancd.addresbook.utility;

import com.blbz.advancd.addresbook.model.ContactPerson;

public class UserInputUtils {

	public static ContactPerson getInputForNewUser() {
		ContactPerson contactPerson = new ContactPerson();
		System.out.println("Enter the first name");
		contactPerson.setFirstName(InputUtils.getString());
		System.out.println("Enter the last name");
		contactPerson.setLastName(InputUtils.getString());
		System.out.println("Enter the address");
		contactPerson.setAddress(InputUtils.getString());
		System.out.println("Enter the city");
		contactPerson.setCity(InputUtils.getString());
		System.out.println("Enter the state");
		contactPerson.setState(InputUtils.getString());
		System.out.println("Enter the zip");
		contactPerson.setZip(InputUtils.getLong());
		System.out.println("Enter the phone number");
		contactPerson.setPhoneNo(InputUtils.getLong());
		return contactPerson;
	}
}
