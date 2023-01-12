package com.prowings.array;

import java.util.Arrays;

public class DisplayLast {

	public static void main(String[] args) {
		
		
		String s= "Programming Wings Pune Maharashtra" ;
		String s1[]=s.split(" ");
		char c[]=new char[s1.length];
		
		for(int i=0;i<s1.length;i++) {
			int x=s1[i].length();
//			System.out.println(x);
			c[i]=s1[i].charAt(x-1);
			
		} String s2=new String(c);
		
		 System.out.println(Arrays.toString(s1));
		 System.out.println(s2);
	}
}
