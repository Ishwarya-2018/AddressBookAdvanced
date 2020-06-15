package com.blbz.advancd.addresbook.service.serviceimpl;

import java.util.ArrayList;
import java.util.Collection;

import com.blbz.advancd.addresbook.model.ContactPerson;
import com.blbz.advancd.addresbook.service.AddressBookService;
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
}