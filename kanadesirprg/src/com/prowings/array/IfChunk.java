package com.prowings.array;

import java.util.*;
import java.util.Arrays;

public class IfChunk {

	public static void main(String[] args) {

		int a[] = { 6, 7, 8, 9, 10, 11 };

//		int b[]=Arrays.copyOfRange(a, 0, 2); //6 7
//		int c[]=Arrays.copyOfRange(a, 2, 4); //8 9
//		int d[]=Arrays.copyOfRange(a, a.length-2,a.length-1);//10
//		
//		System.out.println((Arrays.toString(b))+Arrays.toString(c)+Arrays.toString(d));// if chunk is 2

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter chunk size");
		int m = sc.nextInt();
//		int n=sc.nextInt();
//		int o=sc.nextInt();

		for (int i = 0; i < a.length;) {
			if (a.length - m >= i) {
				System.out.print(Arrays.toString(Arrays.copyOfRange(a, i, i + m)));
				i = i + m - 1;
			} else {
				System.out.println(Arrays.toString(Arrays.copyOfRange(a, i, i + a.length - i)));
				i = i + m - 1;
			}

		}
	}

}
