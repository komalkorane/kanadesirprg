package com.prowings.array;

import java.util.Arrays;
//*
public class TwoToTwenty {

	public static void main(String[] args) {

		int a[] = new int[18];
		int j = 0;

		for (int i = 2; i <= 20; i++) {
			if (i % 2 == 0) {
				a[j] = i;
				j++;
			}
			if (i % 3 == 0 && i%2!=0 ) {
				a[j] = i;
				j++;
			}
		}
			System.out.println(Arrays.toString(a));

		}
	}