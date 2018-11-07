package edu.wmich.cs1120.LA4.Pvarner.Ccaudle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactInformationFormatter implements IContactInformationFormatter {

	@Override
	public void readContactInformation(String[] filePaths) {

		String temp = "";
		for (int i = 0; i < filePaths.length; i++) {
			FormatExceptionHandler handler = new FormatExceptionHandler();
			File file = new File(filePaths[i]);

			try {
				Scanner scan = new Scanner(file);
				while (scan.hasNext()) {
					temp = temp + scan.next() + " ";
				}
				formatContactInformation(temp);
				temp = "";

				scan.close();
			} catch (FileNotFoundException e) {
				System.out.print(filePaths[i] + " ");
				handler.handleFileNotFoundException(e);
			}

		}

	}

	@Override
	public void formatContactInformation(String fileName) {
		// TODO Auto-generated method stub
		String[] div;
		div = fileName.split(" ");

		FormatExceptionHandler handler = new FormatExceptionHandler();

		try {
			formatName(div[0]);
		} catch (NameFormatException e) {
			// TODO Auto-generated catch block
			handler.handleNameFormatException(e);
		}
		try {
			formatName(div[1]);
		} catch (NameFormatException e) {
			// TODO Auto-generated catch block
			handler.handleNameFormatException(e);
		}

		try {
			formatPhoneNumber(div[2]);
		} catch (PhoneNumberFormatException e) {
			// TODO Auto-generated catch block
			handler.handlePhoneNumberFormatException(e);
		}

		try {
			formatEmail(div[3]);
		} catch (EmailAddressFormatException e) {
			// TODO Auto-generated catch block
			handler.handleEmailFormatException(e);
		}
	}

	@Override
	public void formatEmail(String email) throws EmailAddressFormatException {
		boolean print = true;
		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) != '@' || Character.isUpperCase(email.charAt(i))) {
				print = false;
				throw new EmailAddressFormatException(email);
			}
		}

		if (print == true) {
			System.out.println(email);
		}

	}

	@Override
	public void formatPhoneNumber(String phoneNumber) throws PhoneNumberFormatException {
		boolean print = true;

		if (phoneNumber.charAt(0) != '(') {
			print = false;
			throw new PhoneNumberFormatException(phoneNumber);
		}
		if (!Character.isDigit(phoneNumber.charAt(1))) {
			print = false;
			throw new PhoneNumberFormatException(phoneNumber);
		}
		if (!Character.isDigit(phoneNumber.charAt(2))) {
			print = false;
			throw new PhoneNumberFormatException(phoneNumber);
		}
		if (!Character.isDigit(phoneNumber.charAt(3))) {
			print = false;
			throw new PhoneNumberFormatException(phoneNumber);
		}
		if (phoneNumber.charAt(4) != ')') {
			print = false;
			throw new PhoneNumberFormatException(phoneNumber);
		}
		if (phoneNumber.charAt(5) != '-') {
			print = false;
			throw new PhoneNumberFormatException(phoneNumber);
		}
		if (!Character.isDigit(phoneNumber.charAt(6))) {
			print = false;
			throw new PhoneNumberFormatException(phoneNumber);
		}
		if (!Character.isDigit(phoneNumber.charAt(7))) {
			print = false;
			throw new PhoneNumberFormatException(phoneNumber);
		}
		if (!Character.isDigit(phoneNumber.charAt(8))) {
			print = false;
			throw new PhoneNumberFormatException(phoneNumber);
		}
		if (phoneNumber.charAt(9) != '-') {
			print = false;
			throw new PhoneNumberFormatException(phoneNumber);
		}
		if (!Character.isDigit(phoneNumber.charAt(10))) {
			print = false;
			throw new PhoneNumberFormatException(phoneNumber);
		}
		if (!Character.isDigit(phoneNumber.charAt(11))) {
			print = false;
			throw new PhoneNumberFormatException(phoneNumber);
		}
		if (!Character.isDigit(phoneNumber.charAt(12))) {
			print = false;
			throw new PhoneNumberFormatException(phoneNumber);
		}
		if (!Character.isDigit(phoneNumber.charAt(13))) {
			print = false;
			throw new PhoneNumberFormatException(phoneNumber);
		}

		if (print == true) {
			System.out.println(phoneNumber);
		}

	}

	@Override
	public void formatName(String name) throws NameFormatException {

		boolean print = true;

		if (!Character.isUpperCase(name.charAt(0))) {
			print = false;
			throw new NameFormatException(name);
		}

		for (int i = 1; i < name.length(); i++) {
			if (!Character.isLowerCase(name.charAt(0))) {
				print = false;
				throw new NameFormatException(name);
			}
		}

		if (print == true) {
			System.out.println(name);
		}

	}
}
