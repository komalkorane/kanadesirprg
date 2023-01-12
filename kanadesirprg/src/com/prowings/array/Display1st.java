package com.prowings.array;

import java.util.Arrays;

public class Display1st {

	public static void main(String[] args) {
		
		String s= "Programming Wings Pune Maharashtra" ;
		String s1[]=s.split(" ");
		System.out.println(Arrays.toString(s1));
		char c[]=new char[s1.length];
		
		for(int i=0;i<s1.length;i++) {
			c[i]=s1[i].charAt(0);
			
		} String s2=new String(c);
		 System.out.println(s2);
	}

}