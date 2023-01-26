package com.sample;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DateManipulation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String returnDate = sc.nextLine();
		
		String dueDate = sc.nextLine();
		List<Integer> returnDateList = Arrays.stream(returnDate.split(" ")).map(Integer::parseInt)
				.collect(Collectors.toList());
		
		List<Integer> dueDateList = Arrays.stream(dueDate.split(" ")).map(Integer::parseInt)
				.collect(Collectors.toList());
		int fine = 0;
		if (returnDateList.get(2) > dueDateList.get(2)) {
			fine = 10000;
		} else if (returnDateList.get(2).equals(dueDateList.get(2)) && returnDateList.get(1) > dueDateList.get(1)) {
			fine = 500 * (returnDateList.get(1)-dueDateList.get(1));
		}else if (returnDateList.get(2).equals(dueDateList.get(2)) && returnDateList.get(1).equals(dueDateList.get(1)) && returnDateList.get(0) > dueDateList.get(0)) {
			fine = 15 * (returnDateList.get(0)-dueDateList.get(0));
		}
		
		System.out.println(fine);
	}

}
