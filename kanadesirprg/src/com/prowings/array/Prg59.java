package com.prowings.array;

import java.util.Scanner;

public class Prg59 {

	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter any values :");
			int b = sc.nextInt();
			if (b > 500 && b < 600)
				break;
			a[i]=b;
		}
		for(int n: a)
		{
			System.out.println(n);
		}
	}

}
