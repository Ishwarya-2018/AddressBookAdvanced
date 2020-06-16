package com.blbz.advancd.addresbook.service.serviceimpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.blbz.advancd.addresbook.model.ContactPerson;
import com.blbz.advancd.addresbook.service.AddressBookService;
import com.blbz.advancd.addresbook.utility.AddressBookNameComparator;
import com.blbz.advancd.addresbook.utility.AddressBookZipComparator;
import com.blbz.advancd.addresbook.utility.InputUtils;
import com.blbz.advancd.addresbook.utility.UserInputUtils;

public class AddressBookServiceImpl implements AddressBookService {

	private ArrayList<ContactPerson> list = new ArrayList<ContactPerson>();
	private TreeSet<ContactPerson> sortedUsers;
	private Map<String, ArrayList<String>> cityPerson = new HashMap<>();
	private Map<String, ArrayList<String>> statePerson = new HashMap<>();

	public void createContactPerson() {
		ContactPerson contactPerson = UserInputUtils.getInputForNewUser();
		boolean isPersonPresent = list.stream().filter(obj -> (obj.equals(contactPerson))).findFirst().isPresent();
		if (!isPersonPresent) {
			list.add(contactPerson);
		} else {
			System.out.println("Person Already present please give different person name");
		}
		display(list);
	}

	public static void display(Collection<ContactPerson> list1) {
		for (ContactPerson contactPerson : list1) {
			System.out.println(contactPerson.toString());
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

	public void sortByName() {
		sortedUsers = new TreeSet<>(new AddressBookNameComparator());
		sortedUsers.addAll(list);
		display(sortedUsers);
	}

	public void sortByZip() {
		sortedUsers = new TreeSet<>(new AddressBookZipComparator());
		sortedUsers.addAll(list);
		display(sortedUsers);
	}

	public void storePersonBasedCityAndState() {
		list.forEach(contactPerson -> {
			if (cityPerson.containsKey(contactPerson.getCity())) {
				cityPerson.get(contactPerson.getCity())
						.add(contactPerson.getFirstName() + " " + contactPerson.getLastName());
			} else {
				ArrayList<String> names = new ArrayList<String>();
				names.add(contactPerson.getFirstName() + " " + contactPerson.getLastName());
				cityPerson.put(contactPerson.getCity(), names);
			}

			if (statePerson.containsKey(contactPerson.getState())) {
				statePerson.get(contactPerson.getState())
						.add(contactPerson.getFirstName() + " " + contactPerson.getLastName());
			} else {
				ArrayList<String> names = new ArrayList<String>();
				names.add(contactPerson.getFirstName() + " " + contactPerson.getLastName());
				statePerson.put(contactPerson.getState(), names);
			}
		});
	}

	public void viewPersonByCityAndState() {
		storePersonBasedCityAndState();
		System.out.println("Dictionary order for State");
		System.out.println(statePerson);
		System.out.println("Dictionary order for city");
		System.out.println(cityPerson);
	}

	public void searchByCityAndState() {
		System.out.println("Search person by city or state");
		String cityState = InputUtils.getString();
		List<ContactPerson> list1 = list.stream().filter(contactPerson -> (contactPerson.getCity().equals(cityState)
				|| contactPerson.getState().equals(cityState))).collect(Collectors.toList());
		display(list1);
	}
}
