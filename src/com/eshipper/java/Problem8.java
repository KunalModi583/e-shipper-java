package com.eshipper.java;

import java.util.Scanner;

/**
 * @author Kunal
 */
public class Problem8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter timeStamp : ");
		Long timeStamp = sc.nextLong();
		long year = 0;
		if (timeStamp > 31536000) {
			year = timeStamp / 31536000;
			timeStamp = timeStamp - (year * 31536000);
		}
		long days = timeStamp / 86400;
		timeStamp = timeStamp - (days * 86400);
		long hour = timeStamp / 3600;
		timeStamp = timeStamp - (hour * 3600);
		long minute = timeStamp / 60;
		timeStamp = timeStamp - (minute * 60);
		System.out.println(year + " year(s) " + days + " Days(s) " + hour + " Hour(s) " + minute + " minute(s) "
				+ timeStamp + " Second(s) ");
	}

}
