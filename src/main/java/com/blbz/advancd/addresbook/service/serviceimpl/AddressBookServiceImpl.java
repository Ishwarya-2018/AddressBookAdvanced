package com.blbz.advancd.addresbook.service.serviceimpl;

import java.util.ArrayList;
import java.util.Collection;

import com.blbz.advancd.addresbook.model.ContactPerson;
import com.blbz.advancd.addresbook.service.AddressBookService;
import com.blbz.advancd.addresbook.utility.InputUtils;
import com.blbz.advancd.addresbook.utility.UserInputUtils;

public class AddressBookServiceImpl implements AddressBookService {

	private ArrayList<ContactPerson> list = new ArrayList<ContactPerson>();

	public void createContactPerson() {
		ContactPerson contactPerson = UserInputUtils.getInputForNewUser();
		list.add(contactPerson);
		display(list);
	}

	public static void display(Collection<ContactPerson> list1) {
		for (ContactPerson contactPerson : list1) {
			System.out.println(contactPerson.getFirstName());
			System.out.println(contactPerson.getLastName());
			System.out.println(contactPerson.getAddress());
			System.out.println(contactPerson.getCity());
			System.out.println(contactPerson.getState());
			System.out.println(contactPerson.getZip());
			System.out.println(contactPerson.getPhoneNo());
			System.out.println();
		}
	}

	public void editPerson() {
		ContactPerson contactPersonInput = UserInputUtils.getInputForEditPerson();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getFirstName().equalsIgnoreCase(contactPersonInput.getFirstName())
					&& list.get(i).getLastName().equalsIgnoreCase(contactPersonInput.getLastName())) {
				ContactPerson contactPerson = list.get(i);
				if (contactPersonInput.getAddress() != null) {
					contactPerson.setAddress(contactPersonInput.getAddress());
				}
				if (contactPersonInput.getCity() != null) {
					contactPerson.setCity(contactPersonInput.getCity());
				}
				if (contactPersonInput.getState() != null) {
					contactPerson.setState(contactPersonInput.getState());
				}
				if (contactPersonInput.getZip() != null) {
					contactPerson.setZip(contactPersonInput.getZip());
				}
				if (contactPersonInput.getPhoneNo() != null) {
					contactPerson.setPhoneNo(contactPersonInput.getPhoneNo());
				}
				list.set(i, contactPerson);
				display(list);
			}
		}
	}

	public void deletePerson() {
		System.out.println("Enter the employee's first-name and last-name");
		String firstName = InputUtils.getString();
		String lastName = InputUtils.getString();
		list.removeIf(user -> user.getFirstName().equalsIgnoreCase(firstName)
				&& user.getLastName().equalsIgnoreCase(lastName));
		display(list);

	}
}
