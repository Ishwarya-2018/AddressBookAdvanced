package com.blbz.advancd.addresbook.utility;

import com.blbz.advancd.addresbook.model.ContactPerson;
import java.util.Comparator;

public class AddressBookNameComparator implements Comparator<ContactPerson> {
	public int compare(ContactPerson user1, ContactPerson user2) {
		if (user1.getFirstName().compareTo(user2.getFirstName()) != 0) {
			return user1.getFirstName().compareTo(user2.getFirstName());
		}else
		   return user1.getLastName().compareTo(user2.getLastName());
	}
}