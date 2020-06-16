package com.blbz.advancd.addresbook.utility;

import java.util.Comparator;

import com.blbz.advancd.addresbook.model.ContactPerson;

public class AddressBookZipComparator implements Comparator<ContactPerson> {

	@Override
	public int compare(ContactPerson user1, ContactPerson user2) {
		return user1.getZip().compareTo(user2.getZip());

	}
}
