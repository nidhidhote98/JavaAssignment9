package com.psl.assign.nine.exceptions;

public class IncorrectValueCountException extends Exception {

	public IncorrectValueCountException() {
		// TODO Auto-generated constructor stub
	}

	public IncorrectValueCountException(int valu) {
		System.err.println("The number of values is " + valu + ". It should be 8.");
		// TODO Auto-generated constructor stub
	}

}
