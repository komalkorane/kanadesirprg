package com.prowings.array;

public class Prg63g {

	public static void main(String[] args) {
		int a[] = { 10, 25, 48, 62, 75, 83, 98, 86, 56, 45 };

		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 80 && a[i] <= 90) {
				System.out.println(a[i]);
			}
		}
	}

}
