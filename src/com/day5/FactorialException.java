package com.day5;

public class FactorialException extends Exception {
	private static String message;

	public FactorialException(String messge) {
		super(message);
		
	}
}