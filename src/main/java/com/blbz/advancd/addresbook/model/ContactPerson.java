package com.blbz.advancd.addresbook.model;

public class ContactPerson {

	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private Long zip;
	private Long phoneNo;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getZip() {
		return zip;
	}

	public void setZip(Long zip) {
		this.zip = zip;
	}

	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
//		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
//		return result;
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactPerson other = (ContactPerson) obj;
		if (firstName == null && lastName == null) {
			if (other.firstName != null && other.lastName != null)
				return false;
		} else if (!(firstName + lastName).equals(other.firstName + other.lastName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ContactPerson [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
				+ city + ", state=" + state + ", zip=" + zip + ", phoneNo=" + phoneNo + ", getFirstName()="
				+ getFirstName() + ", getLastName()=" + getLastName() + ", getAddress()=" + getAddress()
				+ ", getCity()=" + getCity() + ", getState()=" + getState() + ", getZip()=" + getZip()
				+ ", getPhoneNo()=" + getPhoneNo() +"]";
	}
}
