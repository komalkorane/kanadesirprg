package com.prowings.array;
import java.util.*;
public class PallindromDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number :");
		int num = sc.nextInt();
		int num1 = num;
		int remainder = 0;
		int reverse = 0;

		while (num != 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		System.out.println("Reverse number is :" + reverse);

		if (reverse == num1) {
			System.out.println("The number is Pallindrom");
		} else
			System.out.println("The number is not a Pallindrom");
	}

}
