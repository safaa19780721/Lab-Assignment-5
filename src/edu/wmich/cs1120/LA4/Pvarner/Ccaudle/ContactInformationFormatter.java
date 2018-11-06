package edu.wmich.cs1120.LA4.Pvarner.Ccaudle;

import java.io.FileReader;
import java.util.Scanner;

public class ContactInformationFormatter implements IContactInformationFormatter {

	@Override
	public void readContactInformation(String[] filePaths) {
		// TODO Auto-generated method stub
		for(int i=0; i<filePaths.length; i++) {
			Scanner input = new Scanner(filePaths[i]);
		}
		
		
	}

	@Override
	public void formatContactInformation(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void formatEmail(String email) throws EmailAddressFormatException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void formatPhoneNumber(String phoneNumber) throws PhoneNumberFormatException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void formatName(String name) throws NameFormatException {
		// TODO Auto-generated method stub
		
	}
	
}
