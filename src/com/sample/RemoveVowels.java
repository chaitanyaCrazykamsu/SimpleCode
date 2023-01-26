package com.sample;

import java.util.HashSet;

public class RemoveVowels {

	public static void main(String[] args) {
		isIsogram("moOse");
	}
	
	public static void isIsogram(String inp) {
		char[] inpCHar = inp.toLowerCase().toCharArray();
		HashSet<Character> characterSet = new HashSet<>();
		for(int i=0;i<inpCHar.length;i++) {
			characterSet.add(inpCHar[i]);
		}
		System.out.println(characterSet);
		boolean isIsogram = true;
		if(inpCHar.length != characterSet.size()) {
			isIsogram = false;
		}
		System.out.println(isIsogram);
	}
	public static String removeVowels(String inp) {
		
		return inp.replaceAll("[aeiouAEIOU]", "");
	}
}
