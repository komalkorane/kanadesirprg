package com.prowings.array;

import java.util.Arrays;

public class FindUnique {

	public static void main(String[] args) {

		int a[] = { 10, 30, 50, 10, 60, 30, 50, 40 };
		int b[] = new int[a.length];
		int s = 0;

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count == 0) {
				b[s] = a[i];
				s++;
			}
		}
		int d[] = new int[s];
		for (int i = 0; i < d.length; i++) {
			d[i] = b[i];
		}    	
		System.out.println(Arrays.toString(d));
	}
}