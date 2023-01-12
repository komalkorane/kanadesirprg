package com.prowings.array;

import java.util.Arrays;

public class Gmail {

	public static void main(String[] args) {

		String s[] = { "ABC@gmail.com", "XYZ@aql.com","PQR@gmail.com", "STU@gmail.com", "XYZ@yahoo.com","sdf@yahoo.com" };

		int g = 0;
		int y = 0;
		int a = 0;

		for (int i = 0; i < s.length; i++) {
			if (s[i].contains("gmail"))
				g++;
			if (s[i].contains("yahoo"))
				y++;
			if (s[i].contains("aql"))
				a++;
		}
		String sg[] = new String[g];
		String sy[] = new String[y];
		String sa[] = new String[a];
		
		g = 0;
		y = 0;
		a = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i].contains("gmail")) {
				sg[g] = s[i];
				g++;
			}
			if (s[i].contains("yahoo")) {
				sy[y] = s[i];
				y++;
			}
			if (s[i].contains("aql")) {
				sa[a] = s[i];
				a++;
			}
		}
		System.out.println(Arrays.toString(sg) + " Count is ->" + g);
		System.out.println(Arrays.toString(sy) + " Count is ->" + y);
		System.out.println(Arrays.toString(sa) + " Count is ->" + a);
	}
}