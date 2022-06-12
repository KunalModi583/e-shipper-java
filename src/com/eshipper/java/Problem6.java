package com.eshipper.java;

import java.util.Scanner;

/**
 * @author Kunal
 */
public class Problem6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter word : ");
		String word = sc.nextLine();
		int count = 0, len = word.length();
		for (int i = 0; i < len; i++) {
			char ch = word.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
				count = count + 1;
		}
		System.out.println(count + " vowels");
	}
}
