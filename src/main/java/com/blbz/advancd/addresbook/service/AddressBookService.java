package com.blbz.advancd.addresbook.service;

public interface AddressBookService {

	void createContactPerson();

	void editPerson();

	void deletePerson();

	void sortByName();

	void sortByZip();

	void viewPersonByCityAndState();

	void searchByCityAndState();

}
