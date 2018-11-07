package edu.wmich.cs1120.LA4.Pvarner.Ccaudle;

public class EmailAddressFormatException extends Exception {

	private String email;

	public EmailAddressFormatException(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
