package edu.wmich.cs1120.LA4.Pvarner.Ccaudle;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ContactInformationFormatter implements IContactInformationFormatter {
	
	@Override
	public void readContactInformation(String[] filePaths) {
		// TODO Auto-generated method stub
		String[] div;
		String temp;
		
		FormatExceptionHandler handler = new FormatExceptionHandler();
		
		for(int i=0; i<filePaths.length; i++) {
			temp = filePaths[i];
			div = temp.split(" ");
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
				e.printStackTrace();
			}
			
			try {
				formatEmail(div[3]);
			} catch (EmailAddressFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}

	@Override
	public void formatContactInformation(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void formatEmail(String email) throws EmailAddressFormatException {
		// TODO Auto-generated method stub
		char temp[] = new char[email.length()];
		for(int i=0; i<email.length(); i++) {
			if(email.charAt(i) == '@') {
				temp[i] = email.charAt(i);
			}
			else {
				temp[i] = Character.toLowerCase(email.charAt(i));
			}
		}
		for(int i=0; i<temp.length; i++) {
			System.out.print(temp[i]);
		}
		System.out.println();
	
	}

	@Override
	public void formatPhoneNumber(String phoneNumber) throws PhoneNumberFormatException {
		// TODO Auto-generated method stub
		char temp[] = new char[phoneNumber.length()];
		for(int i=0; i<phoneNumber.length(); i++) {
			if(Character.isDigit(phoneNumber.charAt(i))) {
				temp[i] = Character.toUpperCase(phoneNumber.charAt(i));
			}
		}
		System.out.println(temp[0] + temp[1] + temp[2] +"-"+ temp[3] + temp[4] + temp[5] +"-"+temp[6] + temp[7] + temp[8] + temp[9]);
	}

	@Override
	public void formatName(String name) throws NameFormatException {
		
		boolean print = true;
		
		if(!Character.isUpperCase(name.charAt(0))) {
			print = false;
			throw new NameFormatException(name);
		}
		
		for(int i = 1; i<name.length(); i++) {
			if(!Character.isLowerCase(name.charAt(0))) {
				print = false;
				throw new NameFormatException(name);
			}	
		}
		
		if(print == true) {
			System.out.println(name);
		}
		
	
}
}
