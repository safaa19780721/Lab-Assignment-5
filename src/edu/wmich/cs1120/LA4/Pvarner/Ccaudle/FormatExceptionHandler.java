package edu.wmich.cs1120.LA4.Pvarner.Ccaudle;

import java.io.FileNotFoundException;

public class FormatExceptionHandler implements IFormatExceptionHandler {

	@Override
	public void handleFileNotFoundException(FileNotFoundException e) {
		System.out.println("Error, File Not Found. Please Try again.");		
	}

	@Override
	public void handlePhoneNumberFormatException(PhoneNumberFormatException e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleEmailFormatException(EmailAddressFormatException e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleNameFormatException(NameFormatException e) {
		
		String name = e.getName();
		
		char temp[] = new char[name.length()];
		 
		 for(int i=0; i<name.length(); i++) {
				if(i==0) {
					
					
					temp[i] = Character.toUpperCase(name.charAt(i));
				}
				else {
					temp[i] = Character.toLowerCase(name.charAt(i));
				}
			}
		 
		 
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
		System.out.print(" ");
		
	}

}
