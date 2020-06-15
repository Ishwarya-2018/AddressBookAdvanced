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
			System.out.println("1:create ContactPerson\n 2:Edit\n 3:Delete\n 4:Terminate");
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
			default:
				flag = false;
			}
		}
	}
}
