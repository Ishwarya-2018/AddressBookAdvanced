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

	public static ContactPerson getInputForEditPerson() {
		ContactPerson contactPerson = new ContactPerson();
		System.out.println("Enter first name : ");
		contactPerson.setFirstName(InputUtils.getString());
		System.out.println("Enter last name : ");
		contactPerson.setLastName(InputUtils.getString());
		System.out.println("Enter your changes : ");
		boolean b = true;
		while (b) {
			System.out.println(
					" 1:change Address\n 2:change city\n 3:change state\n 4:change zip\n 5:change phone no. \n6:done");
			int num = InputUtils.getInt();
			switch (num) {
			case 1:
				System.out.println("Enter Address.");
				contactPerson.setAddress(InputUtils.getString());
				break;
			case 2:
				System.out.println("Enter city name : ");
				contactPerson.setCity(InputUtils.getString());
				break;
			case 3:
				System.out.println("Enter state name : ");
				contactPerson.setState(InputUtils.getString());
				break;
			case 4:
				System.out.println("Enter Zip code : ");
				contactPerson.setZip(InputUtils.getLong());
				break;
			case 5:
				System.out.println("Enter Phone Number : ");
				contactPerson.setPhoneNo(InputUtils.getLong());
				break;
			case 6:
				return contactPerson;

			default:
				b = false;
				break;
			}
		}
		return contactPerson;
	}
}
