package edu.wmich.cs1120.LA4.Pvarner.Ccaudle;

public class NameFormatException extends Exception {

	private String name;

	public NameFormatException(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
