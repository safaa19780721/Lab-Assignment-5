package edu.wmich.cs1120.LA4.Pvarner.Ccaudle;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class FormatExceptionHandler implements IFormatExceptionHandler {

	@Override
	public void handleFileNotFoundException(FileNotFoundException e) {
		System.out.println("(The system cannot find the file specified)");
	}

	@Override
	public void handlePhoneNumberFormatException(PhoneNumberFormatException e) {

		String phoneNumber = e.getPhoneNumber();

		System.out.println("");

		ArrayList<String> al = new ArrayList<String>();

		for (int i = 0; i < phoneNumber.length(); i++) {
			if (Character.isDigit(phoneNumber.charAt(i))) {
				al.add(phoneNumber.charAt(i) + "");
			}

		}

		System.out.println("(" + al.get(0) + al.get(1) + al.get(2) + ")-" + al.get(3) + al.get(4) + al.get(5) + "-"
				+ al.get(6) + al.get(7) + al.get(8) + al.get(9));

	}

	@Override
	public void handleEmailFormatException(EmailAddressFormatException e) {
		String email = e.getEmail();
		char temp[] = new char[email.length()];

		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) == '@') {
				temp[i] = email.charAt(i);
			} else {
				temp[i] = Character.toLowerCase(email.charAt(i));
			}
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}
		System.out.println();

	}

	@Override
	public void handleNameFormatException(NameFormatException e) {

		String name = e.getName();

		char temp[] = new char[name.length()];

		for (int i = 0; i < name.length(); i++) {
			if (i == 0) {

				temp[i] = Character.toUpperCase(name.charAt(i));
			} else {
				temp[i] = Character.toLowerCase(name.charAt(i));
			}
		}

		for (int i = 0; i < name.length(); i++) {
			if (i == 0) {
				temp[i] = Character.toUpperCase(name.charAt(i));
			} else {
				temp[i] = Character.toLowerCase(name.charAt(i));
			}
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}
		System.out.print(" ");

	}

}
