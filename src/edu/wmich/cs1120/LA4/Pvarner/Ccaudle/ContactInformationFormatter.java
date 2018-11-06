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
		
		for(int i=0; i<filePaths.length; i++) {
			temp = filePaths[i];
			div = temp.split(" ");
			try {
				formatName(div[0]);
			} catch (NameFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				formatPhoneNumber(div[1]);
			} catch (PhoneNumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				formatEmail(div[2]);
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
		// TODO Auto-generated method stub
		 char temp[] = new char[name.length()];
		for(int i=0; i<name.length(); i++) {
			if(i==0) {
				temp[i] = Character.toUpperCase(name.charAt(i));
			}
			else {
				temp[i] = Character.toLowerCase(name.charAt(i));
			}
		}
		for(int i=0; i<temp.length; i++) {
			System.out.print(temp[i]);
		}
		System.out.println();
	}
	
}
