package com.blbz.advancd.addresbook;

import com.blbz.advancd.addresbook.service.AddressBookService;
import com.blbz.advancd.addresbook.service.serviceimpl.AddressBookServiceImpl;
import com.blbz.advancd.addresbook.utility.InputUtils;

public class App {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		AddressBookService addressBookService = new AddressBookServiceImpl();
		boolean flag = true;
		while (flag) {
			System.out.println("1:create ContactPerson\n 2:Edit\n 3:Delete\n 4:sort by First Name\n 5:sort by zip\n 6:view by city and state\n 7:Terminate");
			System.out.println("Enter the tab number : ");
			int choice = InputUtils.getInt();
			switch (choice) {
			case 1:
				addressBookService.createContactPerson();
				break;
			case 2:
				addressBookService.editPerson();
				break;
			case 3:
				addressBookService.deletePerson();
				break;
			case 4:
				addressBookService.sortByName();
				break;
			case 5:
				addressBookService.sortByZip();
				break;
			case 6:
				addressBookService.viewPersonByCityAndState();
				break;
			default:
				flag = false;
			}
		}
	}
}
