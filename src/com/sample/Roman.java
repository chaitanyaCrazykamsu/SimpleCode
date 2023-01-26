package com.sample;

import java.util.Arrays;

public class Roman {

	public static void main(String[] args) {
		System.out.println(convertRomanToInteger("XI"));
	}

	static int convertRomanToInteger(String roman) {
		char[] romanChars = roman.toCharArray();
		int finalOutput = 0;

		for (int i = 0; i < romanChars.length; i++) {
			if (i+1 <romanChars.length && getValueBasedOnRoman(String.valueOf(romanChars[i])) < getValueBasedOnRoman(
					String.valueOf(romanChars[i + 1]))) {
				finalOutput = finalOutput + (getValueBasedOnRoman(String.valueOf(romanChars[i+1]))- getValueBasedOnRoman(String.valueOf(romanChars[i])));
				i++;
			}else {
			finalOutput = finalOutput + getValueBasedOnRoman(String.valueOf(romanChars[i]));
			}

		}
		return finalOutput;
	}

	static int getValueBasedOnRoman(String roman) {
		int convertedValue= 0;
		switch (roman) {
		case "I":

			convertedValue=  1;
			break;
		case "V":

			convertedValue= 5;
			break;
		case "X":

			convertedValue= 10;
			break;
		case "L":

			convertedValue= 50;
			break;
		case "C":

			convertedValue= 100;
			break;
		case "D":

			convertedValue= 500;
			break;
		case "M":
			convertedValue= 1000;
			break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + roman);
		}
		return convertedValue;
	}
	
}
