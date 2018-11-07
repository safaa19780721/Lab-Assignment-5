package edu.wmich.cs1120.LA4.Pvarner.Ccaudle;

public class PhoneNumberFormatException extends Exception {

	private String phoneNumber;

	public PhoneNumberFormatException(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
